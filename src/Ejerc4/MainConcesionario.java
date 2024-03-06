package Ejerc4;

import javax.swing.*;

public class MainConcesionario {
    public static void main(String[] args) {
        Concesionario concesionario = new Concesionario("Mazda","Colombia Manizales, Carrera 15 calle 4", 200);
        System.out.println(concesionario.getInfo());

        concesionario.agregarCarro();
        System.out.println("Se han agregado");

        System.out.println(concesionario.getInfo());

        // Vender 20 carros del concesionario
        if (concesionario.venderCarro(20)) {
            System.out.println("Se han vendido 20 carros del concesionario.");
        } else {
            System.out.println("No se pudieron vender 20 carros del concesionario.");
        }
        JOptionPane.showMessageDialog(null, concesionario.getInfo(), "Información del concesionario", JOptionPane.INFORMATION_MESSAGE);}

}
