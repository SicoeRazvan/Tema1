import java.util.Scanner;

        /*Ion lives in Cluj and Florica lives in Floresti and you know
        the distance between Cluj and Floresti is k kilometres.
        They plan to meet somewhere between the two cities
        so they start driving on the same road in the same moment.
        Assuming you know the speed of their car vIon and vFlorinca
        and this is kept constant pls calculate after how much time
        they meet (in minutes)
        and at what distance from Cluj.*/
public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distance;
        double IonSpeed;
        double FloricaSpeed;
        double distanceFromCluj;
        double meetingTime;

        System.out.print("Distance (km) = ");
        distance = scanner.nextDouble();

        System.out.print("Ion speed (km/h) = ");
        IonSpeed = scanner.nextDouble();

        System.out.print("Florica speed (km/h) = ");
        FloricaSpeed = scanner.nextDouble();

        distanceFromCluj = (IonSpeed * distance) / (FloricaSpeed + IonSpeed);
        meetingTime = (distanceFromCluj / IonSpeed) * 60;

        System.out.printf("Distance to meeting point, from Cluj = %.3f\n", distanceFromCluj);
        System.out.printf("Meeting time (minutes) = %.3f", meetingTime);
    }
}
