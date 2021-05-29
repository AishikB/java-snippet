import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{21,12,2,4,51};
        int[] res = mergeSort(arr);
        Arrays.stream(res).forEach(System.out::println);
    }

    public static int[] mergeSort(int[] arr) {
        if(arr.length <= 1) {
            return arr;
        }
        int midpoint = arr.length/2;
        int[] left = new int[midpoint];
        int[] right = new int[arr.length - midpoint];

        for (int i=0; i<arr.length; i++) {
            if(i < midpoint)
            left[i] = arr[i];
            else right[i-midpoint] = arr[i];
        }
        int[] result = new int[arr.length];
        left = mergeSort(left);
        right = mergeSort(right);

        result = merge(left, right);
        return result;
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int resCounter = 0;
        int rightCounter = 0;
        int leftCounter = 0;

        while (leftCounter < left.length || rightCounter < right.length) {
            if(leftCounter < left.length && rightCounter < right.length) {
                if(left[leftCounter] < right[rightCounter]) {
                    result[resCounter++] = left[leftCounter++];
                }
                else {
                    result[resCounter++] = right[rightCounter++];
                }
            }
            else if(leftCounter < left.length) {
                result[resCounter++] = left[leftCounter++];
            }
            else {
                result[resCounter++] = right[rightCounter++];
            }
        }
        return result;
    }
}
