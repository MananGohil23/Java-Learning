import java.util.*;

class MergeSortedArrays {

    int arr1[] = {1, 3, 5, 7 , 9};
    int arr2[] = {2, 4, 6, 8 , 10 , 12 , 14};
    int merged[] = new int[arr1.length + arr2.length];

    MergeSortedArrays() {

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }

        System.out.println("Merged array: " +
                           Arrays.toString(merged));
    }

    public static void main(String args[]) {
        new MergeSortedArrays();
    }
}