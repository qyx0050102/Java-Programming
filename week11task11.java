import java.util.Arrays;
import java.util.Comparator;

public class week11task11 {
    public static void main(String[] args) {
        // 员工的工作小时数二维数组
        int[][] workHours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}
        };

        // 计算每个员工的总工作小时数，并存储在一个一维数组中
        int[] totalHours = new int[workHours.length];
        for (int i = 0; i < workHours.length; i++) {
            int sum = 0;
            for (int j = 0; j < workHours[i].length; j++) {
                sum += workHours[i][j];
            }
            totalHours[i] = sum;
        }

     
        Integer[] indices = new Integer[workHours.length];
        for (int i = 0; i < indices.length; i++) {
            indices[i] = i;
        }


        Arrays.sort(indices, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return totalHours[b] - totalHours[a];
            }
        });


        for (int index : indices) {
            System.out.println("Employee " + index + "'s total hours: " + totalHours[index]);
        }
    }
}