package l07.oop.fundamental.homework.task1;

public class Student {
    public String name;
    public int age;
    public String group;


    public Student(String name,int age,String group){
        this.age=age;
        this.group=group;
        this.name=name;
    }
    public void printInfo(){
        System.out.println(name+" "+group+" "+age);
    }
}
