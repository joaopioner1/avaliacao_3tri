package entities;

import java.time.LocalDate;

public class Cliente {
    //Author: Joao Vitor Souza Pioner & Vitor Sehn
    //Atributos
    private final String nome;
    private final LocalDate dataNascimento;
    private final String CPF;
    private boolean possuiHabilitacao;
    private String endereco;
    private String email;

    //Construtores
    public Cliente(String nome, LocalDate dataNascimento, String CPF) {
        this.dataNascimento = dataNascimento;
        this.CPF = CPF;
        this.nome = nome;
        this.possuiHabilitacao = false;
    }

    public Cliente(String nome, LocalDate dataNascimento, String CPF,
                   String email, String endereco) {
        this(nome, dataNascimento, CPF);
        this.email = email;
        this.endereco = endereco;
    }

    public Cliente(String nome, LocalDate dataNascimento, String CPF,
                   String email, String endereco, boolean possuiHabilitacao) {
        this(nome, dataNascimento, CPF, email, endereco);
        this.possuiHabilitacao = possuiHabilitacao;
    }

    //Getters
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public boolean isPossuiHabilitacao() {
        return possuiHabilitacao;
    }

    //Metodinhos
    public void tiraCarteira() {
        int age = dataNascimento.getYear() - LocalDate.now().getYear();
        if (this.possuiHabilitacao == false && age >= 18)
            this.possuiHabilitacao = true;
    }

    public void aluga(Carro car) {
        if (car.isAlugado()==false && this.possuiHabilitacao) {

        }
    }

    public void aluga(Motocicleta mot) {

    }
}
