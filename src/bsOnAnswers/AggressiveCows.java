package bsOnAnswers;

/* Aggressive Cows Problem Assign C cows to N stalls such that min distance
  between them is largest possible.  Return largest minimum distance.*/
import java.util.Arrays;

public class AggressiveCows {

    public static int aggressiveCows(int[] stalls, int cows) {
        Arrays.sort(stalls);

        int s = 1;
        int e = stalls[stalls.length - 1] - stalls[0];
        int ans = 0;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (canPlace(stalls, cows, mid)) {
                ans = mid;      // store possible answer
                s = mid + 1;    // try bigger distance
            } else {
                e = mid - 1;    // reduce distance
            }
        }

        return ans;
    }

    private static boolean canPlace(int[] stalls, int cows, int dist) {
        int count = 1;               // first cow placed
        int lastPos = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPos >= dist) {
                count++;
                lastPos = stalls[i];

                if (count == cows)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 4, 9};
        int c = 3;
        System.out.println(aggressiveCows(arr, c));
    }
}
