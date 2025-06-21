package ec.edu.espol;

public class GeneradorReportes {
    private static GeneradorReportes generadorReportes = new GeneradorReportes();

    public static GeneradorReportes getInstance(){
        return generadorReportes;
    }

    public void generarReporte(Reporte reporte){
        reporte.crearReporte();
    }
}
