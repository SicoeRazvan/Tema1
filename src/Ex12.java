import java.util.Scanner;

/* Se se calculeze suma primelor n numere naturale, unde n este declarat ca si
int n = 20; sau o alta valoare
 */
public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum = 0;

        System.out.print("N = ");
        n = scanner.nextInt();

        for(int i = 0; i <= n; i++){
            sum += i;
        }

        System.out.print("Suma primelor n numere = " + sum);
    }
}
