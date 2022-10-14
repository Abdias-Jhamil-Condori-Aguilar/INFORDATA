import java.util.Date;

public class CPUsNuevos extends  AltaTecnologia{
    Double memoriaPrincipal;

    public CPUsNuevos(String modelo, String codigo, String marca, String paisOrigen, Date fechaFabricacion, Double memoriaPrincipal) {
        super(modelo, codigo, marca, paisOrigen, fechaFabricacion);
        this.memoriaPrincipal = memoriaPrincipal;
    }
}
