import java.util.Date;

public class Cliente {
    String nombre;
    String dni;
    int telefono;
    ServicioTecnico impresoras;
    Date fechaAdquision;
    Double totalFactura;

    public Cliente(String nombre, String dni, int telefono, ServicioTecnico impresoras, Date fechaAdquision, Double totalFactura) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.impresoras = impresoras;
        this.fechaAdquision = fechaAdquision;
        this.totalFactura = totalFactura;
    }
}
