import java.util.Scanner;

/*
Se da un sir. Sa se extraga toate numerele intre doua valori si sa se puna intr-un alt sir care apoi sa se afiseze.
 */
public class Ex21 {


    public static void write(int array[], int lenght) {
        for (int i = 0; i < lenght; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }

    public static void extractNumbersFromArray(int firstArray[], int firstArrayLenght) {
        Scanner scanner = new Scanner(System.in);
        int firstValue, secondValue;
        int firstValuePosition = 0;
        int secondValuePosition = 0;
        int secondArrayLenght = 0;

        System.out.print("First value = ");
        firstValue = scanner.nextInt();

        System.out.print("Second value = ");
        secondValue = scanner.nextInt();

        for (int i = 0; i < firstArrayLenght; i++) {
            if (firstValue == firstArray[i]) {
                firstValuePosition = i + 1;
            } else if (secondValue == firstArray[i]) {
                secondValuePosition = i;
            }
        }

        for (int i = firstValuePosition; i < secondValuePosition; i++) {
            secondArrayLenght++;
        }

        int[] secondArray = new int[secondArrayLenght];

        int j = 0;
        for (int i = firstValuePosition; i < secondValuePosition; i++) {
            secondArray[j] = firstArray[i];
            j++;
        }

        System.out.print("Second Array = ");
        write(secondArray, secondArrayLenght);
    }

    public static void main(String[] args) {
        int[] firstArray = {20, 30, 45, 3, 51, 12, 32, 63};
        int firstArrayLenght = firstArray.length;

        System.out.print("First Array = ");
        write(firstArray, firstArrayLenght);
        extractNumbersFromArray(firstArray, firstArrayLenght);
    }
}
