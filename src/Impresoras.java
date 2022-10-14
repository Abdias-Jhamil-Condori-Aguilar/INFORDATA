public class Impresoras extends Productos{
    int velocidad;

    public Impresoras(String modelo, String codigo, String marca, int velocidad) {
        super(modelo, codigo, marca);
        this.velocidad = velocidad;
    }
}
