package ar.edu.unlu.poo.juanse.enviostarifas;

public abstract class Envio {
    private final double pesoKg;
    private final double distanciaARecorrerKm;

    public Envio(double peso, double distancia){
        this.pesoKg = peso;
        this.distanciaARecorrerKm = distancia;
    }

    protected double getPesoKg(){return this.pesoKg;}

    protected double getDistanciaARecorrerKm(){return this.distanciaARecorrerKm;}

    public abstract double calcularCosto();
}
