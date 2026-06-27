public class Main {
    public static void main(String[] args) {
        Laptop l1 = FabricaLaptop.crearLaptop("basico", "Lenovo", "IdeaPad", 2024, "Intel i3", 15.6);
        Laptop l2 = FabricaLaptop.crearLaptop("gamer", "ASUS", "TUF Gaming A15", 2025, "Ryzen 7", 15.6);
        Laptop l3 = FabricaLaptop.crearLaptop("profesional", "Apple", "MacBook Pro", 2026, "M3 Pro", 14.2);

        if (l1 != null) l1.ejecutarPrueba();
        if (l2 != null) l2.ejecutarPrueba();
        if (l3 != null) l3.ejecutarPrueba();
    }
}