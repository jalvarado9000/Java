import javax.swing.*;

public class AutoCalculate {
    //atributo del auto
    //declaracion de variable
    String nombre;
    String tamano;
    int millaje;
    int tanque;
    int rendimiento;

    //metodo del auto
    //calcular milla por tanque
    public String model(String input1, String input2){
        nombre = input1;
        tamano = input2;
        return nombre;
    }
    public int calcular(int input3, int input4){
        rendimiento = input3 / input4;
        return rendimiento;
    }
    public void display(String nombre, int rendimiento){
        System.out.println("El modelo del auto es: "+nombre+ " Tama�o : "+tamano+" y el rendimiento es : "+rendimiento + " M.P.G.");



    }



    public int print_opciones(){


        int pop = Integer.parseInt(JOptionPane.showInputDialog("Si el galon es pequeno presione 1 \n Si el galon es grande presione 2"));

        return pop;
    }



    //inputs option
    public int opciones(int op){


        int select = 0;
        String op1;

        switch (op) {

            case 1:
                JOptionPane.showMessageDialog(null, "Tu galon es de 12 ");
                select = 1;
                break;


            case 2:
                JOptionPane.showMessageDialog(null, "Tu galon es de 16 ");
                select = 2;
                break;



            case 3:
                JOptionPane.showMessageDialog(null,"Invalid Option");
                break;


        }

        return select;


    }






}