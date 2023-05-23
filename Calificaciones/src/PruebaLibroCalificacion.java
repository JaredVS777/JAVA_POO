import java.util.Scanner;

public class PruebaLibroCalificacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones();
        System.out.println("Escriba el nombre del curso: ");
        String nombreDelCurso = entrada.nextLine();
        miLibroCalificaciones.establecerNombreDelCurso(nombreDelCurso);
        System.out.println();
        miLibroCalificaciones.mostrarMensaje();

    }
}
