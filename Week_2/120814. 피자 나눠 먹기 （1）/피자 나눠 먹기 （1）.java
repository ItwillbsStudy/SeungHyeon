class Solution {
    public int solution(int n) {
        int answer = n % 7 == 0 ? n / 7 : n / 7 + 1; // 인원수를 7로 나누었을 때 남은 인원이 있으면 +1
        return answer;
    }
}
