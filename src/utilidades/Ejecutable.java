
package utilidades;

/**
 *Aplicaciçon para descuentos
 * 
 * @author Eduardo Barrasa
 * @version 1.0
 */
public class Ejecutable {

    /**
     * Método main clase principal
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Descuentos miCarrito = new Descuentos();

        miCarrito.aplicarDescuento(100, 5);

    }

}
