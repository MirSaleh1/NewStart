package l05.arrays.strings.homewor;

public class Task05MediumMatrixReport {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int totalSum=0;
        for (int i = 0; i < matrix.length; i++) {
            int rowSum=0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum+=matrix[i][j];
                System.out.print(matrix[i][j]+" , ");
            }
            System.out.print("------"+rowSum+"\n");
            totalSum+=rowSum;
        }
        System.out.println("total Sum ---"+totalSum);
        System.out.println("--------------------");
        ;
        for (int i = 0; i <matrix[0].length ; i++) {
            int columnSum=0;
            for (int j = 0; j < matrix.length; j++) {
                columnSum+=matrix[j][i];
            }
            System.out.println("column sum------"+columnSum);
        }
    }
}
