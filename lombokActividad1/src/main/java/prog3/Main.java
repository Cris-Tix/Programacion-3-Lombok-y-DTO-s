package prog3;

public class Main {
    public static void main(String[] args) {
        Persona per1 = new Persona();//instancio objetos con constructor vacio
        Persona per2 = new Persona("Cristian", 30);//instancio clase con constructor con parametros
        System.out.println("Viendo si el constructor vacio tiene nombre: " + per1.getNombre() + ", y edad: " + per1.getEdad());
        System.out.println("-----PROCEDO A INSTANCIARLE NOMBRE A per1-----");
        per1.setNombre("Micaela");//seteo datos al primer objeto
        System.out.println("Mi novia se llama " +per1.getNombre());
        System.out.println("-----PROCEDO A INSTANCIARLE EDAD A per1-----");
        per1.setEdad(27);//seteo edad al primer objeto
        System.out.println(per1.getNombre() + " tiene " + per1.getEdad() + " años.");
        System.out.println("Mi nombre es " + per2.getNombre() + " y tengo " + per2.getEdad() + " años.");
    }
}