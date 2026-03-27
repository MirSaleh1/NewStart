package l05.arrays.strings.homewor;

public class Task08MediumStringEqualityLab {

    public static void main(String[] args) {

        String a="java";
        String b= "java";
        System.out.println(a==b);//string poolda eyni obyekde baxirlar
        System.out.println(a.equals(b));
        String c=new String(a);
        System.out.println(a==c);//biri string pooldadi(a) digeri string poolda deyil(c)
        System.out.println(a.equals(c));//icindeki deyerler eynidir
        System.out.println(a==c.intern());//intern ile string poolda eyni deyerli obyekt yaratdiq amma hec neye menimsetmedik

    }
}
