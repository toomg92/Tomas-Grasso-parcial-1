public class Notebooks extends ProductosInformaticos{
    private String memoria;

    public Notebooks() {
    }

    public Notebooks(Integer nroStock, String nombre, Integer precio, String fabricante, String memoria) {
        super(nroStock, nombre, precio, fabricante);
        this.memoria = memoria;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Notebooks{" +
                "memoria='" + memoria + '\'' +
                '}'+super.toString();
    }

    @Override
    public double precioActualizado(double aumento, double precio) {
        return precio *(1+(aumento/100));
    }
}
