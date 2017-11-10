import java.util.Scanner;

//Sa se calculeze media aritmetica a N numere.
public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n, aux;
        double i = 1;
        double sum = 0;
        double Ma;

        System.out.print("N = ");
        n = scanner.nextDouble();

        aux = n;
        while(aux != 0){
            sum = sum + i;
            i++;
            aux--;
        }

        Ma = sum/n;
        System.out.println("Ma = " + Ma);
    }
}
