import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 4, 5, 2, 96, 1, 42, 42, 15));
        numbers.add(8);
        numbers.get(2);

        int[] counts = new int[101];


        for (Integer number : numbers) {
            counts[number]++;
        }

        for (int number = 0; number <= 100; number++) {
            int count = counts[number];
            for (int i = 0; i < count; i++) {
                System.out.print(number + " ");
            }
        }
    }
}
