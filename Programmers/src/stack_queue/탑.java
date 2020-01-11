package stack_queue;

public class 탑 {
	public static int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        
        for(int i=heights.length-1;i>0;i--) {
        	for(int j=i-1;j>=0;j--) {
        		if(heights[i]<heights[j]) {
        			answer[i]=j+1;
        			break;
        		}
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		int[] heights1 = {6, 9, 5, 7, 4};
		int[] heights2 = {3, 9, 9, 3, 5, 7, 2};
		int[] heights3 = {1, 5, 3, 6, 7, 6, 5};
		
		int[] answer1 = solution(heights1); // 0, 0, 2, 2, 4
		int[] answer2 = solution(heights2); // 0, 0, 0, 3, 3, 3, 6
		int[] answer3 = solution(heights3); // 0, 0, 2, 0, 0, 5, 6
		
		for(int a : answer1) {
			System.out.print(a+", ");
		}
		System.out.println();
		for(int a : answer1) {
			System.out.print(a+", ");
		}
		System.out.println();
		for(int a : answer1) {
			System.out.print(a+", ");
		}
	}

}
