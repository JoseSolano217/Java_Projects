package projects;

import java.io.Serializable;

public class Usuario implements Serializable {
    private int tipo;
    private String nombre;
    private String password;

    public Usuario() {
        this.tipo = 0;
        this.nombre = "";
        this.password = "";
    }

    public Usuario(int tipo, String nombre, String password) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.password = password;
    }

    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "nombre = '" + nombre + "'";
    }
}
