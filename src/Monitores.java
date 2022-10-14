public class Monitores extends Productos{
    String definicionMaxima;

    public Monitores(String modelo, String codigo, String marca, String definicionMaxima) {
        super(modelo, codigo, marca);
        this.definicionMaxima = definicionMaxima;
    }
}
