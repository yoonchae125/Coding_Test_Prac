package code_plus.다이나믹_프로그래밍;

import java.util.Scanner;


public class 카드구매하기2_16194 {
	static int p[];
	static int d[];
	static int go(int n) {
		if(d[n]>0)
			return d[n];
		for(int i=1;i<=n;i++) {
			if(d[n]==0)
				d[n] = p[i]+go(n-i);
			else
				d[n] = Math.min(d[n],p[i]+go(n-i) );
		}
		return d[n];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		p = new int[n+1];
		d = new int[n+1];
		
		for(int i=1;i<=n;i++) {
			p[i] = sc.nextInt();
		}
		d[0]=0;
		d[1]=p[1];
		
		System.out.println(go(n));
	}

}
