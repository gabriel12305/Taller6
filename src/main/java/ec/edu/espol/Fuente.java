package ec.edu.espol;

public class Fuente extends ReporteDecorador{

    public Fuente(Reporte reporte) {
        super(reporte);
    }

    @Override
    public void crearReporte() {
        System.out.println("Nueva Fuente");
    }

}
