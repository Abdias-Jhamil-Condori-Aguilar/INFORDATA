import java.util.Date;

public class AltaTecnologia extends Productos{
    String paisOrigen;
    Date fechaFabricacion;

    public AltaTecnologia(String modelo, String codigo, String marca, String paisOrigen, Date fechaFabricacion) {
        super(modelo, codigo, marca);
        this.paisOrigen = paisOrigen;
        this.fechaFabricacion = fechaFabricacion;
    }
}
