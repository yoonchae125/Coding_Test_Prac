package code_plus.부르트_포스;

import java.util.Scanner;

public class _123더하기_9095_재귀 {
	public static int go(int sum, int goal) {
		if(sum>goal)
			return 0;
		if(sum==goal)
			return 1;
		int now = 0;
		for(int i=1;i<=3;i++) {
			now+=go(sum+i,goal);
		}
		return now;
		
	}
	public static void main(String[] args)  {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n-- >0) {
			int goal = sc.nextInt();
            System.out.println(go(0, goal));
		}
	}
}
