package l03.variables.homework;

public class Task03EasyFuelUsage {

    public static void main(String[] args) {

        int distanceKm = 50;
        double fuelLiters = 25.5;
        double pricePerLiter = 9.99;
        double litersPer100Km = (fuelLiters / distanceKm) * 100;
        double estimatedTripCoste = fuelLiters * pricePerLiter;

        System.out.println("Distance: " + distanceKm + " km");
        System.out.println("Fuel used: " + fuelLiters + " liters");
        System.out.println("liters per 100Km: " + litersPer100Km + " L/100km");
        System.out.println("Estimated trip cost: $" + estimatedTripCoste);
    }
}