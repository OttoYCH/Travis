package edu.ucsd.cs110.temperature;

/**
 * Created by otto on 2/15/17.
 */
public class Celsius extends  Temperature {
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float v = ((this.getValue()*9)/5) + 32;
        return new Fahrenheit(v);
    }

    public String toString()
    {
        // TODO: Complete this method
        return this.getValue() + " C";
    }
}
