package l07.oop.fundamental.homework.task11;

public class Classroom {
    private Student[]students;
    private int count;

    public Classroom(int size) {
        this.students = new Student[size];
        count=0;
    }

    public void addStudent(Student s){
        if (count >= students.length) {
            System.out.println("eror: " + s.getName());
            return ;
        }
        for (int i = 0; i < count; i++) {
            if (s==students[i]){
                System.out.println("already exsist");
                return ;
            }
        }
        students[count++]=s;
    }
    public Student maxAvarageScore(){
        Student topStudent=students[0];
        for (int i = 1; i < count; i++) {
            if (topStudent.averageScore()<students[i].averageScore())
                topStudent=students[i];
        }
        return topStudent;
    }
    public void printAllStudentsAvargaeScore(){
        for (int i = 0; i < count; i++) {
            System.out.println(students[i].averageScore());
        }
    }
}
