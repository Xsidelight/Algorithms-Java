package sorting_algorithms;

public class InsertionSort {
    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            // at this point we've exited, so j is either -1
            // or it's at the first element where current >= a[j]
            array[j+1] = current;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] a = {6, 2, 5, 65, 7, 2, 4, 7};
        for (int element : insertionSort(a)) {
            System.out.println(element);
        }

    }
}
