public class Alquiler {
    String nombre;
    int precioHora;
    String codigoProducto;
    Monitores monitores;
    DiscoDuro discoDuro;

    public Alquiler(String nombre, int precioHora, String codigoProducto, Monitores monitores, DiscoDuro discoDuro) {
        this.nombre = nombre;
        this.precioHora = precioHora;
        this.codigoProducto = codigoProducto;
        this.monitores = monitores;
        this.discoDuro = discoDuro;
    }
}
