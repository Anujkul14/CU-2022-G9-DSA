package lec3;

public class TimeComplexityDemo {
    public static void main(String[] args) {
        int n = 10000;
        int i = 0;

        System.out.println("Hey");//O(1) -> constant time
        System.out.println("Hey");
        System.out.println("Hey");
        System.out.println("Hey");

        for(i = 1;i < n;i++)
        {
            //O(n)
            System.out.println("Hey");
        }

        while (i < n) {
            System.out.println("Hey");
            i++;
        }

        while (i <= n) {
            System.out.println("Hey");
            i *= 2;
        }

        while (n > 0) {
            System.out.println("Hey");
            n /= 2;
        }

        while (i <= n) {
            System.out.println("Hey");
            i += 2;
            i += 3;
        }

        while (i <= n) {
            System.out.println("Hey");
            i *= 2;
            i *= 3;
        }

        while (n > 0) {
            System.out.println("Hey");
            n /= 2;
            n /= 3;
        }

        int k = 3;
        while (i <= n) {
            System.out.println("Hey");
            i += k;
        }

        while (i <= n) {
            System.out.println("Hey");
            i *= k;
        }

        for (i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println("hey");
            }
        }

        for (i = 1; i * i <= n; i++) {
            System.out.println("hey");
        }

        for (i = 1; i <= n; i++) {
            for (int j = 1; j <= i * i; j++) {
                for (k = 1; k <= n / 2; k++) {
                    System.out.println("hey");
                }
            }
        }

        for (i = 1; i <= n; i *= 2) {
            System.out.println("hey");
        }

        for (i = n / 2; i <= n; i++) {
            for (int j = 1; j <= n / 2; j++) {
                for (k = 1; k <= n; k = k * 2) {
                    System.out.println("hey");
                }
            }
        }

        for (i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j += i) {
                System.out.println("hey");
            }
        }
    }
}
