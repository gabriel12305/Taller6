package ec.edu.espol;

public class CreadorReporteExcel extends Creador{

    @Override
    public Reporte creador() {
        return new ReporteExcel();
    }

}
