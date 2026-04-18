package l10.homework.task1;

public class Task01EasyPolymorphismIntro {

    public static void main(String[] args) {

        Dog dog1=new Dog();
        Dog dog2=new Dog();
        Cat c1=new Cat();
        Cat c2=new Cat();
        Animal[]animals={c1,c2,dog1,dog2};

        for(Animal animal:animals){
           animal.speak();
        }

    }
}
