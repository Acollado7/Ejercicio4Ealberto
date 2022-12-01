package cafeteria;

public class Main {

        public static void main(String[] args) {
            Cafetera c = new Cafetera(1000, 500);
            Persona p = new Persona(20, "Juan");
            System.out.println("La cafetera tiene " + c.getCantidadActual() + " ml de cafe");
            System.out.println("La persona " + p.getNombre() + " rellena la cafetera");
            p.hacerCafe(c);
            System.out.println("------------------");
            System.out.println("La cafetera tiene " + c.getCantidadActual() + " ml de cafe");
            System.out.println("La persona " + p.getNombre() + " toma un cafe");
            p.tomarCafe(c);
            System.out.println("------------------");
            System.out.println("La cafetera tiene " + c.getCantidadActual() + " ml de cafe");
            System.out.println("------------------");
            System.out.println("La persona " + p.getNombre() + " sirve una taza de cafe");
            c.servirTaza(200);
            System.out.println("------------------");
            System.out.println("La cafetera tiene " + c.getCantidadActual() + " ml de cafe");
            System.out.println("------------------");
            System.out.println("La persona " + p.getNombre() + " vacia la cafetera");
            c.vaciarCafetera();
            System.out.println("------------------");
            System.out.println("La cafetera tiene " + c.getCantidadActual() + " ml de cafe");
            System.out.println("------------------");
            System.out.println("La persona " + p.getNombre() + " agrega cafe a la cafetera");
            c.agregarCafe(5100);
            System.out.println("------------------");
            System.out.println("La cafetera tiene " + c.getCantidadActual() + " ml de cafe");


        }
}
