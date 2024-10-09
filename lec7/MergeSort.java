package lec7;
public class MergeSort {
    public static void mergeSort(int[] arr, int start, int end) {
        if (start >= end)
            return;

        int mid = start + (end - start) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int left = start;
        int right = mid + 1;
        int index = 0;

        while (left <= mid && right <= end) {
            if (arr[left] <= arr[right]) {
                temp[index++] = arr[left++];
            } else {
                temp[index++] = arr[right++];
            }
        }

        while (left <= mid) {
            temp[index++] = arr[left++];
        }

        while (right <= end) {
            temp[index++] = arr[right++];
        }

        for (int i = 0; i < temp.length; i++) {
            arr[start + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 1, 2, 9, 4};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
