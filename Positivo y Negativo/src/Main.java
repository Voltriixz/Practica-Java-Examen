import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero: "));

        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "El numero introducido es negativo");
        } else {
            JOptionPane.showMessageDialog(null, "El numero introducido es positivo");
        }
    }
}