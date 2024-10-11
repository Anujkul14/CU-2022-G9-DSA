package lec9;

public class QuickSort {
    public static void quickSort(int[] arr,int start,int end)
    {
        if(start >= end)
        {
            return;
        }
        int pivotIndex = partition(arr,start,end);
        quickSort(arr,start,pivotIndex - 1);
        quickSort(arr,pivotIndex + 1,end);
    }

    public static int partition(int[] arr,int start,int end)
    {
        int pivotElement = arr[end];
        int pos = start;
        for(int i = start;i <= end;i++)
        {
            if(arr[i] <= pivotElement) {
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
                pos++;
            }
        }
        return pos - 1;
    }

    public static void main(String[] args) {
        int[] arr = {6,2,5,1,4,2,3};
        quickSort(arr,0,arr.length - 1);
        for(int i = 0;i < arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
