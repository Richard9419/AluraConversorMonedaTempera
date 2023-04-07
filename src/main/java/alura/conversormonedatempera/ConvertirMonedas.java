package alura.conversormonedatempera;
import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo Ramirez
 */
public class ConvertirMonedas {
    
        //Cambio moneda nacional a moneda extranjera
    public void ConvertirColonesTicosADolar( double valorRecibido){
        double colonDolar = (double)Math.round(valorRecibido / 533.50);
       // monedaDolar = (double)Math.round(monedaDolar * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + colonDolar + " Dolares");
    }

    public void ConvertirColonesTicosAEuro( double valorRecibido){
        double colonEuro = (double) Math.round(valorRecibido / 569.43);
       // monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes € " + colonEuro + " Euros");
    }
     
    public void ConvertirColonesTicosLibrasEsterlinas( double valorRecibido){
        double colonLibras = (double) Math.round(valorRecibido / 668.18);
      // monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes £ " + colonLibras + " Libras Esterlinas");
        
    }
    
    public void ConvertirColonesTicosYenJapones( double valorRecibido){
        double colonYenJ = (double) Math.round(valorRecibido / 4.08);
       // monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes JPY " + colonYenJ + " Yenes");
    }
    
    public void ConvertirColonesTicosWonSurCoreano( double valorRecibido){
        double colonWonSC = (double) Math.round(valorRecibido / 0.41);
       // monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes ₩ " + colonWonSC + " Won SurCoreano");
    }

//CAmbio de moneda Extranjera a Tica    
    public void ConvertirDolarAColonesTicos( double valorRecibido){
        double dolarColon = (double)Math.round(valorRecibido * 533.50);
       // monedaDolar = (double)Math.round(monedaDolar * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes ₡ " + dolarColon + " Colones");
    }

    public void ConvertirEuroAColonesTicos( double valorRecibido){
        double euroColon = (double) Math.round(valorRecibido * 569.43);
       // monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes ₡ " + euroColon + " Colones");
    }
     
    public void ConvertirLibrasEsterlinasAColonesTicos( double valorRecibido){
        double librasColon = (double) Math.round(valorRecibido * 668.18);
      // monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes ₡ " + librasColon + " Colones");
        
    }
    
    public void ConvertirYenJaponesAColonesTicos( double valorRecibido){
        double yenJColon = (double) Math.round(valorRecibido * 4.08);
       // monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes ₡ " + yenJColon + " Colones");
    }
    
    public void ConvertirWonSurCoreanoAColonesTicos( double valorRecibido){
        double wonSCColon = (double) Math.round(valorRecibido * 0.41);
       // monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes ₡ " + wonSCColon + " Colones");
    }

}