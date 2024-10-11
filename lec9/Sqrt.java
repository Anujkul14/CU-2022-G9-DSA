package lec9;

public class Sqrt {
    public static int binSearchSqrt(int n)
    {
        int start = 0;
        int end = n;
        int ans = 0;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(mid * mid == n)
            {
                return mid;
            }
            else if(mid * mid < n)
            {
                //right side
                start = mid + 1;
            }
            else {
                //left side
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(binSearchSqrt(25));
        System.out.println(binSearchSqrt(36));
    }
}
