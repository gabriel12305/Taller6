package ec.edu.espol;

public class Estilo extends ReporteDecorador{

    public Estilo(Reporte reporte) {
        super(reporte);
    }

    @Override
    public void crearReporte() {
        System.out.println("Nuevo Estilo");
    }

}
