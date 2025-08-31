package prog3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Producto {
    private String codigo;
    private String nombre;
    private String proveedor;
    private double precio;

}
