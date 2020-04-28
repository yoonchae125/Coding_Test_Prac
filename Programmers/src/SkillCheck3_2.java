import java.util.*;

public class SkillCheck3_2 {

	public static int solution(int[] budgets, int M) {
		int answer = 0;
		
		
		
		Arrays.sort(budgets);
		int len = budgets.length;
		int S=calSum(budgets,budgets[len-1]);
		if(S<=M)
			return budgets[len-1];
		int[] sums = new int[len];
		int a=0;
		int before = calSum(budgets,budgets[0]);
		for(a=1;a<len;a++) {
			
			int sum = calSum(budgets,budgets[a]);
			if(sum>=M) {
				a--;
				break;
			}
//			System.out.println(a);
//			System.out.println(before+","+sum);
			if(sum<before) {
				a--;
				break;
			}
			before = sum;
		}
		
		if(a==len) a--;
//		System.out.println("a:"+a);
		if(a<len-1) {
//			System.out.println("a:"+a);
			int maxSum=sums[a];
			int maxLimit=budgets[a];
			for(int i=budgets[a]+1;i<budgets[a+1];i++) {
//				System.out.println(i);
				int sum = calSum(budgets,i);
				if(sum>M) break;
				if(sum>maxSum) {
					
					maxSum = sum;
					maxLimit = i;
				}else break;
			}
			answer = maxLimit;
		}
		else answer = budgets[a];
		return answer;
    }
	public static int calSum(int[] budgets,int limit) {
		int sum=0;
		for(int budget:budgets) {
			if(budget>=limit) {
				sum+=limit;
			}else {
				sum+=budget;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		int budgets[] = {120, 110, 140, 150};
		int ans = solution(budgets,485);
		System.out.println(ans);
	}

}
