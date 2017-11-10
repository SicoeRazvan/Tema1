
//   Se da un sir de numere. Sa se afiseze: numarul maxim, numarul minim, suma lor, sirul dublat .
public class Ex06 {

    public static void write(int array[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void sum(int array[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + array[i];
        }
        System.out.println("Sum: " + sum);
    }

    public static void max(int array[], int n) {
        int max = array[0];
        for (int i = 0; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("\nMax: " + max);
    }

    public static void min(int array[], int n) {
        int min = array[0];
        for (int i = 0; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min: " + min);
    }

    public static void doubleArray(int array[], int n){
        System.out.print("Double array: ");
        for (int i = 0; i < n; i++) {
            array[i] = array[i] * 2;
        }
        write(array, n);
    }

    public static void main(String[] args) {
        int array[] = {5, 6, 7, 22, 5, 11, 1, 4};
        int n = array.length;

        write(array, n);
        max(array, n);
        min(array, n);
        sum(array, n);
        doubleArray(array, n);
    }
}

