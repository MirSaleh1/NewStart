package l05.arrays.strings.homewor;

public class Task10HardCsvOrderParser {

    public static void main(String[] args) {

        String value1 = "apple:2,banana:5,orange:3";
        String[] value2 = value1.split(",");
        String[] itemNames = new String[value2.length];
        int[] quantities = new int[value2.length];
        int totalQuantity = 0;

        for (int i = 0; i < value2.length; i++) {
            itemNames[i] = value2[i].split(":")[0];
            quantities[i] = Integer.parseInt(value2[i].split(":")[1]);
            totalQuantity += quantities[i];
        }
        String summary = String.format("Total items: %d. Items processed: %s, %s, %s.",
                totalQuantity, itemNames[0], itemNames[1], itemNames[2]);

             System.out.println(summary);
    }
}
