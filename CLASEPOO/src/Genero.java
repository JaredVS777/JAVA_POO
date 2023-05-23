public class Genero {
    //ATRIBUTOS
    String tipo;
    String ritmo;
    int anio;
    String pais;
    String artista;
    String festival;

    //constructores
    public Genero(String tipo, String ritmo, int anio, String pais, String artista, String festival) {
        this.tipo = tipo;//puntero a si mismo para optimizar espacio de memoria,todo lo que se utilice tomara el valor del parametro
        this.ritmo = ritmo;
        this.anio = anio;
        this.pais = pais;
        this.artista = artista;
        this.festival = festival;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getRitmo() {
        return ritmo;
    }

    public void setRitmo(String ritmo) {
        this.ritmo = ritmo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getFestival() {
        return festival;
    }

    public void setFestival(String festival) {
        this.festival = festival;
    }

    public void imprimirDatos(){
        System.out.println(this.tipo);
        System.out.println(this.ritmo);
        System.out.println(this.anio);
        System.out.println(this.pais);
        System.out.println(this.artista);
        System.out.println(this.festival);

    }
}
