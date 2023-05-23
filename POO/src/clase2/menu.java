package clase2;

public class menu {
    public static void main(String[] args) {
        //crear instancia llamada avion
        Transporte avion= new Transporte();
        avion.acelerar();
        avion.motor();
        avion.distancia();
        avion.disenio();
        System.out.println(avion.capacidad);
    }
}
