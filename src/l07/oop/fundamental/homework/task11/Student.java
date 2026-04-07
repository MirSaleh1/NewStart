package l07.oop.fundamental.homework.task11;

import java.util.Arrays;

public class Student {
    private String name;
    private int[]scores;

    public Student(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public int maxScore(){
        int maxSc=scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (maxSc<scores[i])maxSc=scores[i];
        }
        return maxSc;
    }
    public double averageScore(){
        if (scores.length==0)return 0;
        int sum=0;
        int count=0;
        for (int i = 0; i < scores.length; i++) {
            sum+=scores[i];
            count++;
        }
        return (double)sum/count;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", scores=" + Arrays.toString(scores) +
                '}';
    }
}
