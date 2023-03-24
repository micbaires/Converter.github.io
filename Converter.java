import javax.swing.JOptionPane;

public class Converter {

    public static void main(String[] args) {
        
        // Seleccionar la conversión
        String[] options = {"Dólar a Euro", "Dólar a Libra Esterlina", "Dólar a Yen Japonés", "Dólar a Won Sul-coreano", "Grados Celsius a Fahrenheit", "Unidades de medida"};
        int conversion = JOptionPane.showOptionDialog(null, "Seleccione la conversión que desea realizar:", "Conversor", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        
        // Realizar la conversión seleccionada
        switch(conversion) {
            case 0: // Dólar a Euro
                double dolares = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de Dólares a convertir:"));
                double tasaEuro = 0.83; // Tasa de conversión Dólar-Euro
                double euros = dolares * tasaEuro;
                JOptionPane.showMessageDialog(null, dolares + " Dólares son " + euros + " Euros.");
                break;
            case 1: // Dólar a Libra Esterlina
                dolares = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de Dólares a convertir:"));
                double tasaLibra = 0.72; // Tasa de conversión Dólar-Libra Esterlina
                double librasS = dolares * tasaLibra;
                JOptionPane.showMessageDialog(null, dolares + " Dólares son " + librasS + " Libras Esterlinas.");
                break;
            case 2: // Dólar a Yen Japonés
                dolares = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de Dólares a convertir:"));
                double tasaYen = 108.45; // Tasa de conversión Dólar-Yen Japonés
                double yenes = dolares * tasaYen;
                JOptionPane.showMessageDialog(null, dolares + " Dólares son " + yenes + " Yenes Japoneses.");
                break;
            case 3: // Dólar a Won Sul-coreano
                dolares = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de Dólares a convertir:"));
                double tasaWon = 1129.20; // Tasa de conversión Dólar-Won Sul-coreano
                double wones = dolares * tasaWon;
                JOptionPane.showMessageDialog(null, dolares + " Dólares son " + wones + " Wones Sul-coreanos.");
                break;
            case 4: // Grados Celsius a Fahrenheit
                double celsius = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la temperatura en Grados Celsius:"));
                double fahrenheit = (celsius * 1.8) + 32;
                JOptionPane.showMessageDialog(null, celsius + " Grados Celsius son " + fahrenheit + " Grados Fahrenheit.");
                break;
            case 5: // Unidades de medida
                String[] unidades = {"Metros a Pies", "Pulgadas a Centímetros", "Kilogramos a Libras"};
                int unidad = JOptionPane.showOptionDialog(null, "Seleccione la conversión de unidades que desea realizar:", "Conversor - Unidades de medida", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, unidades, unidades[0]);
                
                // Realizar la conversion
                switch(unidad) {
                    case 0: // Metros a Pies
                        double metros = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de Metros a convertir:"));
                        double pies = metros * 3.281;
                        JOptionPane.showMessageDialog(null, metros + " Metros son " + pies + " Pies.");
                        break;
                    case 1: // Pulgadas a Centímetros
                        double pulgadas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de Pulgadas a convertir:"));
                        double centimetros = pulgadas * 2.54;
                        JOptionPane.showMessageDialog(null, pulgadas + " Pulgadas son " + centimetros + " Centímetros.");
                        break;
                    case 2: // Kilogramos a libras
                        double kilogramos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de Kilogramos a convertir:"));
                        double libras = kilogramos * 2.205;
                        JOptionPane.showMessageDialog(null, kilogramos + " Kilogramos son " + libras + " Libras.");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Selección inválida.");
                        break;
                }
        }

    }

}
