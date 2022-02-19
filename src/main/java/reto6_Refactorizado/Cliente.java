package reto6_Refactorizado;

import java.util.ArrayList;

public class Cliente {
    private int cedula;
    private String nombre;
    private String pais;
    private String numeroContacto;
    private ArrayList<Articulo> articulos;

    public Cliente(int cedula, String nombre, String pais, String numeroContacto, ArrayList<Articulo> articulos) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.pais = pais;
        this.numeroContacto = numeroContacto;
        this.articulos = articulos;
    }

   

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(String numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }
    
    
}
