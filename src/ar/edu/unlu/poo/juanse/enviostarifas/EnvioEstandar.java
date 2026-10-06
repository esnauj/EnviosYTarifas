package ar.edu.unlu.poo.juanse.enviostarifas;

public class EnvioEstandar extends Envio{
    private static final double TARIFA_POR_KM = 50.0;
    private static final double PESO_LIMITE_RECARGO = 10.0;
    private static final double FACTOR_RECARGO = 0.2;

    public EnvioEstandar(double peso, double distancia){
        super(peso, distancia);
    }

    @Override
    public double calcularCosto(){
        double subtotal = this.getDistanciaARecorrerKm() * TARIFA_POR_KM;
        if (this.getPesoKg() > PESO_LIMITE_RECARGO){
            subtotal += (subtotal * FACTOR_RECARGO);
        }
        return subtotal;
    }
}
