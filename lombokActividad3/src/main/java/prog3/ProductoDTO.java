package prog3;

public class ProductoDTO {
    private int codigo;
    private String nombre;
    private double precio;

    public ProductoDTO() {
    }

    public ProductoDTO(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ProductoDTO{" +
                "codigo = " + codigo +
                ", nombre = '" + nombre + '\'' +
                ", precio = " + precio +
                '}';
    }
    public static ProductoDTO fromProducto(Producto p){
        if (p == null) return null;
        return new ProductoDTO(p.getCodigo(), p.getNombre(), p.getPrecio());
    }
}
