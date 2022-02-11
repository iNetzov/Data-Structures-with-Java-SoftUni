public class Main {

    public static void main(String[] args) {
        System.out.println(Math.pow(2,10));
        System.out.println();
        int a = 5;
        a += 1;
        System.out.println(a);
    }

    // this algorithm is (n^2) in worst case.
    private static long getOperations(int n) {
        long counter = 0;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                counter++;
            }
        }
        return counter;
    }

    //this algorithm is (n) in worst case.
    boolean contains(int[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                return true;
            }
        }
        return false;
    }


}
