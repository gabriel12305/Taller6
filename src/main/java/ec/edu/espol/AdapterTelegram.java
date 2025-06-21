package ec.edu.espol;

public class AdapterTelegram implements Notificaciones{
    private Telegram telegram;

    public AdapterTelegram(Telegram telegram){
        this.telegram = telegram;
    }

    @Override
    public void enviar() {
        telegram.enviarTelegram();
    }

}
