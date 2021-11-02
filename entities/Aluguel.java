package entities;

import java.time.Duration;
import java.time.LocalDate;

public class Aluguel {
    //Author: Joao Vitor Souza Pioner & Vitor Sehn
    //Atributos
    private static double valorHoraCarro = 20;
    private static double valorHoraMoto = 10;

    private final LocalDate dataRetirado; //Data que o usuario aluga
    private final LocalDate dataDevolvido;

    //Construtor
    public Aluguel(LocalDate retirada, LocalDate dataDevolvido) {
        this.dataRetirado = retirada;
        this.dataDevolvido = dataDevolvido;
    }
    //Getters
    public LocalDate getDataRetirado() {
        return this.dataRetirado;
    }

    public LocalDate getDataDevolvido() {
        return this.dataDevolvido;
    }

    //Metodinhos
    public double calcAluguelCar() {
        int periodo = dataRetirado.getDayOfYear() - dataDevolvido.getDayOfYear();
        Duration duracao = Duration.ofDays(periodo);
        return duracao.toHours() * valorHoraCarro;
    }

    public double calcAluguelMoto() {
        int periodo = dataRetirado.getDayOfYear() - dataDevolvido.getDayOfYear();
        Duration duracao = Duration.ofDays(periodo);
        return duracao.toHours() * valorHoraMoto;
    }

    public void aluga(Carro car, Cliente cli) {
        if (car.isAlugado()==false && cli.isPossuiHabilitacao()) {
            car.setAlugado(true);
            ca
        }
    }

    public void aluga(Motocicleta mot) {

    }
}
