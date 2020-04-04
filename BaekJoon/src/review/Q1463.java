package review;

import java.util.Scanner;

public class Q1463 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int d[]=new int[n+1]; //d[n] = n을 1로 만드는 방법 최소값 
		d[1]=0;
		for(int i=2;i<=n;i++) {
			d[i] = d[i-1]+1;
			if(i%2==0) {
				d[i]=Math.min(d[i], d[i/2]+1);
			}
			if(i%3==0) {
				d[i]=Math.min(d[i], d[i/3]+1);
			}
		}
		System.out.println(d[n]);
	}

}
