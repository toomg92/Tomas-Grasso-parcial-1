public class Escritorios extends ProductosDeVenta{
    private Double alto;
    private Double ancho;

    public Escritorios() {
    }

    public Escritorios(int nroStock, String nombre, int precio, double alto, double ancho) {
        super(nroStock, nombre, precio);
        this.alto = alto;
        this.ancho = ancho;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return super.toString() + "Escritorios{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                '}';
    }

    @Override
    public double precioActualizado(double aumento, double precio) {
        return precio *(1+(aumento/100));
    }
}
