public class menuPrincipal {
    public static void main(String[] args) {
        //Scanner entrada = new Scanner(System.in)
        //Instancias
        Bicicleta miBicicleta = new Bicicleta();
        Bicicleta tuBicicleta = new Bicicleta();
        Bicicleta nuestraBicicleta = new Bicicleta();
        // int temporal = entrada.nextInt();

        //TIPO1
        miBicicleta.establecerTipos("Bicicleta urbana");
        System.out.println(miBicicleta.obtenerTipo());
        //MARCHAS1
        miBicicleta.establecerMarchas(4);
        System.out.println(miBicicleta.obtenerMarchas());
        //TIPO2
        tuBicicleta.establecerTipos("Bicicleta de montania");
        System.out.println(tuBicicleta.obtenerTipo());
        //MARCHAS2
        tuBicicleta.establecerMarchas(7);
        System.out.println(tuBicicleta.obtenerMarchas());
        //TIPO3
        nuestraBicicleta.establecerTipos("Bicicleta de ruta");
        System.out.println(nuestraBicicleta.obtenerTipo());
        //MARCHAS3
        nuestraBicicleta.establecerMarchas(5);
        System.out.println(nuestraBicicleta.obtenerMarchas());
    }
}
