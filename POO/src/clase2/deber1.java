package clase2;
import java.util.Scanner;
import java.text.DecimalFormat;
public class deber1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        double[] notas = new double[5];
        double suma=0, promedio;
        System.out.println("Ingrese las 5 calificaciones ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota " + (i + 1) + "---> ");
            notas[i] = input.nextDouble();
        }

        for (int i = 0; i < 5; i++) {
            suma +=notas[i];
        }
        promedio = suma / 5;

        System.out.println("El promedio de las califcaciones ingresadas es: " + df.format(promedio));

    }
}
