public class Persona {
    
    private String nombre;
    private int edad;
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void presentarse() {
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Ana", 25);
        persona1.presentarse();
    }
}