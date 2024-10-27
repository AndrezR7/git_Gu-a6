
package call_center;
public class CallCenter {

    public static void main(String[] args) {
        
        Telefono telefono1 = new Telefono("463-1234");
        Telefono telefono2 = new Telefono("298-5678");
        Telefono telefono3 = new Telefono("375-9000");

        Llamada llamada1 = new Llamada(telefono1);
        Llamada llamada2 = new Llamada(telefono2);
        Llamada llamada3 = new Llamada(telefono3);

        Persona persona1 = new Persona("Juan", llamada1);
        Persona persona2 = new Persona("Ana", llamada2);
        Persona persona3 = new Persona("Luis", llamada3);

        Thread hilo1 = new Thread(persona1);
        Thread hilo2 = new Thread(persona2);
        Thread hilo3 = new Thread(persona3);
       
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}

