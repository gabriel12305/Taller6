package ec.edu.espol;

public class WhatsApp implements NotificacionWhatsApp{

    @Override
    public void enviarWhatsApp() {
        System.out.println("Enviando desde WhatsApp");
    }

}
