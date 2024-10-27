package productor_consumidor;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
class Consumidor implements Runnable {
    private Queue<Integer> cola;

    public Consumidor(Queue<Integer> cola) {
        this.cola = cola;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (cola) {
                // Espera si la cola está vacía
                while (cola.isEmpty()) {
                    try {
                        cola.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // Consumir el número
                int numero = cola.poll();
                int resultado = numero * 2;
                System.out.println("Consumidor procesa: " + numero + " * 2 = " + resultado);
                // Notifica al productor que puede generar más números
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