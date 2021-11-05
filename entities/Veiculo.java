package entities;

import java.time.LocalDate;

public class Veiculo {
    //Author: Joao Vitor Souza Pioner & Vitor Sehn
    //Atributos
    private final String cor;
    private final String placa;
    private final String marca;
    private boolean abastecido;
    private boolean alugado;

    private final LocalDate dataRetirado; //Data que o usuario aluga
    private final LocalDate dataDevolvido;

    //Construtor
    public Veiculo(String cor, String placa, String marca, LocalDate retirada, LocalDate dataDevolvido) {
        this.marca = marca;
        this.cor = cor;
        this.placa = placa;
        this.abastecido = false;
        this.alugado = false;
        this.dataRetirado = retirada;
        this.dataDevolvido = dataDevolvido;
    }

    //Getters
    public String getCor() {
        return this.cor;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getPlaca() {
        return this.placa;
    }

    public boolean isAbastecido() {
        return this.abastecido;
    }

    public boolean isAlugado() {
        return this.alugado;
    }

    protected void setAlugado(boolean alug) {
        this.alugado = alug;
    }

    public LocalDate getDataRetirado() {
        return this.dataRetirado;
    }

    public LocalDate getDataDevolvido() {
        return this.dataDevolvido;
    }

    //Metodinhos

    public boolean abastecer() {
        if (!this.abastecido) {
            return this.abastecido = true;
        } return false;
    }

    public boolean andarComVeiculo() {
        if (this.abastecido)
            return true;
        else return false;
    }

    @Override
    public String toString() {
        return "\n=== Veiculo Info ==="
                + "\nCor: " + cor
                + "\nPlaca: " + placa
                + "\nMarca: " + marca
                + "\nEstá abastecido: " + abastecido
                + "\nEstá alugado: " + alugado;
    }
}
