package myStudy;
// queue1 = [3, 2, 7, 2]
// queue2 = [4, 6, 5, 1]

// 두 큐의 합을 같게 만들기

// 제한 // 입력 큐 길이 같고 1<= 큐 <= 30만
// 원소 1<= 10^9
// 산술 오버플로우 발생 가능성 long type 고려

// 각 큐의 원소 합을 같게 만들 수 없으면 -1
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;

class Solution1 {
    public int solution(int[] queue1, int[] queue2) {
        ArrayList<Integer> q1 = new ArrayList<>();
        ArrayList<Integer> q2 = new ArrayList<>();
        ArrayList<Integer> checkList = new ArrayList<>();
        
        long q1sum = 0;
        long q2sum = 0;
        
        
        for (int i=0; i<queue1.length; i++) {
        	q1.add(queue1[i]);
        	q2.add(queue2[i]);
            q1sum += q1.get(i);
            q2sum += q2.get(i);
            checkList.add(q1.get(i));
            checkList.add(q2.get(i));
        }

        checkList.sort(Comparator.reverseOrder());

        
        
        
        long checksum = 0;
        for (int i=0; i<checkList.size(); i++) {        	
            if (checksum + checkList.get(i) <= (q1sum + q2sum)/2) {
                checksum += checkList.get(i);
            }
        }
        if (checksum != (q1sum+q2sum)/2) return -1;
        
        int answer = 0;
        
        while (q1sum != q2sum) {
            if (q1sum > q2sum) {
                int value = q1.remove(0);
                q2.add(value);
                long lv = value;
                q1sum -= lv;
                q2sum += lv;
            } else {
                int value = q2.remove(0);
                q1.add(value);
                long lv = value;
                q1sum += lv;
                q2sum -= lv;
            }
            answer++;
        }

        return answer;
    }
}