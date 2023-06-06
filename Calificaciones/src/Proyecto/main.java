package Proyecto;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    static Scanner scanner = new java.util.Scanner(System.in);
    static int opcion = 0;

    public static void main(String[] args) {
        while (opcion != 3) {
            opcion = mostrarMenuPrincipal();
            switch (opcion) {
                case 1:
                    submenuAccion();
                    break;
                case 2:
                    submenuAventura();
                    break;
                case 3:
                    System.out.println("Saliendo del programa....");
                    break;
                default:
            }
        }

    }

    public static int mostrarMenuPrincipal() {
        System.out.println("CARTELERA DE PELICULAS");
        System.out.println("1.-ACCION");
        System.out.println("2.-AVENTURA");
        System.out.println("3.-Salir");
        System.out.println("Ingrese una opcion: ");
        opcion = scanner.nextInt();
        while (opcion < 1 || opcion > 3) {
            System.out.println("------------------------------------------");
            System.out.println("Ingrese una opcion valida");
            System.out.println("Ingrese la opcion: ");
            opcion = scanner.nextInt();

        }
        return opcion;
    }

    public static void submenuAccion() {
        //objetos de la clase Peliculas
        Peliculas peliculas1 = new Peliculas("JHONSON", "Frances", 2010, 120, "Oscar", "Leonardo DI caprio",
                "Pelicula de gran calidad y esceneraios");
        Peliculas peliculas2 = new Peliculas("ALBERTO", "Espaniol", 2020, 145, "Oscar", "Vin Duesel",
                "Pelicula con grandes tomas y funciones");
        int opcion;
        do {
            System.out.println("Detalles");
            System.out.println("1.-Detalles de la pelicula Dos rascacielos");
            System.out.println("2.-Detalles de la pelicula Muertes");
            System.out.println("3.-Volver al menu principal");
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();
            while (opcion < 1 || opcion > 3) {
                System.out.println("-----------------------------------------");
                System.out.println("Ingrese un opcion valida");
                System.out.println("-----------------------------------------");
                System.out.print("Digite la opcion: ");
                opcion = scanner.nextInt();
            }
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("DETALLES DE LA PELICULA DOS RASCACIELOS");
                        mostrarDetallesPelicula(peliculas1);
                        System.out.println("Deseas continuar en esta seccion 1--si o 2---no: ");
                        opcion = scanner.nextInt();

                    } while (opcion == 1);
                    break;
                case 2:
                    do {
                        System.out.println("DETALLES DE PELICULA MUERTES");
                        mostrarDetallesPelicula(peliculas2);
                        System.out.println("Deseas continuar en esta seccion 1--si o 2---no: ");
                        opcion = scanner.nextInt();

                    } while (opcion == 1);
                    break;
                case 3:
                    System.out.println("Volviendo al menu principal....");
                    break;
            }
        } while(opcion!=3);
    }
    public static void submenuAventura() {
        //objetos de la clase Peliculas
        Peliculas peliculas3 = new Peliculas("MARIANA", "Portugues", 2014, 120, "Oscar", "Leonardo DI caprio",
                "Pelicula de gran calidad y esceneraios");
        Peliculas peliculas4 = new Peliculas("MARIA", "CHINO", 2022, 145, "Oscar", "Vin Duesel",
                "Pelicula con grandes tomas y funciones");
        int opcion;
        do {
            System.out.println("Detalles");
            System.out.println("1.-Detalles de la pelicula AVENTUREROS");
            System.out.println("2.-Detalles de la pelicula AVENUTRA EPLIGROSA");
            System.out.println("3.-Volver al menu principal");
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();
            while (opcion < 1 || opcion > 3) {
                System.out.println("-----------------------------------------");
                System.out.println("Ingrese un opcion valida");
                System.out.println("-----------------------------------------");
                System.out.print("Digite la opcion: ");
                opcion = scanner.nextInt();
            }
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("DETALLES DE LA PELICULA AVENTUREROS");
                        mostrarDetallesPelicula(peliculas3);
                        System.out.println("Deseas continuar en esta seccion 1--si o 2---no: ");
                        opcion = scanner.nextInt();

                    } while (opcion == 1);
                    break;
                case 2:
                    do {
                        System.out.println("DETALLES DE PELICULA AVENTURA PELIGROSA");
                        mostrarDetallesPelicula(peliculas4);
                        System.out.println("Deseas continuar en esta seccion 1--si o 2---no: ");
                        opcion = scanner.nextInt();

                    } while (opcion == 1);
                    break;
                case 3:
                    System.out.println("Volviendo al menu principal....");
                    break;
            }
        } while(opcion!=3);
    }
    //Métodos para mostrar los detalles de las películas
    public static void mostrarDetallesPelicula(Peliculas pelicula) {
        System.out.println("\nDetalles de la película:");
        System.out.println("Director: " + pelicula.getDirector());
        System.out.println("Idioma: " + pelicula.getIdioma());
        System.out.println("Año: " + pelicula.getAnio());
        System.out.println("Duración: " + pelicula.getTiempo() + " minutos");
        System.out.println("Premios: " + pelicula.getPremios());
        System.out.println("Protagonista: " + pelicula.getProtagonista());
        System.out.println("Descripción: " + pelicula.getDescripcion());
    }


}
