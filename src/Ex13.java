import java.util.Scanner;

/* Se citesc numere naturale pânã când se introduce numãrul 0.
 Afisati suma obtinutã prin adunarea doar a numerelor mai mari decat 4 si mai mici decat 11.
 */
public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum = 0;
        boolean stop = false;

        while (stop == false) {
            System.out.print("N = ");
            n = scanner.nextInt();

            if (n != 0) {
                if (n > 4 && n < 11) {
                    sum += n;
                }
            } else {
                stop = true;
            }
        }
        System.out.print("Suma = " + sum + "\n");
    }
}
