package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/
public class ExercicioProposto02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> respostas = new ArrayList<>();

        System.out.println("Responda as perguntas usando Sim ou não (S/N):");
        System.out.println("Telefonou para a vítima?");
        String opcao = scan.next();
        respostas.add(opcao);
        System.out.println("Esteve no local do crime?");
        opcao = scan.next();
        respostas.add(opcao);
        System.out.println("Mora perto da vítima?");
        opcao = scan.next();
        respostas.add(opcao);
        System.out.println("Devia para a vítima?");
        opcao = scan.next();
        respostas.add(opcao);
        System.out.println("Já trabalhou com a vítima?");
        opcao = scan.next();
        respostas.add(opcao);

        System.out.println("Clasificação:");

        int respostasPositivas = (int) respostas.stream().filter(resp-> resp.equalsIgnoreCase("S")).count();
        switch (respostasPositivas){
            case 2:
                System.out.println("Suspeita");
                break;
            case 3:
            case 4:
                System.out.println("Complice");
                break;
            case 5:
                System.out.println("Assassina");
                break;
            default:
                System.out.println("Inocente");
                break;
        }


    }
}
