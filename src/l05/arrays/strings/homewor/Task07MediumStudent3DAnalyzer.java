package l05.arrays.strings.homewor;

public class Task07MediumStudent3DAnalyzer {

    public static void main(String[] args) {

        int[][][] marks = {
                {
                        {80, 90},
                        {70, 75},
                        {85, 95}
                },
                {
                        {60, 65},
                        {90, 92},
                        {88, 80}
                }
        };

        status(marks);
        for (int i = 0; i <marks.length ; i++) {
            System.out.println("student"+(i+1)+"-----");
            System.out.println("max mark--"+maxPoint(marks[i]));
            System.out.println("all point--"+allPoint(marks[i]));
            System.out.println("avarage point--"+avargePoint(marks[i]));
        }
    }
    public static void status(int[][][] student){
        for (int i = 0; i < student.length; i++) {
            System.out.println("student"+(i+1)+"-----");
            for (int j = 0; j < student[i].length; j++) {
                System.out.println("subject"+(j+1)+"-----");
                for (int k = 0; k < student[i][j].length; k++) {
                    System.out.println("point--"+student[i][j][k]);
                }
            }
        }

    } public static int maxPoint(int[][] marks){
            int maxPoint=0;
            for (int i = 0; i < marks.length; i++) {
                int temp=0;
                for (int k = 0; k < marks[i].length ; k++) {
                    temp += marks[i][k];
                }
                if (maxPoint<temp) maxPoint=temp;
            }
            return maxPoint;

    } public static int allPoint(int[][] marks ){

            int allPoint=0;
            for (int i = 0; i < marks.length; i++) {
                int temp=0;
                for (int k = 0; k < marks[i].length; k++) {
                    temp += marks[i][k];
                    allPoint+=temp;
                }
            }
             return allPoint;
        }

    public static double avargePoint(int[][] marks ){
        int allPoint =allPoint(marks);
        return (double)allPoint/marks[0].length;
    }
    }


