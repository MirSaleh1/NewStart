package l03.variables.homework;

public class Task04EasyCharCodes {

    public static void main(String[] args) {

        char value1='A';
        char value2='7';
        char value3='-';
        char value4='#';

        System.out.println("A--" + (int) value1 + '\n'+
                            "7--" + (int) value2 + "\n"+
                            "'-'--" + (int) value3 + "\n"+
                            "#--" + (int) value4 +"\n");

        String emoji="A😂";
        System.out.println(emoji.length() + " " + emoji.codePointCount(0,emoji.length()));

    }
}
