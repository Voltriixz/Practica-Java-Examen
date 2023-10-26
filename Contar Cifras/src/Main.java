//import javax.swing.*;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        int numero = Integer.parseInt(JOptionPane.showInputDialog(("Introduce un número entero de hasta 5 cifras:")));
//
//        // Convertir a positivo si es negativo
//        numero = Math.abs(numero);
//
//        if (numero > -10000) {
//            JOptionPane.showMessageDialog(null,"El número tiene 5 cifras.");
//        } else if (numero > -1000){
//            JOptionPane.showMessageDialog(null,"El número tiene 4 cifras.");
//        } else if (numero > 100) {
//            JOptionPane.showMessageDialog(null,"El número tiene 2 cifras.");
//        } else if (numero > 10) {
//            JOptionPane.showMessageDialog(null,"El número tiene 2 cifras.");
//        } else if (numero == 0) {
//            JOptionPane.showMessageDialog(null,"El número tiene 0 cifras.");
//        } else if (numero < 10) {
//            JOptionPane.showMessageDialog(null,"El número tiene 1 cifra.");
//        } else if (numero < 100) {
//            JOptionPane.showMessageDialog(null,"El número tiene 2 cifras.");
//        } else if (numero < 1000) {
//            JOptionPane.showMessageDialog(null,"El número tiene 3 cifras.");
//        } else if (numero < 10000) {
//            JOptionPane.showMessageDialog(null,"El número tiene 4 cifras.");
//        } else{
//            JOptionPane.showMessageDialog(null,"El número tiene 5 cifras.");
//        }
//    }
//}
//
