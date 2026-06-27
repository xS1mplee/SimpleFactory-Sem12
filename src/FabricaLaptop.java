public class FabricaLaptop {
    public static Laptop crearLaptop(String tipo, String marca, String modelo, int anio, String procesador, double pantalla) {
        if (tipo == null) return null;

        switch (tipo.toLowerCase()) {
            case "basico":
                return new LaptopBasica(marca, modelo, anio, procesador, pantalla);
            case "gamer":
                return new LaptopGamer(marca, modelo, anio, procesador, pantalla);
            case "profesional":
                return new LaptopProfesional(marca, modelo, anio, procesador, pantalla);
            default:
                throw new IllegalArgumentException("Tipo de laptop desconocido: " + tipo);
        }
    }
}