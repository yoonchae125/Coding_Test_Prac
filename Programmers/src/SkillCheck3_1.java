import java.util.ArrayList;

public class SkillCheck3_1 {

	public static int[] solution(int n) {
		int length = (int) Math.pow(2, n)-1;
		int[] answer = new int[length];
		ArrayList<Integer> fold[] = new ArrayList[n+1];
		for(int i=1;i<=n;i++) {
			fold[i] = new ArrayList<Integer>();
			if(i==1) fold[i].add(0);
			else {
				fold[i].addAll(fold[i-1]);
				fold[i].add(0);
				for(int j=fold[i-1].size()-1;j>=0;j--) {
					if(fold[i-1].get(j)==1)
						fold[i].add(0);
					if(fold[i-1].get(j)==0)
						fold[i].add(1);
				}
			}
		}
		for(int i=0;i<answer.length;i++) {
			answer[i] = fold[n].get(i);
		}
	    return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans1[] = solution(1);
		for(int i:ans1) {
			System.out.print(i+" ");
		}System.out.println();
		
		int ans2[] = solution(2);
		for(int i:ans2) {
			System.out.print(i+" ");
		}System.out.println();
		
		int ans3[] = solution(3);
		for(int i:ans3) {
			System.out.print(i+" ");
		}System.out.println();
		
		int ans4[] = solution(4);
		for(int i:ans4) {
			System.out.print(i+" ");
		}System.out.println();
		
	}

}
