package exercicios;

import java.util.Scanner;

public class Exercicio03 {

    private int num;
    private int totalFatorial = 1;

    public void lerUmNumero() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para ter seu fatorial.");
        this.num = scanner.nextInt();

        scanner.close();
    }

    public void calcularFatorial() {

        for (int i = 1; i <= num; i++) {
            if ( i != num) {
                System.out.print(" * " + i);
            } else {
                System.out.println(num);
            }
            totalFatorial = totalFatorial * i;
        }

        System.out.println("O fatorial de " + num + " é " + totalFatorial);

    }

    public static void main(String[] args) {
        Exercicio03 fatorial = new Exercicio03();

        fatorial.lerUmNumero();
        fatorial.calcularFatorial();
    }
}
