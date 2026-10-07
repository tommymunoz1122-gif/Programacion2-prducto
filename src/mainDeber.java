public class mainDeber {

    public static void main(String[] args) {
        Producto producto1 = new Producto();
        Producto producto2 = new Producto();

        producto1.nombre = "Macbook Air";
        producto1.precio = 1000.00;
        producto1.categoria = "Tecnología";

        producto2.nombre = "iPhone 17 pro max";
        producto2.precio = 1150.00;
        producto2.categoria = "Smartphone";

        System.out.println("PRODUCTO 1");
        producto1.mostrarInformacion();

        System.out.println();

        System.out.println("PRODUCTO 2");
        producto2.mostrarInformacion();

        System.out.println();

        producto1.mostrarCategoria();
        producto2.mostrarCategoria();

        System.out.println();

        producto1.mostrarPrecio();
        producto2.mostrarPrecio();

        System.out.println();

        System.out.println("DESPUÉS DE MODIFICAR EL PRODUCTO 1");

        producto1.precio = 900.00;

        producto1.mostrarInformacion();
        producto2.mostrarInformacion();
    }

}