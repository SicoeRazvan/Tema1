import java.util.Scanner;

// Se se afiseze o tabela de conversie din Fahrenheit in Celsius intre gradul X si gradul Y.
public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti primul grad -> ");
        int xFahrenheit = scanner.nextInt();

        System.out.print("Introduceti al doilea grad -> ");
        int yFahrenheit = scanner.nextInt();

        double Celsius;

        System.out.println("Tabela de conversie:");
        for (int i = xFahrenheit; i <= yFahrenheit; i++) {
            Celsius = (xFahrenheit - 32)/1.800;
            System.out.print(xFahrenheit + " grade" + " F" + " = ");
            System.out.printf("%.3f grade C\n", Celsius);
            xFahrenheit++;
        }
    }
}
