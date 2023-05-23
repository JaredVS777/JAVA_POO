package Ejercicio3;

import Ejercicio2.Bicicleta1;

import java.util.Scanner;

public class menuPrincipal {
    public static void main(String[] args) {
        //Scanner entrada = new Scanner(System.in)
        //Instancias
        Bicicleta miBicicleta = new Bicicleta();
        Bicicleta tuBicicleta = new Bicicleta();
        Bicicleta nuestraBicicleta = new Bicicleta();
        // int temporal = entrada.nextInt();
        miBicicleta.establecerMarchas(misMarchas: 5);
        tuBicicleta.establecerMarchas(misMarchas: 3);
        nuestraBicicleta.establecerMarchas(misMarchas: 4);

        System.out.println(miBicicleta.obtenerMarchas());
        System.out.println(tuBicicleta.obtenerMarchas());
        System.out.println(nuestraBicicleta.obtenerMarchas());


    }
}
