package review;

import java.util.Scanner;

public class Q1699 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d[] = new int[n+1];
		
		for(int i=1;i<=n;i++) {
			d[i] = i;
			for(int j=0;j*j<n;j++) {
				if(d[i]>d[i-j*j]+1)
					d[i]=d[i-j*j]+1;
			}
		}
		System.out.println(d[n]);
	}

}
