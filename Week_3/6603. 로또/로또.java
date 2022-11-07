import java.util.*;

public class Main {
    static int[] lottos = new int[13]; // 로또번호들 받을 배열
    static int[] lotto = new int[13]; // 로또 6개 정해서 출력 할 배열
    static int k; // 번호의 개수
    
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      
      do{ // 한번 실행한 후
           k = sc.nextInt(); // 수의 개수를 받기
          for(int i = 0; i < k; i++) lottos[i] = sc.nextInt(); // k만큼 번호를 받기
          dfs(0,0); // 탐색 시작
          System.out.println(); // 케이스가 끝나면 한칸 띄우기
      }
      while(k != 0); // while반복
    }
    
    static void dfs(int start, int depth){ // start는 첫 로또번호, depth는 로또 번호들
        if(depth == 6){ // depth가 6이 되면
            for(int i = 0; i < 6; i++) System.out.print(lotto[i] + " "); // 번호들 출력
            System.out.println(); // 줄바꿈
            return; // 종료
        }
        
        for(int i = start; i < k; i++){
            lotto[depth] = lottos[i]; // lotto에 번호를 넣어줌
            dfs(i+1, depth+1); // 다음 숫자 넣기
        } // 결국 depth는 그대로인채로 i만 바뀌기 때문에 lotto에 저장되는 수들이 달라짐
    }
} 
