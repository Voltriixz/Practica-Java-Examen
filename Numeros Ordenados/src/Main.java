import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int x = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer numero numero"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo numero"));
        int z = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el tercer numero"));

        if (x < y && y < z) {
            JOptionPane.showMessageDialog(null,"Los números están ordenados de menor a mayor.");

            if (x + 1 == y && y + 1 == z) {
                JOptionPane.showMessageDialog(null,"Los números también son consecutivos.");
            } else {
                JOptionPane.showMessageDialog(null,"Los números no son consecutivos.");
            }
        } else {
            JOptionPane.showMessageDialog(null,"Los números no están ordenados de menor a mayor.");
        }
    }
}
