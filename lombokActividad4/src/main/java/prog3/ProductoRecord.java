package prog3;

public record ProductoRecord(String codigo, String nombre, double precio) {
    //creo funcion para transportar capas
    public static ProductoRecord from(Producto p){
        if(p == null) return null;
        return new ProductoRecord(p.getCodigo(), p.getNombre(), p.getPrecio());
    }
}
