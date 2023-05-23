import java.util.Scanner;

public class main {
    public static void main(String[] args) {//colocamos main y se pone automaticamente
        //Instancias
        //Clase-nombre de mi objeto=new
        Scanner scanner = new Scanner(System.in);
        Genero rock= new Genero("rock",
                "120bpm",
                1950,
                "EEUU",
                "Chuck Berry",
                "Festival de California" );
        Genero reguetton= new Genero("reguetton",
                "180bpm",
                1990,
                "Puerto Rico",
                "Don Omar",
                "Festival Urbanfest" );
        Genero trap= new Genero("trap",
                "200bpm",
                2010,
                "Argentina",
                "Duki",
                "Festival de Malvinas" );
        Genero salsa= new Genero("salsa",
                "250bpm",
                1950,
                "Colombia",
                "Alberto Barros",
                "Festival Tributo a la salsa" );
        Genero pasillo= new Genero("pasillo",
                "110bpm",
                1920,
                "Ecuador",
                "Julio Jaramillo",
                "Festival del Pasillo" );
        System.out.println(rock.getAnio());
        System.out.println(reguetton.getAnio());
        System.out.println(trap.getAnio());
        System.out.println(salsa.getAnio());
        System.out.println(pasillo.getAnio());
        //Cual es la sumatoria de los anios de los generos realizados
        System.out.println(rock.getAnio()+ reguetton.getAnio()+ trap.getAnio()+ salsa.getAnio()+ pasillo.getAnio());
        //set utilizamos para imprimir un nuevo valor diferente al que pusimos antes
        System.out.println("---------------------------------------------------------");
        rock.setAnio(1900);
        reguetton.setAnio(2002);
        trap.setAnio(2002);
        System.out.println(rock.getAnio());
        System.out.println(reguetton.getAnio());
        System.out.println(trap.getAnio());
        /*
        String gen_ritmo, gen_pais, gen_artista, gen_festival;
        int gen_anio;
        System.out.println("Ingrese el ritmo:");
        gen_ritmo=scanner.nextLine();
        System.out.println("Ingrese el pais:");
        gen_pais=scanner.nextLine();
        System.out.println("Ingrese el artista:");
        gen_artista=scanner.nextLine();
        System.out.println("Ingrese el anio: ");
        gen_anio=scanner.nextInt();
        System.out.println("Ingrese el festival:");
        gen_festival=scanner.nextLine();

        System.out.println("Ritmo: "+gen_ritmo);
        System.out.println("Pais:"+gen_pais);
        System.out.println("Artista:"+gen_artista);
        System.out.println("Anio:"+gen_anio);
        System.out.println("Festival:"+gen_festival);
        */

        salsa.imprimirDatos();
    }
}
