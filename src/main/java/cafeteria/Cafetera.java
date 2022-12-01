package cafeteria;

public class Cafetera {

    private int capacidadMaxima;

    private int cantidadActual;

    //Constructor prederterminado, sin parametros: establece la capacidad maxima en 1000
    // y la cantidad actual en 0 (Cafetera vacia)

    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    //Constructor que recibe solo la capacidad maxima de la cafetera; inicializa la cantidad actual de cafe
    // igual a la capacidad maxima (cafetera lleno)

    public Cafetera(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
    }

    //Constructor que recibe la capacidad maxima y la cantidad actual.Si la cantidad actual es mayor que la capacidad maxima,
    // se establece la cantidad actual igual a la capacidad maxima

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        if (cantidadActual > capacidadMaxima) {
            this.cantidadActual = capacidadMaxima;
        } else {
            this.cantidadActual = cantidadActual;
        }
    }

    //Metodos get y set

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    //Metodo llenarCafetera: le pone la cantidad maxima de cafe a la cafetera

    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
    }

    //Metodo servirTaza: recibe el tamaño de una taza vacia, y simula la accion de servir la taza con la capacidad indicada.
    // Si la cantidad actual de cafe "no alcanza" para llenar la taza, se sirve lo que quede.

    public void servirTaza(int tamanoTaza) {
        if (this.cantidadActual >= tamanoTaza) {
            this.cantidadActual -= tamanoTaza;
        } else {
            this.cantidadActual = 0;
        }
    }

    //Metodo vaciarCafetera: pone la cantidad de cafe actual en cero

    public void vaciarCafetera() {
        this.cantidadActual = 0;
    }

    //Metodo agregarCafe: recibe la cantidad de cafe a agregar a la cafetera. Si la cantidad excede la capacidad maxima,

    public void agregarCafe(int cantidad) {
        if (this.cantidadActual + cantidad > this.capacidadMaxima) {
            this.cantidadActual = this.capacidadMaxima;
            System.out.println("La cantidad de cafe que intenta agregar excede la capacidad maxima de la cafetera, añadiendo la cantidad maxima...");
        } else {
            this.cantidadActual += cantidad;
        }
    }
}
