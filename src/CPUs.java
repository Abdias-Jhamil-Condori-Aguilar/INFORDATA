public class CPUs extends Productos{
    Double memoriaPrincipal;

    public CPUs(String modelo, String codigo, String marca, Double memoriaPrincipal) {
        super(modelo, codigo, marca);
        this.memoriaPrincipal = memoriaPrincipal;
    }
}
