import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String menu = scanner.nextLine();
        int quantity = scanner.nextInt();
        int price = Menu.getPrice(menu);
        int total = OrderCalculator.calculate(price, quantity);
        System.out.println("주문");
        System.out.println("메뉴: " + menu + ", 수량: " + quantity);
        System.out.println("총금액: " + total + "원");
    }
}