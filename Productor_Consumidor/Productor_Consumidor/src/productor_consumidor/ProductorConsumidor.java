
package productor_consumidor;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProductorConsumidor {
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();

        // Crear hilos para el productor y el consumidor
        Thread productor = new Thread(new Productor(cola));
        Thread consumidor = new Thread(new Consumidor(cola));

        // Iniciar los hilos
        productor.start();
        consumidor.start();
    }
}