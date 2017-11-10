import java.util.Scanner;

//Se da un numar in grade Fahrenheit. Sa se converteasca in Celsius stiind formula.
public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fahrenheit = ");
        int Fahrenheit = scanner.nextInt();
        double Celsius = (Fahrenheit - 32)/1.8000;

        System.out.println("Celsius = " + Celsius);
    }
}
