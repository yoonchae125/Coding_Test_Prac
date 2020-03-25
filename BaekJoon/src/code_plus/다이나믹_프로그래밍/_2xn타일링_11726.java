package code_plus.다이나믹_프로그래밍;

import java.util.Scanner;

public class _2xn타일링_11726 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d[] = new int[n+1];
		d[0]=0; d[1]=1; d[2]=2;
		for(int i=0;i<=n;i++) {
			if(i<=2)
				d[i]=i;
			else d[i] = (d[i-2]+d[i-1])%10007;
		}
		System.out.println(d[n]);
	}

}
