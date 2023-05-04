import java.util.Collections;
import java.util.List;
import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        ArrayList<ProductosDeVenta> prods = new ArrayList<>();
        //Instancio las Clases
        Sillas sil1 = new Sillas(1,"denver",150,true);
        Escritorios esc1 = new Escritorios(2,"alamo",200,1.5,2.3);
        Impresoras imp1= new Impresoras(3,"laserhp",300,"HP",15);
        Notebooks note1 = new Notebooks(4,"GamerACER",500,"ACER","500");
        //Agrego al arraylist
        prods.add(sil1);prods.add(esc1);prods.add(imp1);prods.add(note1);
        //Imprimo para mostrar que funciona el toString()
        System.out.println(prods.toString());
        //muestro el tipo de instancia
        for (ProductosDeVenta prod : prods){
            if(prod instanceof Sillas){
                System.out.println("es una silla");
            }else {if(prod instanceof Escritorios){
                System.out.println("es un escritorio");
            }else {if (prod instanceof Impresoras){
                System.out.println("es una impresora");
            }else {
                System.out.println("es una notebook");
            }
            }
            }
        }



        //descuentos
        double dto=15;
        double precioDescontado = sil1.realizardto(sil1.getPrecio(),dto);
        System.out.println("El precio descontado de la silla es:" + precioDescontado);
        double precioDescontado2 = imp1.realizardto(imp1.getPrecio(), dto);
        System.out.println("El precio descontado de la impresora es:"+precioDescontado2);

        double aumentoSillas =5; double aumentoEscritorio=10; double aumentoImpresora=15; double aumentoNotebook=20;

        for (ProductosDeVenta prod : prods){
            if(prod instanceof Sillas){
                System.out.println("precio viejo:" + prod.getPrecio());
                System.out.println("Precio nuevo: " + prod.precioActualizado(aumentoSillas,prod.getPrecio()));
            }else {if(prod instanceof Escritorios){
                System.out.println("precio viejo:" + prod.getPrecio());
                System.out.println("Precio nuevo:" + prod.precioActualizado(aumentoEscritorio,prod.getPrecio()));
            }else {if (prod instanceof Impresoras){
                System.out.println("Precio viejo:" + prod.getPrecio());
                System.out.println("Precio nuevo:" + prod.precioActualizado(aumentoImpresora,prod.getPrecio()));
            }else {
                System.out.println("Precio viejo:" + prod.getPrecio());
                System.out.println("Precio nuevo:" + prod.precioActualizado(aumentoNotebook,prod.getPrecio()));
            }
            }
            }
        }








    }
}