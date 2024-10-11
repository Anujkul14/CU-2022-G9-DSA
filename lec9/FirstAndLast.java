package lec9;

public class FirstAndLast {
    public static int firstAndLastBinSearch(int[] arr,int x)
    {
        int start = 0;
        int end = arr.length - 1;
        int ans  = -1;
        while(start >= end)
        {
            int mid = start + (end - start) / 2;
            //arr[mid] == target -> potential first occurance
            if(arr[mid] == x)
            {
                ans = mid;
                end = mid - 1;
            }
            else if(arr[mid] < x)
            {
                //right side
                start = mid + 1;
            }
            else {
                //left side
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {20,30,40,40,40,40,50,60};
        System.out.println(firstAndLastBinSearch(arr,40));
    }
}
