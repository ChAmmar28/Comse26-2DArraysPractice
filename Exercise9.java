import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value to search: ");
        int target = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Row: " + i + ", Column: " + j);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("Not found");
        }

        scanner.close();
    }
}
