import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        int[][] matrix = {
            {4, 15, 8},
            {23, 2, 16},
            {9, 42, 11}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a threshold: ");
        int threshold = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > threshold) {
                    count++;
                }
            }
        }

        System.out.println("Count: " + count);
        scanner.close();
    }
}
