public class OrderCalculator {
    public static int calculate(int price, int quantity) {
        if (quantity > 0) {
            return price * quantity;
        } else return 0;
    }
}