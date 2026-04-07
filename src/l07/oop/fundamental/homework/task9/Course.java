package l07.oop.fundamental.homework.task9;

public class Course {
    private String name;
    public double capacity;
    private Student[]enrolled;
    private int count=0;

    public Course(String name, double capacity) {
        this.name = name;
        this.capacity = capacity;
        enrolled=new Student[(int) capacity];
    }
    public boolean enroll(Student s){
        if (count >= capacity) {
            System.out.println("eror: " + name + " course is full");
            return false;
        }
        for (int i = 0; i < count; i++) {
            if (s==enrolled[i]){
                System.out.println("already exsist");
                return false;
            }
        }
        enrolled[count++]=s;
        return true;
    }
    public void printEnrolledStudents(){
        for (int i = 0; i < count; i++) {
            System.out.println(enrolled[i]);
        }
    }
}
