package lec2;

public class TeemoAttacking {
    class Solution {
        public int findPoisonedDuration(int[] timeSeries, int duration) {
            int totalPoisonedTime = 0;
            for(int i = 0;i < timeSeries.length - 1;i++)
            {
                if(timeSeries[i + 1] >= timeSeries[i] + duration)
                {
                    totalPoisonedTime += duration;
                }
                else
                {
                    totalPoisonedTime += timeSeries[i + 1] - timeSeries[i];
                }
            }
            return totalPoisonedTime + duration;
        }
    }
}
