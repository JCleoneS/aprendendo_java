package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);   // Esse cara serve para que o usuário digite usando o " . " o inves da " , ".
        Scanner sc = new Scanner(System.in);  // Comando serve para ler/pegar o que o usuário está digitando.

        char texto;
        double quebrado;

        System.out.println("digite um número quebrado: ");
        quebrado = sc.nextDouble();


        // essa parte --> %.2f%n, fala pro sistema que eu quero que ele mostre com duas casas decimais
        // Lembrando que apra usar o --> %.2f%n tem de usar o printF e não o printLN
        System.out.printf("Você digitou: %.2f%n", quebrado);


        System.out.println("Digite um texto: ");
        texto = sc.next().charAt(0);

        System.out.println("A primeira letra do que você digitou é: " + texto);
    }
}