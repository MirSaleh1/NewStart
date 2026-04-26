package l11.homework.task8;

public class DiscountService {

    public static int discountPercent(MembershipLevel level){
        return switch (level){
            case GOLD -> 75;
            case SILVER ->50;
            case BRONZE -> 25;
            case PLATINUM -> 85;
        };
    }
}
