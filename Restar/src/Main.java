import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo numero"));
        int resta;

        if (numero1 > numero2) {
            resta = numero1 - numero2;
        } else {
            resta = numero2 - numero1;
        }

        JOptionPane.showMessageDialog(null,"El resultado de la resta es " + resta);
    }
}