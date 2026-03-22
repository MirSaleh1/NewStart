package l03.variables.homework;

public class Task07MediumCastingData {

    public static void main(String[] args) {

        double value=127.85;
        int intValue1=(int) value;

        int intValue2=230;
        byte byteValue=(byte) intValue2;

        byte sensor1=117;
        byte sensor2=123;
        int intSumSensors=sensor2+sensor1;
        byte byteSumSensors=(byte) intSumSensors;

        System.out.println("double to int-"+intValue1+"\n"+
                           "int to byte-"+byteValue+"\n"+
                            "byte to int after agian to byte-"+byteSumSensors);
    }
}
