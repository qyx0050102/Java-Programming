import java.util.Random;

public class week11task13 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random random = new Random();

        // 填充矩阵
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = random.nextInt(2);
            }
        }

        // 打印矩阵
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

       
        int maxRowOnes = 0;
        int maxRowIndex = 0;
        for (int i = 0; i < 4; i++) {
            int rowOnes = 0;
            for (int j = 0; j < 4; j++) {
                if (matrix[i][j] == 1) {
                    rowOnes++;
                }
            }
            if (rowOnes > maxRowOnes) {
                maxRowOnes = rowOnes;
                maxRowIndex = i;
            }
        }

        int maxColOnes = 0;
        int maxColIndex = 0;
        for (int j = 0; j < 4; j++) {
            int colOnes = 0;
            for (int i = 0; i < 4; i++) {
                if (matrix[i][j] == 1) {
                    colOnes++;
                }
            }
            if (colOnes > maxColOnes) {
                maxColOnes = colOnes;
                maxColIndex = j;
            }
        }

        System.out.println("The largest row index: " + maxRowIndex);
        System.out.println("The largest column index: " + maxColIndex);
    }
}