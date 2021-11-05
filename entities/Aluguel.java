package entities;

import java.time.Duration;
import java.time.LocalDate;

public class Aluguel {
    //Author: Joao Vitor Souza Pioner & Vitor Sehn
    //Atributos
    private static Registro registro = new Registro();

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
        int periodo = dataDevolvido.getDayOfYear() - dataRetirado.getDayOfYear() ;
        Duration duracao = Duration.ofDays(periodo);
        return duracao.toHours() * valorHoraCarro;
    }

    public double calcAluguelMoto() {
        int periodo = dataRetirado.getDayOfYear() - dataDevolvido.getDayOfYear();
        Duration duracao = Duration.ofDays(periodo);
        return duracao.toHours() * valorHoraMoto;
    }

    public boolean aluga(Carro car, Cliente cli) {
        if (car.isAlugado()==false && cli.isPossuiHabilitacao()) {
            car.setAlugado(true);
            cli.addVeiculo(car);
            registro.addCliente(cli);
            return true;
        }
        else return false;
    }

    public boolean aluga(Motocicleta mot, Cliente cli) {
        if (mot.isAlugado()==false && cli.isPossuiHabilitacao()) {
            mot.setAlugado(true);
            cli.addVeiculo(mot);
            registro.addCliente(cli);
            return true;
        }
        else return false;
    }
}
