public class ProductosInformaticos extends ProductosDeVenta{
    private String fabricante;

    public ProductosInformaticos() {
    }

    public ProductosInformaticos(Integer nroStock, String nombre, Integer precio, String fabricante) {
        super(nroStock, nombre, precio);
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return super.toString() + "ProductosInformaticos{" +
                "fabricante='" + fabricante + '\'' +
                '}';
    }

    @Override
    public double precioActualizado(double aumento, double precio) {
        return 0;
    }
}
