import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int numeroMaquina = (int) (Math.random() * 101);
        int numeroJugador = 0;
        boolean correcto = false;
        int contador = 0;


        do {
            try {
                numeroJugador = Integer.parseInt(JOptionPane.showInputDialog("Intoduzca un numero"));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Introduce un numero valido");
            }


            if (numeroJugador == numeroMaquina) {
                JOptionPane.showMessageDialog(null, "Has acertado el numero");
                correcto = true;
            } else if (numeroJugador < numeroMaquina) {
                JOptionPane.showMessageDialog(null, "El numero introducido es mayor que el buscado");
            } else {
                JOptionPane.showMessageDialog(null, "El numero introducido es menor que el buscado");
            }
            contador += 1;
        } while (!correcto);

        JOptionPane.showMessageDialog(null, "Lo has conseguido en " + contador + " intentos");
    }
}