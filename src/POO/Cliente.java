package POO;

import java.util.ArrayList;
import java.util.Arrays;

public class Cliente {
    private String matricula;
    private String nome;
    private String email;


    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.matricula = gerarMatricula();
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String gerarMatricula () {
        StringBuilder matricula = new StringBuilder("BR");

        for (int i = 0; i <= 3; i++) {
            int digitos = ((int) (Math.random() * 10));
            matricula.append(digitos);
        }

        return matricula.toString();
    }

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Isabella", "123@gmail.com");
        Cliente cliente2 = new Cliente("Leonardo", "456@hotmail.com");
        Cliente cliente3 = new Cliente("Francisco", "789@outlook.com");

    }
}
