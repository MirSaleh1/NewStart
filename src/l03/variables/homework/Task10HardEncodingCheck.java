package l03.variables.homework;

import java.nio.charset.StandardCharsets;

public class Task10HardEncodingCheck {

    public static void main(String[] args) {

        String title="Cafe shop 😊";
        byte [] utfBytes=title.getBytes(StandardCharsets.UTF_8);
        byte [] isoBytes=title.getBytes(StandardCharsets.ISO_8859_1);

        System.out.println(title.length());
        System.out.println(title.codePointCount(0,title.length()));
        System.out.println("UTF lenght--"+ utfBytes.length+ "\n" +
                " ISO lenght--"+ isoBytes.length);

        char c1 = title.charAt(0);
        char c2 = title.charAt(1);

        System.out.println("Char 1 code: " + (int) c1);
        System.out.println("Char 2 code: " + (int) c2);
    }
}
