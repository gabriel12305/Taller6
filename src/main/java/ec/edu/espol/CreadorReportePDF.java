package ec.edu.espol;

public class CreadorReportePDF extends Creador{

    @Override
    public Reporte creador() {
        return new ReportePdf();
    }

}
