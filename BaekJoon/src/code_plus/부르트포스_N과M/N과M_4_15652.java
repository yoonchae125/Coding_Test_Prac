package code_plus.부르트포스_N과M;

import java.util.Scanner;

public class N과M_4_15652 {
	static int a[];
	static boolean c[];
	public static void go(int n, int m, int idx,int start) {
		if(idx==m) {
			for(int i=0;i<m;i++) {
				System.out.print(a[i]+" ");
			}System.out.println();
			return;
		}
		for(int i=start;i<n;i++) {
//			if(c[i]) continue;
//			c[i]=true;
			a[idx]=i+1;
			go(n,m,idx+1,i);
//			c[i]=false;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		a = new int[m];
		c = new boolean[n];
		go(n,m,0,0);
	}

}
