package entities;

public final class Carro extends Veiculo {
    //Author: Joao Vitor Souza Pioner & Vitor Sehn
    //Atributos
    private final String tipo;

    //Construtor
    public Carro(String tipo, String marca, String placa, String cor) {
        super(cor, placa, marca);
        this.tipo = tipo;
    }

    //Getters
    public String getTipo() {
        return this.tipo;
    }

    //Metodinhos
    public String mostraAptidao(Carro c) {
        switch(c.getTipo()) {
            case "SUV" :
                return "Carro para familia.";
            case "Caminhonete":
                return "Carro para trabalho.";
            case "Sedan" :
                return "Carro para solteiros casados.";
            default :
                return "Tipo n'ao classificado no programa.";
        }
    }
}
