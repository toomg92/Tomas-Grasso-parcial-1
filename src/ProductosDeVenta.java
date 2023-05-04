
public abstract class ProductosDeVenta {
    private Integer nroStock;
    private String nombre;
    private Integer precio;

    public ProductosDeVenta() {
    }

    public ProductosDeVenta(Integer nroStock, String nombre, Integer precio) {
        this.nroStock = nroStock;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Integer getNroStock() {
        return nroStock;
    }

    public void setNroStock(Integer nroStock) {
        this.nroStock = nroStock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ProductosDeVenta{" +
                "nroStock=" + nroStock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    public abstract double precioActualizado(double aumento, double precio);
}
