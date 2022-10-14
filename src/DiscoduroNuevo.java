import java.util.Date;

public class DiscoduroNuevo extends AltaTecnologia{
    int capacidad;

    public DiscoduroNuevo(String modelo, String codigo, String marca, String paisOrigen, Date fechaFabricacion, int capacidad) {
        super(modelo, codigo, marca, paisOrigen, fechaFabricacion);
        this.capacidad = capacidad;
    }
}
