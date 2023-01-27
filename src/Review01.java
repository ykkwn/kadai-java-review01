
public class Review01 {

    public static void main(String[] args) {
        int price = 1500;
        int tax = taxMethod(price);
        int total = price + tax;
        System.out.println(price + "円の商品の税込価格は" + total + "円" + "(消費税は" + tax + "円)" + "です。");
    }

    public static int taxMethod(int price) {
        int tax = (int)(price * (0.1));
        return tax;
    }
}