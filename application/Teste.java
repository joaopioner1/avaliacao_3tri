package application;

import entities.Carro;
import entities.Cliente;
import entities.Veiculo;

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
        car1.setAlugado(true);
        System.out.println(car1.isAlugado()==false);
        System.out.println(car1.mostraAptidao());
        System.out.println(car1);


    }
    static void printSeparador() {
        System.out.println("**************************************");
    }
}
