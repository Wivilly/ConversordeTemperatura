package br.edu.ifsp.dmo.conversordetemperatura.model;

public class CelsiusStrategy implements ConversorTemperatura{
    private static CelsiusStrategy instace;

    private CelsiusStrategy(){}

    public static CelsiusStrategy getInstance(){

        if(instace == null){
            instace = new CelsiusStrategy();
        }
        return instace;
    }

    @Override
    public double converter(double temperatura){
        return (temperatura - 32) / 1.8;
    }
}
