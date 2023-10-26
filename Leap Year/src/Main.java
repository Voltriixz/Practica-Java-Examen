import javax.swing.*;
import java.time.*;

public class Main {
    public static void main(String[] args) {

        int year = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un año"));

        boolean esBisiesto1 = Year.of(year).isLeap();

        if (esBisiesto1) {
            JOptionPane.showMessageDialog(null, year + " es un año bisiesto, si puedes añadir el 29 de Febrero");
        } else {
            JOptionPane.showMessageDialog(null, year + " no es un año bisiesto por lo que no puedes.");
        }

    }
}