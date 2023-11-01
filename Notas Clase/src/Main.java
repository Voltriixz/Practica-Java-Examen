import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int nota;
        int aprobados = 0;
        int suspensos = 0;

        for (int i = 0; i < 30; i++) {
            do{
                nota = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la nota del alumno: "));

                if (nota >=5) {
                    aprobados += 1;
                }
                if (nota < 5 && nota > 0) {
                    suspensos += 1;
                }
            } while (nota < 0 && nota > 10);

        }

        JOptionPane.showMessageDialog(null, "El numero de alumnos aprobados es: " + aprobados);
        JOptionPane.showMessageDialog(null, "El numero de alumnos suspensos es " + suspensos);
    }
}