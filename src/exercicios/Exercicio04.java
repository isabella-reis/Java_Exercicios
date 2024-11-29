package exercicios;

import java.util.Scanner;

public class Exercicio04 {

    private int num;

    private void lerUmNumero() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero para descobrir sua tabuada.");
        this.num = scanner.nextInt();

        scanner.close();
    }

    private void calcularTabuada() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }


    public static void main(String[] args) {
        Exercicio04 tabuada = new Exercicio04();

        tabuada.lerUmNumero();
        tabuada.calcularTabuada();

    }
}
