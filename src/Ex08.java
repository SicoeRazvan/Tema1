import java.util.Scanner;

// A turtle goes D km in H hours. Calculate the speed of the turtle expressed in meters/second
public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distance;
        double hours;
        double speed;

        System.out.println("Calculate turtle speed");
        System.out.print("Distance(km) = ");
        distance = scanner.nextDouble();

        System.out.print("Hours = ");
        hours = scanner.nextDouble();

        speed = distance/hours;
        System.out.printf("Speed (km/h) = %.3f\n", speed);

        speed = (distance/hours) * (1/3.6);
        System.out.printf("Speed (m/s) = %.3f", speed);
    }
}
