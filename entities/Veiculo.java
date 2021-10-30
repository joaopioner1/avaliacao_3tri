package entities;

public class Veiculo {
    //Author: Joao Vitor Souza Pioner & Vitor Sehn
    //Atributos
    private String cor;
    private final String placa;
    private final String marca;

    //Construtor
    public Veiculo(String cor, String placa, String marca) {
        //if (marca.equals("Mercedes") || marca.equals("Ford")
          //      || marca.equals("Fiat")) {
        this.marca = marca;
        this.cor = cor;
        this.placa = placa;
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

    //Metodinhos
    


}
