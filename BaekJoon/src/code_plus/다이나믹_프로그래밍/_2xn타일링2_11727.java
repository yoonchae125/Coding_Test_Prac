package code_plus.다이나믹_프로그래밍;

import java.util.Scanner;

public class _2xn타일링2_11727 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d[] = new int[n+1];
		d[0]=1; d[1]=1; 
		for(int i=2;i<=n;i++) {
			
			d[i] = (d[i-2]+d[i-2]+d[i-1])%10007;
		}
		System.out.println(d[n]);
	}

}
