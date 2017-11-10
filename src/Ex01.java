import java.util.Scanner;

//Sa se calculeze media aritmetica a doua numere.
public class Ex01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("A = ");
        double a = scanner.nextDouble();

        System.out.print("B = ");
        double b = scanner.nextDouble();

        System.out.print("Ma = ");
        double Ma = (a+b)/2;

        System.out.println(Ma);
    }
}
