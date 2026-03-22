package l03.variables.homework;

public class Task08MediumPermissionFlags {

    public static void main(String[] args) {

        final int READ=1;
        final int WRITE=2;
        final int EXPORT=4;
        final int AUDIT=8;

        int userMask=READ|WRITE;
        System.out.println((userMask & READ)!=0);
        System.out.println((userMask & WRITE)!=0);
        System.out.println((userMask & EXPORT)!=0);
        System.out.println((userMask & AUDIT)!=0);

        userMask|=READ;
        System.out.println(userMask);
        userMask&=WRITE;
        System.out.println(userMask);
        userMask^=EXPORT;
        System.out.println(userMask);


    }
}
