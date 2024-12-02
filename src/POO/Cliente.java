package POO;

import java.util.ArrayList;
import java.util.Arrays;

public class Cliente {
    private String matricula;
    private String nome;
    private String email;
    private String cpf; // chave


    public Cliente(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.matricula = gerarMatricula();
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCpf() {
        return cpf;
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
}
