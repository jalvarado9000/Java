import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        //int[] A = {1, 3, 6, 4, 1, 2};
        //int[] A = {-1,-3};
        //int[] A = {1,3};
        int[] A = {1,2,3};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        boolean flag = false;
        int num = 0;
        Arrays.sort(A);
        int[] newA = IntStream.of(A).distinct().toArray();
        for(int i =0; i < newA.length; i++){
            if(newA[i] < 0){
                flag = false;
            }

            if(i + 1 < newA.length) {
                if (newA[i + 1] == newA[i] + 1) {
                    flag = true;
                    continue;

                } else if (newA[i + 1] != newA[i] + 1) {
                    flag=true;
                    num = newA[i] + 1;

                }
            }

            else if(i == newA.length -1 && num == 0){
                flag =true;
                num = newA[i] + 1;
            }

        }

        if(flag == false){
            return 1;
        }
        else{
            return num;
        }









    }


}
