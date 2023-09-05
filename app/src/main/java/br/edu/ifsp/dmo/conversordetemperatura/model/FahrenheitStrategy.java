package br.edu.ifsp.dmo.conversordetemperatura.model;

public class FahrenheitStrategy implements ConversorTemperatura{
    private static FahrenheitStrategy instance;

    public FahrenheitStrategy(){}

    public static FahrenheitStrategy getIstance(){
        if(instance == null){
            instance = new FahrenheitStrategy();
        }
        return instance;
    }

    @Override
    public double converter(double temperatura){
        return 1.8 * temperatura + 32;
    }
}
