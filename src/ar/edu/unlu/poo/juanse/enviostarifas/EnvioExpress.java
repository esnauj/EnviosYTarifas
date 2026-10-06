package ar.edu.unlu.poo.juanse.enviostarifas;

public class EnvioExpress extends Envio{
    private static final double TARIFA_POR_KM = 90.0;
    private static final double COSTO_DESPACHO = 500.0;

    public EnvioExpress(double peso, double distancia){
        super(peso, distancia);
    }

    @Override
    public double calcularCosto(){
        return (this.getDistanciaARecorrerKm() * TARIFA_POR_KM) + COSTO_DESPACHO;
    }
}
