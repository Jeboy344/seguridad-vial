package org.example.classes;

public class Moto extends Vehiculo{

    private Integer cantEspejos;

    private Boolean motoSegura;

    public Moto(Integer cantEspejos, Integer velocidadPropia){
        super(velocidadPropia);
        this.motoSegura = false;
        this.cantEspejos = cantEspejos;
    }

    public Boolean esSegura() {
        //Validar si una moto es segura
        return motoSegura;
    }
}
