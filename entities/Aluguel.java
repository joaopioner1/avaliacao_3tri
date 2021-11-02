package entities;

import java.time.LocalDate;

public class Aluguel {
    //Author: Joao Vitor Souza Pioner & Vitor Sehn
    //Atributos
    private static double valorHoraCarro = 20;
    private static double valorHoraMoto = 10;

    private final LocalDate dataRetirado; //Data que o usuario aluga
    private final LocalDate dataDevolvido;

    //Construtor
    public Aluguel(LocalDate retirada, LocalDate devolucao) {
        this.dataRetirado = retirada;
        this.dataDevolvido = devolucao;
    }
    //Getters
    public LocalDate getDataRetirado() {
        return this.dataRetirado;
    }

    public LocalDate getDataRetirado() {
        return this.dataRetirado;
    }
}
