package entities;

import java.util.ArrayList;

public class Registro {
    //Author: Joao Vitor Souza Pioner & Vitor Sehn

    private ArrayList<Cliente> listaClientes;

    public Registro() {
        listaClientes = new ArrayList<>();
    }

    public void addCliente(Cliente c) {
        this.listaClientes.add(c);
    }

    public void addCliente(int pos, Cliente c) {
        this.listaClientes.add(pos, c);
    }

    public void removeCliente(Cliente c) {
        this.listaClientes.remove(c);
    }

    public void removeCliente(int pos) {
        this.listaClientes.remove(pos);
    }

    public int getTotalClientes() {
        return this.listaClientes.size();
    }

    public ArrayList<Cliente> getListaClientes() {
        return this.listaClientes;
    }
}
