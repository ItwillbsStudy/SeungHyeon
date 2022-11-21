class Solution {
    public long solution(int balls, int share) {

        share = Math.min(balls - share, share); // (n-m)과 m 중 더 작은 값

        if (share == 0) // 고를게 없으면 1
            return 1L;

        long result = solution(balls - 1, share - 1);
        result *= balls;
        result /= share;

        return result;
    }
}

/*
8C3 => (8*7*6) / (3*2*1) => (7*6) / (2*1) * 8/3 

8 6 7 5 4 3 2 1
5 4 3 2 1 * 3 2 1

8 7 6
3 2 1

7 6 5 4 3 2 1
5 4 3 2 1 * 2 1

7 6
2 1
*/
