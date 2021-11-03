package application;

import entities.Cliente;

import java.time.LocalDate;

public class Teste {

    public static void main(String[] args) {
        //Author: Joao Vitor Souza Pioner & Vitor Sehn

        Cliente c1 = new Cliente("Joao", LocalDate.now(), "036.63.14");
        System.out.println(c1); //Testar o toString esta funcionando
        c1.tiraCarteira();
        System.out.println(c1.tiraCarteira()==true); //Nao conseguiu tirar carteira, pois nao eh velho suficiente
        System.out.println(c1);

        Cliente c2 = new Cliente("Claudio", LocalDate.of(2000, 5, 10), "477.150.236");
        System.out.println(c2); //Testar o toString esta funcionando
        c2.tiraCarteira();// conseguiu tirar carteira, pois eh velho suficiente
        System.out.println(c2);
        
    }
}
