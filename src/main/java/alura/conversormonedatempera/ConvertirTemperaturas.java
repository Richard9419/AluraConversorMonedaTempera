package alura.conversormonedatempera;
import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo Ramirez
 */   
public class ConvertirTemperaturas {
    public void ConvertirCelsiusAFahrenheith(double valorRecibido){
        // formula F = ÂºC x 1.8 + 32
        double tempFahrenheit = (valorRecibido * 1.8) + 32;
        tempFahrenheit = (double) Math.round(tempFahrenheit * 100d)/100;
        JOptionPane.showMessageDialog(null, "La temperatura en Fahrenheit es " + tempFahrenheit + "Âº");
    }
    public void ConvertirFahrenheithACelsius(double valorRecibido){
        // F a ÂºC use la fÃ³rmula: ÂºC = (ÂºF-32) Ã· 1.8
        double tempCelsius = (valorRecibido - 32) / 1.8;
        tempCelsius = (double) Math.round(tempCelsius * 100d)/100;
        JOptionPane.showMessageDialog(null, "La temperatura en Celsius es " + tempCelsius + "Âº");
    }

}

