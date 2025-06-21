package ec.edu.espol;

public class CreadorReporteWord extends Creador{

    @Override
    public Reporte creador() {
        return new ReporteWord();
    }

}
