package review;

import java.util.Scanner;

public class Q14501 {
	public static int n;
	public static int t[];
	public static int p[];
	public static int ans=0;
	public static void go(int day, int sum) {
		if(day==n) {
			ans = Math.max(ans,sum);
			return;
		}
		if(day>n)
			return;
		go(day+t[day],sum+p[day]);
		go(day+1,sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		t = new int[n];
		p = new int[n];
		
		for(int i=0;i<n;i++) {
			t[i] = sc.nextInt();
			p[i] = sc.nextInt();
		}
		go(0,0);
		System.out.println(ans);
		
	}

}
