package review;

import java.util.*;

public class Q15649 {
	static int a[];
	static boolean c[];
	public static void go(int n, int m, int idx) {
		if(idx==m) {
			for(int i=0;i<m;i++) {
				System.out.print(a[i]+" ");
			}System.out.println(); 
			return;
		}
		for(int i=0;i<n;i++) {
			if(c[i]) continue;
			c[i]=true;
			a[idx]=i+1;
			go(n,m,idx+1);
			c[i]=false;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		a = new int[m];
		c = new boolean[n];
		go(n,m,0);
	}

}
