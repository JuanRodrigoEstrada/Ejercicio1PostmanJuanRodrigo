package com.bosonit.juanrodrigo;

public class Persona {
    private String nombre;
    private String ciudad;
    private int edad;

    public Persona(String nombre, String ciudad, int edad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.edad = edad;
    }


    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona edadmasuno(Persona persona){
        Persona personamasuno = new Persona(persona.getNombre(), persona.getCiudad(), persona.getEdad() + 1);
        return personamasuno;

    }

}
