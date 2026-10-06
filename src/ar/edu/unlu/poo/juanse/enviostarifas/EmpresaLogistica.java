package ar.edu.unlu.poo.juanse.enviostarifas;

import java.util.ArrayList;
import java.util.List;

public class EmpresaLogistica {
    private List<Envio> envioList;

    public EmpresaLogistica(){
        this.envioList = new ArrayList<>();
    }

    public void agregarEnvio(Envio envio){
        if (envio == null){
            throw new IllegalArgumentException("El envio no puede ser null.");
        }
        this.envioList.add(envio);
    }

    public double calcularCostoTotal(){
        return envioList.stream()
                .mapToDouble(Envio::calcularCosto)
                .sum();
    }
}
