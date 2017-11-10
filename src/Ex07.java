import java.util.Scanner;

// the final price of a product is p RON. Calculate the VAT if this is 19%.
public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Product price = ");
        double price = scanner.nextDouble();
        double vat = price * 19/100;
        System.out.println("VAT = " + vat);
    }
}
