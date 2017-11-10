public class Ex19 {

    public static void write(int array[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }

    public static void ascendingSort(int array[], int n) {
        int aux;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
    }

    public static boolean isSorted(int array[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void verifyArray(int array[], int n) {
        if (isSorted(array, n) == true) {
            System.out.println("Crescator");
        } else {
            ascendingSort(array, n);
            write(array, n);
        }

    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = array.length;

        write(array, n);
        verifyArray(array, n);
    }
}
