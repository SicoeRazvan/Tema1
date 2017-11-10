
/*
     Se da un sir de numere. Sa se afiseze perechile de numere pentru care  primul numar este mai mare decat al doilea.
     de ex pt 11 13 9 8 16 se va afisa   13 9 , 9 8
 */
public class Ex17 {
    public static void main(String[] args) {
        int[] array = {11, 13, 9, 8, 16};


        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] > array[i + 1]){
                System.out.println(array[i] + " " + array[i + 1]);
            }
        }
    }
}
