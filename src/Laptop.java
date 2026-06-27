public abstract class Laptop {

    protected String marca;
    protected  String modelo;
    protected int anioFabricacion;
    protected String tipoProcesador;
    protected double tamanioPantalla;

    public Laptop(String marca, String modelo, int anioFabricacion, String tipoProcesador, int tamanioPantalla {

        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.tipoProcesador = tipoProcesador;
        this.tamanioPantalla = tamanioPantalla;

    }

    public abstract void ejecutarPrueba(){

    }
}
