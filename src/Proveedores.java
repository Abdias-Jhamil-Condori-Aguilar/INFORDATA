import java.util.Date;
import java.util.List;

public class Proveedores {
    int inf;
    String direccion;
    Date fecha;
    int cantidadProductos;
    List<Productos> productos;

    public Proveedores(int inf, String direccion, Date fecha, int cantidadProductos, List<Productos> productos) {
        this.inf = inf;
        this.direccion = direccion;
        this.fecha = fecha;
        this.cantidadProductos = cantidadProductos;
        this.productos = productos;
    }
}

