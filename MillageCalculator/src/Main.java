import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here

        String i1 = JOptionPane.showInputDialog("Entar nombre del modelo del auto: ");
        int i3 = Integer.parseInt(JOptionPane.showInputDialog("Entrar millaje final en TRIP: "));
        int selection;
        Scanner input = new Scanner(System.in);

        int i4 = 12;
        int i5 = 16;
        AutoCalculate auto1 = new AutoCalculate();
        selection = auto1.print_opciones();
        auto1.opciones(selection);

        if(selection == 1)
        {

            double Rendimiento = i3/i4;
            JOptionPane.showMessageDialog(null, "Tienes un: " + i1 + " Tu Rendimiento es: " + Rendimiento + " M.P.G.");
        }

        else if(selection == 2){


            double Rendimiento = i3/i5;
            JOptionPane.showMessageDialog(null, "Tienes un: " + i1 + " Tu Rendimiento es: " + Rendimiento + " M.P.G.");


        }








    }

}