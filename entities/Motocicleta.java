package entities;

public class Motocicleta extends Veiculo {
    //Author: Joao Vitor Souza Pioner & Vitor Sehn
    //Atributos
    private boolean temGarupa;
    private final int cilindrada;

    //Construtor
    public Motocicleta(String marca, String cor, int cilindrada,
    String placa) {
        super(cor, placa, marca);
        this.cilindrada = cilindrada;
        this.temGarupa = false;
    }

    //Getters
    public int getCilindrada() {
        return this.cilindrada;
    }

    public boolean isTemGarupa() {
        return this.temGarupa;
    }

    //Metodinhos
    public boolean addGarupa() {
        if (!this.temGarupa) {
            return this.temGarupa = true;
        } else return false;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTem garupa: " + temGarupa + "\nCilindrada: " + cilindrada + "\n===========";
    }
}
