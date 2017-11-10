import java.util.Scanner;

/*
 Sa se calculeze factorialul unui numar a .
factorialul este definit asa:
factorial  = 1*2*3*4….*a

de ex pentru a = 4, factorialul este 1*2*3*4
 */
public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;
        int factorial = 1;

        System.out.print("a = ");
        a = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            factorial *= i;
        }
        System.out.println("Factorial de " + a + " = " + factorial);
    }
}
