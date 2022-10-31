class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] cnt = new int[1001]; // 원소의 개수를 카운트할 배열
        int[] dup = new int[1001]; // 원소의 개수의 중복을 체크 할 배열
        
        for(int x : array){ // 원소를 인덱스로 사용해 그 원소의 값을 증가
            cnt[x]++;
        }
        
        int max = 0;
        int index = 0;
        
        for(int i = 0; i < cnt.length; i++){ // cnt 배열에서 최대값 구하기, i는 array배열의 원소값, cnt는 그 원소의 개수
            if(max <= cnt[i]){ // cnt[i]가 max보다 크거나 작을 때
                max = cnt[i]; // max에 cnt[i]값을 넣어줌
                dup[max]++; // dup배열에 원소의 개수를 카운트 한 값을 증가                
                index = i; // 인덱스에 현재 i넣어줌
            }
        }
        if(dup[max] > 1) return -1; // dup[max]가 두개 이상 나왔으면 -1
        
        return index; // 아니면 이거 리턴
    }
}
