package Ejer3;

import java.security.PublicKey;

public class Alumno {
    private String nombre;
    private int edad;
    private String curso;

    public Alumno(String nombre, int edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    public String getInfo(){
        return "Nombre del estudiante"+ this.nombre +"\n"+ "edad"+ this.edad +"\n"+ "curso"+ this.curso;
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

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
