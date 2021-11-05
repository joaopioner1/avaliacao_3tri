package application;

import entities.*;

import java.time.LocalDate;

public class Teste {

    public static void main(String[] args) {
        //Author: Joao Vitor Souza Pioner & Vitor Sehn

        Cliente c1 = new Cliente("Joao", LocalDate.now(), "036.63.148");
        System.out.println(c1); //Testar o toString esta funcionando
        c1.tiraCarteira();
        System.out.println(c1.tiraCarteira()==true); //Nao conseguiu tirar carteira, pois nao eh velho suficiente
        System.out.println(c1);

        c1.addVeiculo(new Carro("Sedan", "Mercedes", "22H1N1", "Preto"));
        c1.addVeiculo(new Carro("SUV", "TOYOTA", "53V58C", "Rosa"));
        c1.addVeiculo(new Carro("Caminhonete", "Ford", "74YG69", "Preto"));
        c1.addVeiculo(new Carro("Sedan", "Fiat", "2D2SE3", "Vermelho"));
        c1.addVeiculo(new Carro("Sedan", "BMW", "98C323", "Branco"));
        c1.addVeiculo(new Carro("SUV", "Mercedes", "22H1PP", "Branco"));

        System.out.println(c1.sizeListaVecAlugados()); //Mostra o tamanho
        System.out.println(c1.getList());
        c1.removeVeiculo(1);
        System.out.println(c1.getList());

        printSeparador();

        Cliente c2 = new Cliente("Claudio", LocalDate.of(2000, 5, 10), "477.150.236");
        System.out.println(c2); //Testar o toString esta funcionando
        System.out.println(c2.tiraCarteira()==true);
        c2.tiraCarteira();// conseguiu tirar carteira, pois eh velho suficiente
        System.out.println(c2);

        printSeparador();

        Carro car1 = new Carro("SUV","Toyota","12d9SD","Preto");
        System.out.println(car1.isAlugado()==false);
        System.out.println(car1.isAlugado()==true);
        System.out.println(car1.mostraAptidao());
        System.out.println(car1);

        printSeparador();

        Motocicleta mot1 = new Motocicleta("Honda","Vermelho",125,"12AD32");
        System.out.println(mot1);
        System.out.println(mot1.addGarupa()==true);
        System.out.println(mot1.isTemGarupa());
        System.out.println(mot1.addGarupa()==true); //Nao eh possivel add de novo, retorna falso
        System.out.println(mot1.andarComVeiculo()==true); //Nao anda pq nao tem gasosa
        System.out.println(mot1.abastecer()==true);
        System.out.println(mot1.andarComVeiculo()==true); //Anda pq esta abastecido

        printSeparador();

        Aluguel alg1 = new Aluguel(LocalDate.of(2021, 11, 5),LocalDate.of(2021, 11, 6));
        System.out.println(alg1.getDataRetirado());
        System.out.println(alg1.getDataDevolvido());
        System.out.println(alg1.aluga(car1, c2)==true); //Aluguei
        System.out.println(car1);
        System.out.println(alg1.aluga(car1, c2)==true); //Nao posso alugar o mesmo carro novamente

        Registro resg = new Registro();
        System.out.println(resg.getListaClientes());
    }
    static void printSeparador() {
        System.out.println("**************************************");
    }
}
