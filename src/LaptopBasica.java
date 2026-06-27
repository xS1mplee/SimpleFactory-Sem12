public class LaptopBasica extends Laptop{


    public LaptopBasica(String marca, String modelo, int anioFabricacion, String tipoProcesador, double tamanioPantalla) {
        super(marca, modelo, anioFabricacion, tipoProcesador, tamanioPantalla);
    }

    @Override
    public void ejecutarPrueba() {
        System.out.println("Se trata de una laptop para uso básico.");

    }
}
