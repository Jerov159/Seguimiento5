package Ejer5;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Turno> turnos = new ArrayList<>();

        turnos.add(new Turno(9, 13, "Limpieza de oficinas"));
        turnos.add(new Turno(14, 18, "Atención al cliente"));
        turnos.add(new Turno(19, 21, "Cierre de caja"));

        // Mostrar turnos utilizando JOptionPane
        String turnosString = "";
        for (Turno turno : turnos) {
            turnosString += turno.getHoraInicio() + " - " + turno.getHoraFin() + ": " + turno.toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, turnosString, "Turnos", JOptionPane.INFORMATION_MESSAGE);
    }
}
