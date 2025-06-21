package ec.edu.espol;

public class CorreoElectronico implements Notificaciones {

    @Override
    public void enviar() {
        System.out.println("Enviando desde Correo Electronico");
    }

}
