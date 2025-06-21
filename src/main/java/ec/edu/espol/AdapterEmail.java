package ec.edu.espol;

public class AdapterEmail implements Notificaciones{
    private Email email;

    public AdapterEmail(Email email){
        this.email = email;
    }

    @Override
    public void enviar() {
        email.enviarEmail();
    }

}
