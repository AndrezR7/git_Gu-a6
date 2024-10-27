
package call_center;

public class Llamada {
    private Telefono telefono;

    public Llamada(Telefono telefono) {
        this.telefono = telefono;
    }

    public void realizarLlamada(String nombrePersona) {
        System.out.println(nombrePersona + " esta llamando al numero " + telefono.getNumero ());
        try {
            // Simular el tiempo de la llamada
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("La llamada se corto.");
        }
        System.out.println("Llamada terminada por " + nombrePersona);
    }
}