package cafeteria;

public class Persona {
    //Atributos : edad y nombre

    private int edad;

    private String nombre;

    //Constructor por defecto

    public Persona() {
        this.edad = 0;
        this.nombre = "";
    }

    //Constructor con parametros

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    //Metodos get y set

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodo toString


    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    //Añadimos dos metodos: el metodo hacer cafe que relle la cafetera c y el metodo tomar cafe que vacie la cafetera c

    public void hacerCafe(Cafetera c) {
        c.llenarCafetera();
    }

    public void tomarCafe(Cafetera c) {
        c.servirTaza(200);
    }


}
