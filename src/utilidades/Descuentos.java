
package utilidades;

/**
 * Esta clase realiza las operaciones para los descuentos
 *
 * @author Eduardo Barrasa
 * 
 */
public class Descuentos {

    private static final int DESCUENTO_APLICADO = 5;
    
    
    /**
     * 
     * @param precioProducto Indica precio del producto
     * @param numProductos Indica el número de productos
     */
    public void aplicarDescuento(double precioProducto, int numProductos) {
        double total;
        if (numProductos > 3) {
            precioProducto -= DESCUENTO_APLICADO;
        }
        if (numProductos != 0) {
            total = precioProducto * 0.8;
            mostrarPorPantallaDescuentos(total);
        } else {
            total = precioProducto * 0.95;
            mostrarPorPantallaDescuentos(total);
        }

    }

    /**
     * éste método muestra un mensaje por consola
     * 
     * @param total Número total a mostrar
     * @see #aplicarDescuento(double, int) 
     */
    private void mostrarPorPantallaDescuentos(double total) {
        System.out.println("El total a pagar es:" + total);
        System.out.println("Enviado");
    }
}
