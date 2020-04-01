package review;

import java.util.Arrays;
import java.util.Scanner;

public class Q15654 {
	public static int num[];
	public static int a[];
	public static boolean c[];
	public static StringBuilder sb = new StringBuilder();
	public static void go(int n, int m, int idx) {
		if(idx==m) {
			for(int i=0;i<m;i++) {
				sb.append(a[i]+" ");
			}sb.append("\n");
			return;
		}
		for(int i=0;i<n;i++) {
			if(c[i]) continue;
			c[i] = true;
			a[idx]=num[i];
			go(n,m,idx+1);
			c[i]=false;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		a = new int[m];
		num = new int[n];
		c = new boolean[n];
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
		}
		Arrays.sort(num);
		go(n,m,0);
		System.out.println(sb);
	}

}
