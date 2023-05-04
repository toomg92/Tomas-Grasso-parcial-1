public class Impresoras extends ProductosInformaticos implements Descuento{
    private Integer impPorMinuto;

    public Impresoras() {
    }

    public Impresoras(Integer nroStock, String nombre, Integer precio, String fabricante, Integer impPorMinuto) {
        super(nroStock, nombre, precio, fabricante);
        this.impPorMinuto = impPorMinuto;
    }

    public Integer getImpPorMinuto() {
        return impPorMinuto;
    }

    public void setImpPorMinuto(Integer impPorMinuto) {
        this.impPorMinuto = impPorMinuto;
    }

    @Override
    public String toString() {
        return "Impresoras{" +
                "impPorMinuto=" + impPorMinuto +
                '}' + super.toString();
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
