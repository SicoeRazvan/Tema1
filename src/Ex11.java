import java.util.Scanner;

/*Se da un sir de numere ordonate crescator.
Se va determina daca un numar n exista in sir, si daca exista se va afisa pozitia pe care s-a gasit, altfel se va afisa -1.
Cu ce difera algoritmul cand sirul este ordonat crescator de cazul cand sirul este neordonat.
sirul va fi definit asa, numerele sunt de exemplu.
int[] a = {1,3,4,6,7,8,10,12,14,23};
*/
public class Ex11 {

    public static void write(int array[], int arrayLenght) {
        for (int i = 0; i < arrayLenght; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void checkIfNumberIsInArray(int array[], int arrayLenght, int n) {
        boolean find = true;
        for (int i = 0; i < arrayLenght; i++) {
            if (n == array[i]) {
                find = true;
                System.out.println(n + " is in array on position " + i);
                break;
            } else {
                find = false;
            }
        }
        if (find == false){
            System.out.println("-1");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {100, 3, 4, 655, 7, 8, 10, 12, 14, 23};
        int arrayLenght = array.length;
        int n;

        write(array, arrayLenght);

        System.out.print("\nN = ");
        n = scanner.nextInt();
        checkIfNumberIsInArray(array, arrayLenght, n);

    }
}
