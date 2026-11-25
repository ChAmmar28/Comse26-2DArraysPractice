public class Exercise12 {
    public static void main(String[] args) {
        int[][] grades = {
            {85, 90, 78, 92},
            {70, 88, 95, 80},
            {60, 75, 82, 89}
        };

        int max = grades[0][0];
        int totalSum = 0;
        int totalCount = 0;

        for (int i = 0; i < grades.length; i++) {
            int studentSum = 0;
            for (int j = 0; j < grades[i].length; j++) {
                studentSum += grades[i][j];
                totalSum += grades[i][j];
                totalCount++;
                if (grades[i][j] > max) {
                    max = grades[i][j];
                }
            }
            double studentAvg = (double) studentSum / grades[i].length;
            System.out.println("Student " + i + " average: " + studentAvg);
        }

        double overallAvg = (double) totalSum / totalCount;
        System.out.println("Class maximum: " + max);
        System.out.println("Overall average: " + overallAvg);
    }
}
