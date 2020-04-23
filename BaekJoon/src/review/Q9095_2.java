package review;

import java.util.Scanner;

public class Q9095_2 {
	public static int go(int goal, int now) {
		if(now==goal) {
			return 1;
		}
		if(now>goal)
			return 0;
		return go(goal,now+1)+go(goal,now+2)+go(goal,now+3);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
			int n = sc.nextInt();
			System.out.println(go(n,0));
		}
	}

}
