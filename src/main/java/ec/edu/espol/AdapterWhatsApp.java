package ec.edu.espol;

public class AdapterWhatsApp implements Notificaciones{
    private WhatsApp whatsApp;

    public AdapterWhatsApp(WhatsApp whatsApp){
        this.whatsApp = whatsApp;
    }

    @Override
    public void enviar() {
        whatsApp.enviarWhatsApp();
    }

}
