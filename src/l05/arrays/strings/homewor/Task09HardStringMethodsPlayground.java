package l05.arrays.strings.homewor;

public class Task09HardStringMethodsPlayground {

    public static void main(String[] args) {

        String a="Salam,menim,adim,Salehdi";
        System.out.println(a.length());
        System.out.println(a.indexOf("menim"));
        System.out.println(a.indexOf("m",7));
        int target=7;
        if(target<a.length()){
            System.out.println(target+ " "+a.charAt(target));
            System.out.println("Substring (2-6): " + a.substring(17, 22)); // "Java"
            System.out.println("Upper Case: " + a.toUpperCase());
            System.out.println("Lower Case: " + a.toLowerCase());

            System.out.println("Starts with '  Java': " + a.startsWith("salam"));
            System.out.println("Ends with 'Strings': " + a.endsWith("di"));
            System.out.println("Contains 'Arrays': " + a.contains("menim"));

            System.out.println("Replace ',' with '-': " + a.replace(",", "-"));

            String emptyStr = "";
            String blankStr = "   ";
            System.out.println("isEmpty (heç nə yoxdur): " + emptyStr.isEmpty()); // true
            System.out.println("isBlank (yalnız boşluqdur): " + blankStr.isBlank()); // true

            System.out.println("Trim: '" + a.trim() + "'");
            System.out.println("Strip: '" + a.strip() + "'");
        }
        }
    }

