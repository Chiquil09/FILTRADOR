package filtrador;

import javax.swing.JOptionPane;

public class Filtrador {

    public static void main(String[] args) {
        int numero, nPositivo = 0, nNegativo = 0, nNeutro = 0, i = 1;
        while (i <= 20) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Deme el numero: " + i));
            i++;
            if (numero >= 1) {
                nPositivo++;
            } else if (numero < 0) {
                nNegativo++;
            } else if (numero == 0) {
                nNeutro++;
            }

        }
        JOptionPane.showMessageDialog(null, "La cantidad de numeros positivos son:" + nPositivo + "\n" + "Los numeros negativos son:" + nNegativo + "\n" + "La cantidad de numeros neutros es:" + nNeutro);
    }

}
