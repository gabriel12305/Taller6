package ec.edu.espol;

public class Email implements NotificacionEmail {
    @Override
    public void enviarEmail() {
        System.out.println("Enviando desde Email");
    }

}
