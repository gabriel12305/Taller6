package ec.edu.espol;

public class Telegram implements NotificacionTelegram {

    @Override
    public void enviarTelegram() {
        System.out.println("Enviando desde Telegram");
    }

}
