package task;

public class task5 {

    public static void main(String[] args) {

        int a=2546;
      int b=  task(a);
        System.out.println(b);
    }

    public static int task(int a){
        if(a<10){
            return a;
        }
        return a%10*task(a/10);
    }
}
