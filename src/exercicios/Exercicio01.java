package exercicios;

import java.util.Scanner;

public class Exercicio01 {

    private double num1;
    private double num2;
    private int operacao;

    public void lerDoisNumerosEOperacao () {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero 1: ");
        this.num1 = entrada.nextDouble();

        System.out.println("Digite o numero 2: ");
        this.num2 = entrada.nextDouble();

        System.out.println("Escolha sua operacao:\n1) Adicao\n2) Subtracao\n3) Multiplicacao\n4) Divisao");
        this.operacao = entrada.nextInt();

        // Adicionar tratamento caso entrada seja inválida para impedir que o programa quebre.

        entrada.close();
    }

    public void realizarOperacoes() {
        double resultado = 0;

        switch (operacao) {
            case 1:
                resultado = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + resultado);
                break;

            case 2:
                resultado = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + resultado);
                break;

            case 3:
                resultado = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + resultado);
                break;

            case 4:
                resultado = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + resultado);
                break;

                // Adicionar tratamento caso divisão por zero


            default:
                System.out.println("Ops! Verifique e tente novamente.");
                break;

        }
    }


    public static void main(String[] args) {
        Exercicio01 calculadora = new Exercicio01();

        calculadora.lerDoisNumerosEOperacao();
        calculadora.realizarOperacoes();

    }
}
