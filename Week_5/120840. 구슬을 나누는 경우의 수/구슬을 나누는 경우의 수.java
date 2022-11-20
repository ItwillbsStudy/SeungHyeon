class Solution {
    public long solution(int balls, int share) {

        share = Math.min(balls - share, share);

        if (share == 0)
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
