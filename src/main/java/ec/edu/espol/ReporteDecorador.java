package ec.edu.espol;

public abstract class ReporteDecorador implements Reporte {
    protected Reporte reporte;

    public ReporteDecorador(Reporte reporte){
        this.reporte = reporte;
    }

    public void generar(){
        reporte.crearReporte();
    }
}
