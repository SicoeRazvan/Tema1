import java.util.Scanner;

// Se da un numar. Sa se afiseze ‘true' daca numarul apartine intervalului [9,24]. Altfel sa se afiseze ‘false'.
public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int x = 9;
        int y = 24;

        System.out.print("N = ");
        n = scanner.nextInt();

        System.out.print("N apartine intervalului [9,24]? ");
        if (n >= x && n <= y) {
            System.out.print("true");
        } else {
            System.out.println("false");
        }
    }
}
