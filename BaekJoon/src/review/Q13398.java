package review;

import java.util.Scanner;

public class Q13398 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		long d[][] = new long[n][2];
		d[0][0]=a[0]; d[0][1]=a[0];
		
		for(int i=1;i<n;i++) {
			d[i][0]=Math.max(d[i-1][0]+a[i],a[i]);
			d[i][1]=Math.max(d[i-1][1]+a[i], d[i-1][0]);
		}
		long ans = d[0][0];
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				if(d[i][j]>ans)
					ans = d[i][j];
			}
		}
		System.out.println(ans);
	}

}
