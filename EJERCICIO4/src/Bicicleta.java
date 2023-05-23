public class Bicicleta {
    String tipo;
    int marchas;
    public void establecerTipos(String miTipo){
        tipo=miTipo;
    }
    public void establecerMarchas(int misMarchas){
        marchas=misMarchas;
    }
    //obtener o getters
    public String obtenerTipo(){
        return tipo;
    }
    public int obtenerMarchas(){
        System.out.print("Marchas de bicicleta: ");
        return marchas;
    }

    public void imprimirTipo(){

        System.out.println("Tipo: "+tipo);

    }

    public void imprimirMarchas(){
        System.out.println("Marchas: "+marchas);
    }

}
