package code_plus.부르트_포스;

import java.util.Scanner;

public class 퇴사_14501_재귀 {
	static int n;
	static int T[];
	static int P[];
	static int ans=0;
	public static void go(int day, int sum) {
		if(day==n) {
			ans = Math.max(sum, ans);
			return;
		}
		if(day>n)
			return;
		go(day+T[day],sum+P[day]);
		go(day+1,sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		T = new int [n];
		P = new int [n];
		for(int i=0;i<n;i++) {
			T[i] = sc.nextInt();
			P[i] = sc.nextInt();
		}
		go(0,0);
		System.out.println(ans);
	}
}
