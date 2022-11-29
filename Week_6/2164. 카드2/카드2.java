import java.util.*;

public class Main {
    public static void main(String args[]) { // 그냥 조건대로 풀기
      Queue<Integer> queue = new LinkedList<>();
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      
      for(int i = 1; i <= n; i++){
          queue.offer(i);
      }
      for(int i = 0; i < n-1; i++){
          queue.remove();
          queue.offer(queue.poll());
      }
      System.out.println(queue.peek());
    }
    
    public static void secondSolution() { // 비트연산으로 풀기 (거듭제곱)
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int pow = 1;
      
      while(n > pow) pow = pow << 1; // 비트연산
      
      System.out.println(pow - (pow - n) * 2); // pow : 보다 큰 2의 거듭제곱수 중 제일 작은 수
                                               // pow - (pow - n) = n보다 작은 2의 거듭제곱 중 제일 큰 수와 n의 차이값
    }
}

/*
1 : 1

2 : 2

3 : 2
4 : 4

5 : 2
6 : 4
7 : 6
8 : 8

9 : 2
10: 4
11: 6
12: 8
13: 10
14: 12
15: 14
16: 16
*/
