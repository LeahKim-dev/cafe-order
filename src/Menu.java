public class Menu {
    public static int getPrice(String name){
        if(name.equals("아메리카노")) return 3000;
        else if (name.equals("라테")) return 4000;
        else return 0;
    }
}
