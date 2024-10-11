package lec8;

public class BinarySearch {
    public static int binSearch(int[] arr,int target)
    {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end)
        {
            int mid = (start + end) / 2;
            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[mid] < target)
            {
                //right side
                start = mid + 1;
            }
            else {
                //left side
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int binSearchRec(int[] arr,int start,int end,int target)
    {
        if(start > end)
        {
            return -1;
        }

        int mid = (start + end) / 2;
        if(arr[mid] == target)
            return mid;
        else if(arr[mid] < target)
            return binSearchRec(arr,mid + 1,end,target);
        else {
            return binSearchRec(arr,start,mid - 1,target);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,15,20,30,40,50};
        System.out.println(binSearch(arr,40));
        System.out.println(binSearchRec(arr,0,arr.length - 1,45));
    }
}
