public class Exercise5 {
    public static void main(String[] args) {
        int[][] matrix = {
            {12, 5, 8, 19},
            {3, 27, 14, 6},
            {9, 1, 22, 11}
        };

        int min = matrix[0][0];
        int max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
