
package com.ah.aguilar_hernandez;


public class Usuario {
    
    private String nombre;
    private int edad;
    private float sueldo;
    private Direccion direccion;

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + ", direccion=" + direccion + '}';
    }

    public Usuario(String nombre, int edad, float sueldo, Direccion direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
        this.direccion = direccion;
    }

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}