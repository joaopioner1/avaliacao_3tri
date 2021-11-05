package entities;

public class Veiculo {
    //Author: Joao Vitor Souza Pioner & Vitor Sehn
    //Atributos
    private final String cor;
    private final String placa;
    private final String marca;
    private boolean abastecido;
    private boolean alugado;

    //Construtor
    public Veiculo(String cor, String placa, String marca) {
        this.marca = marca;
        this.cor = cor;
        this.placa = placa;
        this.abastecido = false;
        this.alugado = false;
    }

    //Getters
    public String getCor() {
        return this.cor;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getPlaca() {
        return this.placa;
    }

    public boolean isAbastecido() {
        return this.abastecido;
    }

    public boolean isAlugado() {
        return this.alugado;
    }

    public void setAlugado(boolean alug) {
        this.alugado = alug;
    }
    //Metodinhos

    public void abastecer() {
        if (!this.abastecido) {
            this.abastecido = true;
        }
    }

    public boolean andarComVeiculo() {
        if (this.abastecido)
            return true;
        else return false;
    }

    @Override
    public String toString() {
        return "\n=== Veiculo Info ==="
                + "\nCor: " + cor
                + "\nPlaca: " + placa
                + "\nMarca: " + marca
                + "\nEstá abastecido: " + abastecido
                + "\nEstá alugado: " + alugado;
    }
}
