import java.util.*;

public class Main {
    
    static char[][] map = new char[400][400]; // 최대로 들어올 수 있는 만큼 map으로 좌표 생성
    
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt(); // n 입력
      
      int line = 4 * (n - 1) + 1; // 총 몇줄 나와야하는지 계산
      
      for(int i = 0; i < line; i++) Arrays.fill(map[i],' '); // 출력 할 만큼 공백으로 채우기

      print(0, 0, n); // 별 찍기 시작
      
      for(int i = 0; i < line; i++){
          for(int j = 0; j < line; j++){
              System.out.print(map[i][j]); // 별 한줄 출력해주기~
          }
          System.out.println(); // 줄바꿈
      }
    }
    static void print(int x, int y, int n) { // x,y  = 좌표,  n = 몇번째 사각형인지
        if(n == 1){ // n == 1 이면
            map[x][y] = '*'; // * 찍기
            return; // 종료
        }
        int starcnt = 4 * (n-1) + 1; // n일 때 한 면의 별이 몇개인지 계산
        for(int i = 0; i < starcnt; i++){
            map[x + i][y] = '*';                // TOP
            map[x + i][y + starcnt - 1] = '*'; // BOTTOM
            map[x][y + i] = '*';                // LEFT
            map[x + starcnt - 1][y + i] = '*'; // RIGHT
        }
        print(x+2,y+2,n-1); // n-1 번째 사각형 별 찍기 시작
    }
}
