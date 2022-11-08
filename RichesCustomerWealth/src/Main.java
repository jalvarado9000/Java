public class Main {
    public static void main(String[] args) {
        

        int[][] accounts = {
                {20,30},
                {35,80,40},
                {15,40,5},
        };

        int max = 0;

        for(int i = 0; i < accounts.length; i++ ){
            int sum = 0;
            for(int j = 0; j < accounts[i].length; j++){
                sum += accounts[i][j];

            }
            max = Math.max(sum,max);
        }

        System.out.println(max);

    }







}