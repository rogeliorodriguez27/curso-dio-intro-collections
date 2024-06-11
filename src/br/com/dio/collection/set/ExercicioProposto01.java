package br.com.dio.collection.set;

import java.util.*;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
# vermelho, laranja, amarelo, verde, azul, azul marinho ( índigo ) e violeta
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */
public class ExercicioProposto01 {
    public static void main(String[] args) {

        Set<String> arcoIris = new LinkedHashSet<>(Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "indigo", "violeta"));

        System.out.println("Exibindo cores do arco-iris:");
        arcoIris.forEach(System.out::println);
        System.out.print("Quantidade de cores:" + arcoIris.size()+"\n");

        Set<String> arcoIrisMap = new TreeSet<>(arcoIris);
        System.out.println("Em orden alfabética: "+ arcoIrisMap);

        System.out.println("Mostrar em ordem inverso ao inicial: ");

        List<String> arcoIrisReverse = new ArrayList<>(arcoIris);
        Collections.reverse(arcoIrisReverse);
        System.out.println(arcoIrisReverse);

        Iterator<String> iterator = arcoIris.iterator();
        System.out.println(" Cores que começam com a letra v: ");
        while(iterator.hasNext()){
            String next = iterator.next();
            if (next.startsWith("v")){
                System.out.println(next);
            iterator.remove();}
        }
        System.out.println("Outros: ");
        System.out.println(arcoIris);

        arcoIris.clear();
        System.out.println("Conjunto vacio: " + arcoIris);

    }
}
