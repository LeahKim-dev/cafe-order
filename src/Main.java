public class Main {
    public static void main(String[] args) {
        String menu = "아메리카노";
        int quantity = 2;
        int price = Menu.getPrice(menu);
        int total = OrderCalculator.calculate(price, quantity);
        System.out.println("주문");
        System.out.println("메뉴: " + menu + ", 수량: " + quantity);
        System.out.println("총금액: " + total + "원");
    }
}