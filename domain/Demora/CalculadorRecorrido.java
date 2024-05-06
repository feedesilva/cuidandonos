package domain.Demora;

import java.util.List;

public class CalculadorRecorrido {

    private DistanceMatrixApi calculadorDistancia;

    Double tiempoDemora(Viaje viaje){
        Double demoraTotal = 0.0;
        List<Parada> paradas = viaje.paradas();
    
        for (int i = 0, i < paradas.size(); i++){
            demoraTotal += parada.tiempoDetencion:
        }

        return demoraTotal;
    }

    Double tiempoDemoraSegmento(Parada origen, Parada destino){

        Double demoraSegmento = viaje.tiempoEstimado + parada.tiempoDetencion;
        return demoraSegmento;
    }
}
