import java.util.Scanner;

//Se se calculeze media aritmetica pana ce numarul citit este 0.
public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, Ma;

        boolean stop = false;
        while (stop == false) {

            System.out.print("A = ");
            a = scanner.nextDouble();

            System.out.print("B = ");
            b = scanner.nextDouble();

            if (a != 0 && b != 0) {
                System.out.print("Ma = ");
                Ma = (a + b) / 2;
                System.out.println(Ma);
                System.out.println("-----------------");
            }
            else
            {
                stop = true;
            }
        }
    }
}