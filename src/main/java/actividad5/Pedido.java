package actividad5;

import java.util.LinkedList;
import java.util.Queue;

public class Pedido {
    private int folio;
    private Queue<Producto> productos = new LinkedList();
    private double total;
    private boolean activo;
    private static int folios = 0;

    public Pedido() {
        this.folio = ++folios;
        this.total = 0.0;
        this.activo = true;
    }

    public void agregarProducto(Producto producto) {

        if (productos != null) {
            productos.add(producto);
            total += producto.getPrecio() * producto.getCantidad();
        } else {
            System.out.println("La cola de productos no está inicializada.");
        }
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public Queue<Producto> getProductos() {
        return productos;
    }

    public void setProductos(Queue<Producto> productos) {
        this.productos = productos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "folio=" + folio +
                ", productos=" + productos +
                ", total=" + total +
                '}';
    }
}
