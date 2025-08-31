package prog3;

public class Main {
    public static void main(String[] args) {
        //instancio usuarios con patrón builder
        Usuario user1 = Usuario.builder().nombre(" Cristian").id( 30).email(" cris@gmail.com").build();
        System.out.println(user1);
        Usuario user2 = Usuario.builder().nombre(" Micaela").id( 27).email(" mica@gmail.com").build();
        System.out.println(user2);
    }
}