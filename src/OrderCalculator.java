public class OrderCalculator {
    public static int calculate(int price, int quality) {
        if (quality > 0) {
            return price * quality;
        } else return 0;
    }
}