import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Introduce un número real:");
        double number = Double.parseDouble(input);

        if (number == Math.round(number)) {
            JOptionPane.showMessageDialog(null, "El número no tiene parte fraccionaria.");
        } else {
            JOptionPane.showMessageDialog(null, "El número tiene parte fraccionaria.");
        }
    }
}
