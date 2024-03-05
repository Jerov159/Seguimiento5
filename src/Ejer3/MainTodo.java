package Ejer3;

import javax.swing.*;

public class MainTodo {
    public static void main(String[] args) {
        Libro libro = new Libro("Los tres cerditos","Joseph Jacobs", "32");
        JOptionPane.showMessageDialog(null,"Ejer3.Libro"+ "\n" +libro.Getinfo());
    }
}
