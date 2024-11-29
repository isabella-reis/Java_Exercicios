package exercicios;

import java.util.Scanner;

public class Exercicio02 {

    private double num;

    public void lerUmNumero() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para descobrir se é par ou impar: ");
        this.num = scanner.nextDouble();

        scanner.close();
    }

    public void verificarSeEhParOuImpar () {
        if (num % 2 == 0) {
            System.out.println("Seu numero é par!");
        } else {
            System.out.println("Seu numero é impar!");
        }
    }


    public static void main(String[] args) {
        Exercicio02 parOuImpar = new Exercicio02();

        parOuImpar.lerUmNumero();
        parOuImpar.verificarSeEhParOuImpar();

    }
}
