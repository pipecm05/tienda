package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {
        Producto producto = new Producto("leche", 100.0, TipoProducto.PERECEDEROS);
        double precioVenta = producto.calcularPrecioVenta();
        System.out.println("El precio de venta es: " + precioVenta);
    }
}

