package review;

import java.util.Scanner;

public class Q15650 {
	public static int a[];
	public static void go(int n, int m, int idx,int start) {
		if(idx==m) {
			for(int i=0;i<m;i++) {
				System.out.print(a[i]+" ");
			}System.out.println();
			return;
		}
		for(int i=start;i<n;i++) {
			a[idx]=i+1;
			go(n,m,idx+1,i+1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		a = new int[m];
		
		go(n,m,0,0);
	}

}
