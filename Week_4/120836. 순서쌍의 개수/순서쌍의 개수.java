class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i * i <= n; i++) {
	        if (i * i == n) answer++;
	        else if (n % i == 0) answer += 2;
        }
        return answer;
    }
}

// 100의 순서쌍은 (1, 100), (2, 50), (4, 25), (5, 20), (10, 10), (20, 5), (25, 4), (50, 2), (100, 1)

// 숫자의 순서쌍이 같은 수를 중심으로 반복
//n % i 면 +2
// 순서쌍이 같으면 +1
// 뒤에는 같으므로 i * i > n 이면 종료
