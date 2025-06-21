package ec.edu.espol;

public class Color extends ReporteDecorador{

    public Color(Reporte reporte) {
        super(reporte);
    }

    @Override
    public void crearReporte() {
        System.out.println("Nuevo Color");
    }

}
