package reto6_Refactorizado;

import java.util.Hashtable;

public class Banco {
    private Hashtable clientes = new Hashtable();

    public Hashtable getClientes() {
        return clientes;
    }

    public void setClientes(Hashtable clientes) {
        this.clientes = clientes;
    }
    
}
