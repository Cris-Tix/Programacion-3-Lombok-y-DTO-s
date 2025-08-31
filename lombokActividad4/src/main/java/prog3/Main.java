package prog3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Producto prod1 = new Producto("1","aceite", "panlulu S.A.",15.99);
        Producto prod2 = new Producto("2", "jabon", "rexona", 20.45);
        Producto prod3 = new Producto("3", "papel higienico", "scott", 45.9);
        //
        ProductoRecord prod4 = ProductoRecord.from(prod1);
        ProductoRecord prod5 = ProductoRecord.from(prod2);
        ProductoRecord prod6 = ProductoRecord.from(prod3);
        //
        List<Producto> lista2 = new ArrayList<>();
        lista2.add(prod1);
        lista2.add(prod2);
        lista2.add(prod3);
        System.out.println("---LISTA DE PRODUCTOS---");
        for (Producto p: lista2){//impresion de productos con proveedor
            System.out.println(p);
        }
        List<ProductoRecord> lista = new ArrayList<>();
        lista.add(prod4);
        lista.add(prod5);
        lista.add(prod6);
        System.out.println("---LISTA DE PRODUCTOS RECORD---");
        for (ProductoRecord p: lista){//impresion de productos record, sin proveedor
            System.out.println(p);
        }
    }
}
