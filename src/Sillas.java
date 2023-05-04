public class Sillas extends ProductosDeVenta implements Descuento {
    private Boolean ruedas;

    public Sillas() {
    }

    public Sillas(Integer nroStock, String nombre, Integer precio, Boolean ruedas) {
        super(nroStock, nombre, precio);
        this.ruedas = ruedas;
    }

    public Boolean getRuedas() {
        return ruedas;
    }

    public void setRuedas(Boolean ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return super.toString() + "Sillas{" +
                "ruedas=" + ruedas +
                '}';
    }

    @Override
    public double realizardto(int precio, double dto) {
        return precio *(1-(dto/100));
    }

    @Override
    public double precioActualizado(double aumento, double precio) {
        return precio *(1+(aumento/100));
    }
}
