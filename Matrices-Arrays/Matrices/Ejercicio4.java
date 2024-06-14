import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i <= 100; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);

        int[][] matrix = new int[3][3];
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = numbers.get(index);
                index++;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
