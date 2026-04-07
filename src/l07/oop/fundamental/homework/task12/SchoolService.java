package l07.oop.fundamental.homework.task12;

public class SchoolService {
    private Student[]students;
    private Teacher[]teachers;
    private int countS=0;
    private int countT=0;

    public SchoolService(int size1, int size2) {
        this.students = new Student[size1];
        this.teachers = new Teacher[size2];
    }
    public void addStudent(Student s){
        if (countS >= students.length) {
            System.out.println("eror: " + s.getName());
            return ;
        }
        for (int i = 0; i < countS; i++) {
            if (s==students[i]){
                System.out.println("already exsist");
                return ;
            }
        }
        students[countS++]=s;
    }
    public void addTeacher(Teacher t){
        if (countT >= teachers.length) {
            System.out.println("eror: " + t.getName());
            return ;
        }
        for (int i = 0; i < countT; i++) {
            if (t==teachers[i]){
                System.out.println("already exsist");
                return ;
            }
        }
       teachers[countT++]=t;
    }
    public void printAll(){
        System.out.println("All students");
        for (int i = 0; i < countS; i++) {
            System.out.println(students[i]);
        }
        System.out.println("All teachers");
        for (int i = 0; i < countT; i++) {
            System.out.println(teachers[i]);
        }
    }
}
