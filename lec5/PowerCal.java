package lec5;

public class PowerCal {
    //myPow(3,4)
    public static double myPow(int a, int b)
    {
        if(b == 0)
            return 1;

        if(b < 0)
        {
            b = Math.abs(b);
            a = 1 / a;
        }
        double hp = myPow(a,b / 2);//myPow(3,2) -> 9
        if(b % 2 == 0)//even
            return hp * hp;
        else
            return hp * hp * a;

    }
}
