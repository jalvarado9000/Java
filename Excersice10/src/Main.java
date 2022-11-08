import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String str_start = "Quazimodo";
        String str_end = str_start;
        int length = str_start.length();

        String b = "*";
        String c = " ";

        for(int i = 0; i <(length-2); i++)
            c +=b;

        char a = str_start.charAt(0);
        System.out.println(a);

        char d = str_end.charAt((length-1));
        System.out.println(d);

        System.out.println(str_start);

        System.out.println(a+c+d);

        System.out.println("helllo");

        String ra = a+b+d;
        System.out.println(ra);

    }

}
