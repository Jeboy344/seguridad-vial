package org.example.classes;

public class Auto extends Vehiculo{

private Boolean tieneRuedaAux;

public Auto(Boolean tieneRuedaAux, Integer velocidadPropia){
    super(velocidadPropia);
    this.tieneRuedaAux = tieneRuedaAux;
    }
}
