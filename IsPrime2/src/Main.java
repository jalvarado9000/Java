import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub





        Rectangle rect1 = new Rectangle(1.5, 2.5);
        Rectangle rect2 = new Rectangle(2,3,"blue");

        System.out.println("The widht and lenght of rect1 are " + rect1.get_Width() + " and " + rect1.get_Lenght());
        ChangeColor.toBlue(rect1);
        System.out.println("the fill color of rect1 " + rect1.get_Color());
        System.out.println("the fill color of rect1 was change to " + rect1.get_Color() + "\n");


        System.out.println("The widht and lenght of rect2 are " + rect2.get_Width() + " and " + rect2.get_Lenght());
        ChangeColor.toRed(rect2);
        System.out.println("the fill color of rect2 was change to" + rect2.get_Color());
        System.out.println("the fill color of rect2 " + rect2.get_Color());



    }

}
