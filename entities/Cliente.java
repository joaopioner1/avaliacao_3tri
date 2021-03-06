package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Cliente {
    //Author: Joao Vitor Souza Pioner & Vitor Sehn
    //Atributos
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private final String nome;
    private final LocalDate dataNascimento;
    private final String CPF;
    private boolean possuiHabilitacao;
    private String endereco;
    private String email;

    private ArrayList<Veiculo> listVeiculos;

    //Construtores
    public Cliente(String nome, LocalDate dataNascimento, String CPF) {
        this.dataNascimento = dataNascimento;
        this.CPF = CPF;
        this.nome = nome;
        this.possuiHabilitacao = false;
        listVeiculos = new ArrayList<>();
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
    public boolean tiraCarteira() {
        int age = LocalDate.now().getYear() - dataNascimento.getYear();
        if (this.possuiHabilitacao == false && age >= 18)
            return this.possuiHabilitacao = true;
        else return false;
    }

    public void addVeiculo(Veiculo vec) {
        listVeiculos.add(vec);
    }

    public void addVeiculo(Veiculo vec, int pos) {
        listVeiculos.add(pos, vec);
    }

    public void removeVeiculo(Veiculo vec) {
        this.listVeiculos.remove(vec);
    }

    public void removeVeiculo(int pos) {
        this.listVeiculos.remove(pos);
    }

    public int sizeListaVecAlugados() {
        return listVeiculos.size();
    }

    public ArrayList<Veiculo> getList() {
        return listVeiculos;
    }

    @Override
    public String toString() {
        String date = this.dataNascimento.format(formatter);
        return "---CLiente info---"
                + "\nNome: " + nome
                + "\nData de nascimento: " + date
                + "\nEndereco: " + endereco
                + "\nEmail: " + email
                + "\nCPF: " + CPF
                + "\nPossui habilitacao: " + possuiHabilitacao + "\n------------";
    }
}
