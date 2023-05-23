package Ejercicio3;

public class Bicicleta {
    String tipo;
    int marchas;
    public void establecerTipos(String miTipo){
        tipo=miTipo;
    }
    public void establecerMarcha(int misMarchas){
        marchas=misMarchas;
    }
    //obtener o getters
    public String obtenerTipo(){
        return=tipo;
    }
    public int obtenerMarchas(){
        return =marchas;
    }

    public void imprimirTipo(){
        System.out.println("Tipo: "+tipo);

    }

    public void imprimirMarchas(){
        System.out.println("Marchas: "+marchas);
    }
}
