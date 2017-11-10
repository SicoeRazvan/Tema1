
/*
Se da un sir. Pentru prima jumatate a sirului sa se afiseze numerele dublate,
iar pentru a doua jumatate sa se afseze numerele triplate daca sunt impare si numerele asa cum sunt in sir daca sunt pare.
 */
public class Ex20 {

    public static void write(int array[], int n){
        for (int i = 0; i < n ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }

    public static void processingArray(int array[], int n){
        for (int i = 0; i < n/2 ; i++) {
            array[i] *= 2;
        }

        for (int i = n/2 + 1; i < n ; i++) {
            if (array[i] % 2 != 0) {
                array[i] *= 3;
            }
        }
        write(array, n);
    }

    public static void main(String[] args) {
        int[] array = {2, 6, 4, 7, 8, 13, 14, 5};
        int n = array.length;

        write(array, n);
        processingArray(array, n);
    }
}
