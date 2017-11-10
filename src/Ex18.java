import java.util.Scanner;

/*
Se da un numar intreg x si un numar intreg n. Sa se calculeze urmatoarea suma:
suma = 1+(x la puterea 1) +(x la puterea 2) + (x la puterea 3) + ….+ (x la puterea n) .

exemplu

x = 4
n=5

suma = 1 + 4 +(4*4)+(4*4*4) +(4*4*4*4) +(4*4*4*4*4)
 */
public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x, n;
        long suma = 1;
        int produs = 1;
        System.out.print("x = ");
        x = scanner.nextInt();

        System.out.print("n = ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            produs *= x;
            suma +=  produs;
        }
        System.out.println("Suma = " + suma);
    }
}
