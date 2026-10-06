package ar.edu.unlu.poo.juanse.enviostarifas;

public class EnvioInternacional extends EnvioEstandar{
    private final double tasaAduana;
    
    public EnvioInternacional(double peso, double distancia, double tasaAduana){
        super(peso, distancia);
        this.tasaAduana = tasaAduana;
    }

    @Override
    public double calcularCosto(){
        return super.calcularCosto() + tasaAduana;
    }
}
