import java.util.Arrays;

public class Main {

    public static int[][] matrixProduct(int[][] matrix, int productNumber){
        for(int iterator = 0 ; iterator < matrix.length ; iterator++){
            for (int iterator1 = 0 ; iterator1 < matrix[0].length; iterator1++){
                matrix[iterator][iterator1] *= productNumber;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(matrixProduct(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},2)));
    }
}