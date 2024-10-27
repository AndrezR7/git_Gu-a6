
package call_center;

public class Persona implements Runnable {
    private String nombre;
    private Llamada llamada;

    public Persona(String nombre, Llamada llamada) {
        this.nombre = nombre;
        this.llamada = llamada;
    }

    @Override
    public void run() {
        llamada.realizarLlamada(nombre);
    }
}