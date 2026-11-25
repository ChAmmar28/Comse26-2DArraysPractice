public class Exercise2 {
    public static void main(String[] args) {
        int[][] matrix = {
            {5, 10, 15},
            {20, 25, 30}
        };

        System.out.println(matrix[1][2]);
        matrix[0][1] = 99;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
