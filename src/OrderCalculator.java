public class OrderCalculator {
    public static int calculate(int price, int quantity) {
        double discount;
        if(quantity>=10){
            discount = 0.9;
        }else{
            discount = 1.0;
        }

        if (quantity > 0) {
            return (int)(price * quantity * discount);
        } else return 0;
    }
}