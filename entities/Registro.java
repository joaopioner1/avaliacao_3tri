package entities;

import java.util.ArrayList;

public class Registro {
    //Author: Joao Vitor Souza Pioner & Vitor Sehn

    private ArrayList<Cliente> listaClientes;

    public void addCliente(Cliente c) {
        this.listaClientes.add(c);
    }

    public void addCliente(int pos, Cliente c) {
        this.listaClientes.add(pos, c);
    }
}
