package DFS_BFS;

public class 타겟넘버_43165 {
	public static int solution(int[] numbers, int target) {
        int answer = go(numbers,target,0,0);
        return answer;
    }
	public static int go(int[]numbers,int target, int idx,int now) {
		if(idx==numbers.length) {
			if(target==now)
				return 1;
			return 0;
		}
		return go(numbers,target,idx+1,now+numbers[idx])+go(numbers,target,idx+1,now-numbers[idx]);
	}
	public static void main(String[] args) {
		int[] numbers= {1,1,1,1,1};
		int target=3;
		System.out.println(solution(numbers,target)); //5
	}

}
