package br.com.dio.collection.set;

import java.util.*;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/
public class ExercicioProposto02 {
    public static void main(String[] args) {

        Set<LinguagemFavorita> listaLinguagens = new LinkedHashSet<>();
        listaLinguagens.add(new LinguagemFavorita("java", 1991, "intellj")
                    );
        listaLinguagens.add(new LinguagemFavorita("python", 1994, "pycharm"));
        listaLinguagens.add(
                new LinguagemFavorita("c++", 1995, "visual studio")
        );

listaLinguagens.add(new LinguagemFavorita("java", 1991, "eclipse")
                    );
        listaLinguagens.add(new LinguagemFavorita("python", 1994, "notepad++"));
        listaLinguagens.add(
                new LinguagemFavorita("c#", 1991, "visual studio")
        );
listaLinguagens.add(
                new LinguagemFavorita("ruby", 1991, "visual studio")
        );


        System.out.println("Imprimindo por ordem de incerção: " + listaLinguagens);

        Set<LinguagemFavorita> linguagemFavoritaSet = new TreeSet<>(listaLinguagens);

        System.out.println("Imprimindo por ordem natural (nome): " + linguagemFavoritaSet);

        System.out.println("Imprimindo por ordem : IDE : ");

        listaLinguagens.stream().sorted(LinguagemFavorita::compareToIde).forEach(System.out::println);

        System.out.println("Imprimindo por ordem : Ano criação e nome : ");
        listaLinguagens.stream().sorted(LinguagemFavorita::compareToAnoENome).forEach(System.out::println);

        System.out.println("Imprimindo por ordem : Nome, Ano criação e IDE : ");
        listaLinguagens.stream().sorted(LinguagemFavorita::compareToNomeAnoIde).forEach(System.out::println);


    }  



    public static class  LinguagemFavorita implements Comparable<LinguagemFavorita>{

        private String nome;
        private  int anoCriacao;
        private String ide;

        public LinguagemFavorita(String nome, int anoCriacao, String ide) {
            this.nome = nome;
            this.anoCriacao = anoCriacao;
            this.ide = ide;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getAnoCriacao() {
            return anoCriacao;
        }

        public void setAnoCriacao(int anoCriacao) {
            this.anoCriacao = anoCriacao;
        }

        public String getIde() {
            return ide;
        }

        public void setIde(String ide) {
            this.ide = ide;
        }

        @Override
        public String toString() {
            return "LinguagemFavorita{" +
                    "nome='" + nome + '\'' +
                    ", ano de criação=" + anoCriacao +
                    ", ide='" + ide + '\'' +
                    '}';
        }


        @Override
        public int compareTo(LinguagemFavorita o) {
            return this.getNome().compareTo(o.getNome());

        }

        public int compareToIde(LinguagemFavorita o) {
            return this.getIde().compareTo(o.getIde());

        }
        public static int compareToAnoENome(LinguagemFavorita linguagemFavorita1, LinguagemFavorita linguagemFavorita2) {
           int compareAno = Integer.compare(linguagemFavorita1.getAnoCriacao(), (linguagemFavorita2.getAnoCriacao())) ;
            if (compareAno == 0){
                return linguagemFavorita1.getNome().compareTo(linguagemFavorita2.getNome());
            }return compareAno;

        }

        public static int compareToNomeAnoIde(LinguagemFavorita linguagemFavorita1, LinguagemFavorita linguagemFavorita2) {
            int compareNome = linguagemFavorita1.getNome().compareTo(linguagemFavorita2.getNome()) ;
            int compareAno = Integer.compare(linguagemFavorita1.getAnoCriacao(), (linguagemFavorita2.getAnoCriacao())) ;
            int compareIde = linguagemFavorita1.getIde().compareTo(linguagemFavorita2.getIde()) ;
            if (compareNome != 0){
                return compareNome;}
            if (compareAno == 0){
                return compareIde;
            }return compareIde;






            }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            LinguagemFavorita that = (LinguagemFavorita) o;
            return anoCriacao == that.anoCriacao && Objects.equals(nome, that.nome) && Objects.equals(ide, that.ide);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nome, anoCriacao, ide);
        }
    }}

