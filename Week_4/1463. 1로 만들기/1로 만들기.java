import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      long dp[] = new long[n+1];
      for(int i=2;i<=n;i++)
      {
          dp[i] = dp[i-1]+1; // n-1
          if(i%3 == 0 && dp[i] > dp[i/3] + 1) dp[i] = dp[i/3] + 1; // n/3
          if(i%2 == 0 && dp[i] > dp[i/2] + 1) dp[i] = dp[i/2] + 1; // n/2
      }
      System.out.println(dp[n]);
    }
}

// 2 => 1
// 3 => 1
// 4 => 2
// 5 => 3
// 6 => 2
// 7 => 3
// 8 => 3
// 9 => 2
// 10 => 3

// n-1, n/2, n/3이 1이 되기위한 최소횟수 + 1

// min(n-1, n/2, n/3) + 1
