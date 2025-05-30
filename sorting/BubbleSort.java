package sorting;
public class BubbleSort {
    public static void main(String[] args) {
        int[] my_array = { 64, 34, 25, 12, 22, 11, 90, 5 };
        // int[] my_array = { 7, 3, 9, 12, 11};
        int n = my_array.length;
        System.out.print("Array : ");
        for (int i : my_array) {
            System.out.print(i + " ");
        }
        // Time Complexity : O(n^2)
        for (int i = 0; i < n - 1; i++) { // ntimes
            boolean swap = false;
            for (int j = 0; j < n - i - 1; j++) { // n times
                if (my_array[j] > my_array[j + 1]) {
                    // my_array[j] = my_array[j] + my_array[j+1];
                    // my_array[j+1] = my_array[j+1] - my_array[j];
                    // my_array[j] = my_array[j + 1] + my_array[j];
                    int temp = my_array[j];
                    my_array[j] = my_array[j + 1];
                    my_array[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) 
                break;
            System.out.print("\nIteration " + (i + 1) + " : ");
            for (int j = 0; j < n; j++) {
                System.out.print(my_array[j] + " ");
            }
        }
        System.out.print("\nSorted Array : ");
        for (int j = 0; j < n; j++) {
            System.out.print(my_array[j] + " ");
        }
    }
}