package alura.conversormonedatempera;
import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo Ramirez
 */ 
public class Function {

    ConvertirMonedas monedas = new ConvertirMonedas();
    ConvertirTemperaturas temperaturas = new ConvertirTemperaturas();
   
    public void ConvertirMonedas( double valorRecibido){
        String opcion = JOptionPane.showInputDialog(null, "Elige una moneda a la que deseas convertir tu dinero",
                "Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Colones a Dolar", "Colones a Euro",
                    "Colones a Libras Esterlinas","Colones a Yen Japones", "Colones a Won Sur-Coreano" , 
                    "Dolar a Colones","Euro a Colones", "Libras Esterlinas a Colones", "Yen Japones a Colones", 
                    "Won Sur-Coreano a Colones"},
                "Seleccion").toString();

        switch (opcion){
            case "Colones a Dolar":
                monedas.ConvertirColonesTicosADolar(valorRecibido);
                break;
            case "Colones a Euro":
                monedas.ConvertirColonesTicosAEuro(valorRecibido);
                break;
            case "Colones a Libras Esterlinas":
                monedas.ConvertirColonesTicosLibrasEsterlinas(valorRecibido);
                break;
            case "Colones a Yen Japones":
                monedas.ConvertirColonesTicosYenJapones(valorRecibido);
                break;
            case "Colones a Won Sur-Coreano":
                monedas.ConvertirColonesTicosWonSurCoreano(valorRecibido);
                break;
            case "Dolar a Colones":
                monedas.ConvertirDolarAColonesTicos(valorRecibido);
                break;
            case "Euro a Colones":
                monedas.ConvertirEuroAColonesTicos(valorRecibido);
                break;
            case "Libras Esterlinas a Colones":
                monedas.ConvertirLibrasEsterlinasAColonesTicos(valorRecibido);
                break;
            case "Yen Japones a Colones":
                monedas.ConvertirYenJaponesAColonesTicos(valorRecibido);
                break;
            case "Won Sur-Coreano a Colones":
                monedas.ConvertirWonSurCoreanoAColonesTicos(valorRecibido);
                break;    
            }
        }

    public void ConvertirTemperaturas( double valorRecibido){
        String opcion = (JOptionPane.showInputDialog(null, "Elige una temperatura a convertir",
                "Temperaturas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Celsius a Fahrenheit", "De Fahrenheit a Celsius"},
                "Seleccion")).toString();

        switch (opcion){
            case "De Celsius a Fahrenheit":
                temperaturas.ConvertirCelsiusAFahrenheith(valorRecibido);
                break;
            case "De Fahrenheit a Celsius":
                temperaturas.ConvertirFahrenheithACelsius(valorRecibido);
                break;

        }


    }
    
}

