package sorting_algorithms;

public class BubbleSort {
    public static int[] bubbleSort(int[] a) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {6, 2, 5, 65, 7, 2, 4, 7};
        for (int element : bubbleSort(a)) {
            System.out.println(element);
        }

    }
}
