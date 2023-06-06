package Proyecto;

public class Peliculas {
    //Atributos
    String director;
    String idioma;
    int anio;
    int tiempo;
    String premios;
    String protagonista;
    String descripcion;

    //Constructor
    public Peliculas(String director, String idioma, int anio, int tiempo, String premios, String protagonista, String descripcion) {
        this.director = director;
        this.idioma = idioma;
        this.anio = anio;
        this.tiempo = tiempo;
        this.premios = premios;
        this.protagonista = protagonista;
        this.descripcion=descripcion;
    }

    //Metodos

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    //IDIOMA
    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    //ANIO

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    //TIEMPO

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    //PREMIOS
    public String getPremios() {
        return premios;
    }

    public void setPremios(String premios) {
        this.premios = premios;
    }
    //PROTAGONISTA
    public String getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(String protagonista) {
        this.protagonista = protagonista;
    }
    //DESCRIPCION

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
