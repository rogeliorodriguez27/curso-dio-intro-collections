package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class ExercicioProposto01 {
    public static void main(String[] args) {
        List<Double> temperaturas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.print("Digite a temperatura: ");
            Double temperatura = scan.nextDouble();
            temperaturas.add(temperatura);

        }

        System.out.print("Calculando média semestral... ");

        Double media = temperaturas.stream().mapToDouble(Double::doubleValue).average().orElse(0d);
        System.out.printf("La temperatura media do semestre foi %f\n", media);
        System.out.print("Mostrando temperaturas superior á media:");

        temperaturas.stream().filter(t-> t>media).forEach(t-> System.out.printf("%f, ",t));

        String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho"};

        System.out.println("\n\nMeses das temperaturas acima da média: ");
        Iterator<Double> iterator = temperaturas.iterator();
        int i = 0;
        boolean encontrouTemperaturaAcimaDaMedia = false;
        while (iterator.hasNext()) {
            Double temp = iterator.next();
            if (temp > media) {
                encontrouTemperaturaAcimaDaMedia = true;
                System.out.printf("%d - %s: %.1f\n", i + 1, meses[i], temp);
            }
            i++;
        }

        if (!encontrouTemperaturaAcimaDaMedia) {
            System.out.println("Não houve temperaturas acima da média.");
        }


    }}

