public class OrderCalculator {
    public static int calculate(int price, int quality) {
        double discount;
        if(quality>=10){
            discount = 0.9;
        }else{
            discount = 1.0;
        }

        if (quality > 0) {
            return (int)(price * quality * discount);
        } else return 0;
    }
}