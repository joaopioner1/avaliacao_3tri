package entities;

public class Motocicleta extends Veiculo {
    //Author: Joao Vitor Souza Pioner & Vitor Sehn
    //Atributos
    private boolean temGarupa;
    private final String cilindrada;

    //Construtor
    public Motocicleta(String marca, String cor, String cilindrada,
    String placa) {
        super(cor, placa, marca);
        this.cilindrada = cilindrada;
        this.temGarupa = false;
    }

    //Getters
    public String getCilindrada() {
        return this.cilindrada;
    }

    public boolean isTemGarupa() {
        return this.temGarupa;
    }

    //Metodinhos
    public void addGarupa() {
        if (!this.temGarupa) {
            this.temGarupa = true;
        }
    }
}
