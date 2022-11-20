import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] emergency) {
        
        int[] answer = new int[emergency.length];
        int cnt = 1;
        
        List<Integer> list = Arrays.stream(emergency).boxed().collect(Collectors.toList()); // emergency를 list로 박싱
        
        Arrays.sort(emergency); // emergency 정렬

        for(int i = answer.length-1; i >= 0; i--){
            answer[list.indexOf(emergency[i])] = cnt++; // emergency의 수가 들어있는 list의 인덱스번호를 cnt로 1부터 넣어줌
        }
        
        return answer;
    }
}

// list.indexOf(n)

// 리스트의 원소 n의 인덱스를 반환
