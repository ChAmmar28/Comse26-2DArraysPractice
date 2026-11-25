public class Exercise10 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0;
        System.out.print("Main diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
            sum += matrix[i][i];
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
