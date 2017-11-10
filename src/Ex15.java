import java.util.Scanner;

/* Se dau doua numere a si n. sa se afiseze numarul a la puterea n
de ex
a =3
b = 20
se va calcula 3*3 *3

a = 3
b = 5
se va calcula 3*3*3*3*3
*/
public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;
        int produs = 1;

        System.out.print("a = ");
        a = scanner.nextInt();

        System.out.print("b = ");
        b = scanner.nextInt();

        for(int i = 0; i < b; i++ ){
            produs *= a;
        }

        System.out.println("a la puterea n (n = b) = " + produs);
    }
}
