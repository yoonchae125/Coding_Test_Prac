package code_plus.다이나믹_프로그래밍;

import java.util.Scanner;

public class _123더하기_9095 {
	static int d[];
	public static int go(int n) {
		if(d[n]>0) {
			return d[n];
		}
		d[n]=go(n-1)+go(n-2)+go(n-3);
		return d[n];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		d = new int[11];
		d[0]=1;
		d[1]=1;
		d[2]=2;
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			System.out.println(go(a));
		}
	}

}
