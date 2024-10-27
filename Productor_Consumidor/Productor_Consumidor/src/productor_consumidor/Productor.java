package productor_consumidor;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
class Productor implements Runnable {
    private Queue<Integer> cola;
    private final int LIMITE = 5; // Limite de tamaño de la cola
    private Random random = new Random();

    public Productor(Queue<Integer> cola) {
        this.cola = cola;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (cola) {
                // Espera si la cola está llena
                while (cola.size() == LIMITE) {
                    try {
                        cola.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // Generar un número aleatorio
                int numero = random.nextInt(100) + 1;
                System.out.println("Productor genera: " + numero);
                cola.add(numero);
                // Notifica al consumidor que hay un número disponible
                cola.notify();
            }
            try {
                // Simulación de tiempo de espera
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
