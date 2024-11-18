import java.util.Scanner;

public class week11task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] matrix = new double[3][4];

        System.out.println("Enter a 3 - by - 4 matrix row by row:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        for (int j = 0; j < 4; j++) {
            double sum = MatrixSum.sumColumn(matrix, j);
            System.out.println("Sum of the elements at column " + j + " is " + sum);
        }

        scanner.close();
    }

    public class MatrixSum {
        public static double sumColumn(double[][] m, int columnIndex) {
            double sum = 0;
            for (int i = 0; i < m.length; i++) {
                if (columnIndex >= 0 && columnIndex < m[i].length) {
                    sum += m[i][columnIndex];
                }
            }
            return sum;
        }
    }
}