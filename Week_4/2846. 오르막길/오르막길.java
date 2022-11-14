import java.util.*;

public class Main {
    public static void main(String args[]) {
      ArrayList<Integer> list = new ArrayList<>();
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      
      int before = sc.nextInt();
      list.add(0); // 첫 오르막 크기는 0
      
      for(int i = 1; i < n; i++){
          int current = sc.nextInt();
          
          if(current > before) list.add(list.get(i - 1) + current - before); // current > before
          else list.add(0); // current <= before
          
          before = current;
      }
      
      System.out.print(Collections.max(list));
    }
}

// current > before 일 때 current - before로 오르막 크기를 list에 add
// list에 들어있는 전의 오르막 크기도 더해줘야 함
// 더해주지않으면 current와 before의 차이 값만 나옴

// 그 나머지 경우인 같거나 작을 때 0을 add해주어 오르막 크기 초기화

// before에 current를 넣고 다음 진행

// list의 max 출력
