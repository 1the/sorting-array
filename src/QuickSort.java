public class QuickSort {
    public static void quick_sort(int [] array, int left, int right) {
        if (left < right) {
            int q = position(array, left, right);
            quick_sort(array, left, q-1);
            quick_sort(array, q+1, right);
        }
    }
    private static int position(int array [], int left, int right) {
        int i = left - 1;
        for (int j = left ; j < right ; j++) {
            if (array[j] < array[right]) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i+1, right);
        return i+1;
    }
    private static void swap(int [] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void main(String [] args) {
        int [] array= {3, 1, 5, 4, 2};
        System.out.print("original array: ");
        for (int i = 0 ; i < array.length ; i++) {
            System.out.print(array[i]);
            System.out.print(' ');
        }
        System.out.println();
        quick_sort(array, 0, array.length - 1);
        System.out.print("sorted array: ");
        for (int i = 0 ; i < array.length ; i++) {
            System.out.print(array[i]);
            System.out.print(' ');
        }
        System.out.println();
    }
}
