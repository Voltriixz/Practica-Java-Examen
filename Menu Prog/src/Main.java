import javax.swing.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {


        int Menu;
        Menu = Integer.parseInt(JOptionPane.showInputDialog("Elige una opcion: \n 1. Calcular Edad \n 2. Numero Par y Primo \n 3. Palindromo \n 4. Salir"));
        switch (Menu) {
            case 1 -> calcularEdad();
            case 2 -> calcularParesPrimos();
            case 3 -> calcularPalindromo();
            case 4 -> JOptionPane.showMessageDialog(null, "El programa ha finalizado");
        }
    }

    private static void calcularEdad() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fechaDeNacimiento = LocalDate.parse(JOptionPane.showInputDialog("Introduzca su fecha de nacimiento"), formatter);

        // Fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Calcular la edad
        int edad = Period.between(fechaDeNacimiento, fechaActual).getYears();

        LocalDate proximoCumpleaños = fechaDeNacimiento.withYear(fechaActual.getYear());

        // Si el cumpleaños ya pasó este año, calcular el próximo cumpleaños para el próximo año
        if (proximoCumpleaños.isBefore(fechaActual) || proximoCumpleaños.isEqual(fechaActual)) {
            proximoCumpleaños = proximoCumpleaños.plusYears(1);
        }

        // Calcular los días restantes para el próximo cumpleaños
        long diasRestantes = ChronoUnit.DAYS.between(fechaActual, proximoCumpleaños);

        // Imprimir la edad
        JOptionPane.showMessageDialog(null,"La edad es " + edad + " y  para el proximo cumpleaños quedan " + diasRestantes + " dias.");
    }

    public static void calcularParesPrimos() {
        String numero1String = JOptionPane.showInputDialog("Introduce el primer número:");
        int numero1 = Integer.parseInt(numero1String);
        String numero2String = JOptionPane.showInputDialog("Introduce el segundo número:");
        int numero2 = Integer.parseInt(numero2String);

        StringBuilder result = new StringBuilder();
        for (int i = numero1; i <= numero2; i++) {
            result.append("Número: ").append(i).append(" - ");
            if (i % 2 == 0) {
                result.append("Es par ");
            } else {
                boolean esPrimo = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) {
                    result.append("No es par, pero es primo ");
                } else {
                    result.append("No es par ni primo ");
                }
            }
            result.append("\n");
        }

        JOptionPane.showMessageDialog(null, result.toString());
    }

    private static void calcularPalindromo() {
        String cadena = JOptionPane.showInputDialog("Introduce una palabra:");
        String reversed = new StringBuilder(cadena).reverse().toString();

        if (cadena.equalsIgnoreCase(reversed)) {
            JOptionPane.showMessageDialog(null, "La cadena es un palíndromo.");
        } else {
            JOptionPane.showMessageDialog(null, "La cadena no es un palíndromo.");
        }
    }
}