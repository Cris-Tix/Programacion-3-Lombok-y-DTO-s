package prog3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto(1," Aceite", 25.99, " Panlulu S.A.");
        Producto producto2 = new Producto(2, " Jabon", 10.69, " Rexona");

        ProductoDTO proDto1 = new ProductoDTO();
        proDto1.setCodigo(10);
        proDto1.setNombre(" Leche");
        proDto1.setPrecio(40.55);
        ProductoDTO proDto2 = new ProductoDTO();
        proDto2.setCodigo(11);
        proDto2.setNombre(" Shampoo");
        proDto2.setPrecio(19.89);
        //transporto datos entre capas con el fromProducto
        ProductoDTO prod3 = ProductoDTO.fromProducto(producto1);
        ProductoDTO prod4 = ProductoDTO.fromProducto(producto2);
        //Creo la lista y agrego los productos dto
        List<ProductoDTO> lista = new ArrayList<>();
        lista.add(proDto1);
        lista.add(proDto2);
        lista.add(prod3);
        lista.add(prod4);
        for(ProductoDTO i: lista){//impresion de la lista con los productosDTO
            System.out.println(i);
        }
    }
}