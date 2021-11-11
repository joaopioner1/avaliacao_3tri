package application;

import entities.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TelaPrograma {

    public static void main(String[] args) {
        //Author: Joao Vitor Souza Pioner & Vitor Sehn
        Scanner scan = new Scanner(System.in);

        System.out.println("BEM-VINDO AO SISTEMA DE ALUGUEL DE VEICULOS PIONER");
        int resposta = -1;

        do {
            printMenu();
            System.out.println("Quer entrar na loja? ");
            resposta = scan.nextInt();
            if (resposta==0) break;
            System.out.print("Gostaria de ser nosso cliente (s/n)? ");
            char resp = scan.next().charAt(0);
            if (resp == 's') {
                System.out.println("INSIRA SEUS DADOS");
                System.out.print("Nome: ");
                String nomeCliente = scan.nextLine();
                scan.nextLine();
                System.out.print("Data Nascimento (MM/dd/YYYY): ");
                String data = scan.next();
                LocalDate dataNascimento = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                System.out.print("CPF: ");
                String CPF = scan.next();
                Cliente cliente = new Cliente(nomeCliente, dataNascimento, CPF);
                Registro reg = new Registro();
                reg.addCliente(cliente);
                System.out.println("Voce possui carteira de motorista (S/N)? ");
                resp = scan.next().charAt(0);
                if (resp == 'S' && cliente.tiraCarteira()) {
                    printMenuVeiculos();
                    resp = scan.next().charAt(0);
                    switch (resp) {
                        case '1':
                            //String tipo, String marca, String placa, String cor, LocalDate retirada, LocalDate dataDevolvido
                            System.out.println("INFO CARRO");
                            System.out.print("Tipo: ");
                            String tipo = scan.next();
                            System.out.print("Marca: ");
                            String marca = scan.next();
                            System.out.print("Placa: ");
                            String placa = scan.next();
                            System.out.print("Cor: ");
                            String cor = scan.next();
                            System.out.print("Data retirada (DD/MM/YYYY): ");
                            String dataR = scan.next();
                            LocalDate dataRet = LocalDate.parse(dataR, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                            System.out.print("Data devolvido (DD/MM/YYYY): ");
                            String dataD = scan.next();
                            LocalDate dataDev = LocalDate.parse(dataD, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                            Aluguel alg = new Aluguel();
                            Carro carro = new Carro(tipo, marca, placa, cor, dataRet, dataDev);

                            System.out.printf("\n-----\nValor aluguel: %.2f", alg.calcAluguelCar(carro));
                            if (alg.aluga(carro, cliente, reg)) {
                                System.out.println("\nALUGUEL FINALIZADO COM SUCESSO!");
                            } else {
                                System.out.println("Ocorreu algum erro.");
                            }
                            break;
                        case '2':
                            System.out.print("Marca: ");
                            marca = scan.next();
                            System.out.print("Placa: ");
                            placa = scan.next();
                            System.out.print("Cor: ");
                            cor = scan.next();
                            System.out.print("Data retirada (DD/MM/YYYY): ");
                            dataR = scan.next();
                            dataRet = LocalDate.parse(dataR, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                            System.out.print("Data devolvido (DD/MM/YYYY): ");
                            dataD = scan.next();
                            dataDev = LocalDate.parse(dataD, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                            System.out.print("Cilindrada: ");
                            int cilindrada = scan.nextInt();

                            Aluguel algMot = new Aluguel();
                            Motocicleta moto = new Motocicleta(marca, cor, cilindrada, placa, dataRet, dataDev);

                            System.out.printf("\n-----\nValor aluguel: %.2f", algMot.calcAluguelMoto(moto));
                            if (algMot.aluga(moto, cliente, reg)) {
                                System.out.println("\nALUGUEL FINALIZADO COM SUCESSO!");
                            } else {
                                System.out.println("Ocorreu algum erro.");
                            }
                            break;
                    }
                }

            } else {
                System.out.println("Ate a proxima!");
                break;
            }
        } while((resposta!=0));
    }

    static void printMenu() {
        System.out.println("|== MENU ==|");
        System.out.println("0 - sair\n1 - entrar");
    }

    static void printMenuVeiculos() {
        System.out.println("Qual veiculo voce quer alugar? ");
        System.out.println("Digite 1 para CARRO\nDigite 2 para MOTOCICLETA");
    }
}
