package sorting_algorithms;

class Selection {
    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            // swapping
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] a = {6, 2, 5, 65, 7, 2, 4, 7};
        for (int element : selectionSort(a)) {
            System.out.println(element);
        }

    }
}