import java.util.*;

public class Ex3 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while(start()) {
			System.out.println("게임시작");
			char[] random = randomInit();
			while(check(random));
		}
		System.out.println("게임종료");
	}
	
	public static boolean start() { // 게임시작 확인
		while(true) {
			System.out.println("시작 : 1, 종료 : 0");
			int start = sc.nextInt();
		
			if(start == 1 || start == 0) {
				return start == 1 ? true : false;
			}
			System.out.println("0과 1만 입력하세요");
		}
	}
	
	public static char[] randomInit(){ // random값 설정
		int random = 0;
		
		char[] ch = new char[3];
		
		while(true) {
			random = (int) (Math.random() * (999 - 100 + 1) + 100);
//			System.out.println(random);
			int a = random % 10;
			random /= 10;
			int b = random % 10;
			random /= 10;
			int c = random % 10;
			
			if(a != b && a != c && b != c) {
				ch[0] = (char)(c + 48);
				ch[1] = (char)(b + 48);
				ch[2] = (char)(a + 48);
				break;
			}
		}
		return ch;
	}
	
	public static boolean check(char[] random) { // 입력받아 random과 check
		char[] input = sc.next().toCharArray();
		int strike = 0;
		int ball = 0;
		
		for(int i = 0; i < 3; i++) {
			if(random[i] == input[i]) {
				strike++;
				continue;
			}
			else if(String.valueOf(random).contains(Character.toString(input[i]))) ball++;
		}
		System.out.println(strike + "스트라이크, " + ball + "볼");
		if(strike == 3) return false;
		else return true;
	}
}
