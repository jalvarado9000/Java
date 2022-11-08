public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int [] arrayA = {31, 14, 5, 12, 50, 80, 100, 29, 58, 57};
        int [] arrayB = {9, 13, 156, 78, 36, 46, 86, 98, 63, 2};
        int [] arrayC = new int [20];

        System.arraycopy(arrayA, 0, arrayC, 0, arrayA.length);
        System.arraycopy(arrayB, 0, arrayC, arrayA.length, arrayB.length);

        System.out.println("The values of ArrayC are: ");

        for(int val : arrayC) {
            System.out.println(val);
        }

    }

}
