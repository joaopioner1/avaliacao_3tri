package entities;

import java.time.Duration;
import java.time.LocalDate;

public class Aluguel {
    //Author: Joao Vitor Souza Pioner & Vitor Sehn
    //Atributos
    private static double valorHoraCarro = 20;
    private static double valorHoraMoto = 10;

    //Construtor
    public Aluguel() {
    }

    //Metodinhos
    public double calcAluguelCar(Carro c) {
        int periodo = c.getDataDevolvido().getDayOfYear() - c.getDataRetirado().getDayOfYear();
        Duration duracao = Duration.ofDays(periodo);
        return duracao.toHours() * valorHoraCarro;
    }

    public double calcAluguelMoto(Motocicleta m) {
        int periodo = m.getDataDevolvido().getDayOfYear() - m.getDataRetirado().getDayOfYear();
        Duration duracao = Duration.ofDays(periodo);
        return duracao.toHours() * valorHoraMoto;
    }

    public boolean aluga(Carro car, Cliente cli, Registro r) {
        if (car.isAlugado()==false && cli.isPossuiHabilitacao()) {
            car.setAlugado(true);
            r.addCliente(cli);
            cli.addVeiculo(car);
            return true;
        }
        else return false;
    }

    public boolean aluga(Motocicleta mot, Cliente cli, Registro r) {
        if (mot.isAlugado()==false && cli.isPossuiHabilitacao()) {
            mot.setAlugado(true);
            cli.addVeiculo(mot);
            r.addCliente(cli);
            return true;
        }
        else return false;
    }
}
