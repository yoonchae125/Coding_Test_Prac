package Samsung;

import java.util.Scanner;

public class Q15684_사다리조작 {
	public static int N,M,H;
	public static int ans=4;
	public static int a[][];
	public static boolean check(int a[][]) {
		for(int i=1;i<=N;i++) {
			int start = i;
			for(int j=1;j<=H;j++) {
				if(a[j][start]==0) {
					continue;
				}else if(a[j][start]==-1) {
					start = start-1;
				}else if(a[j][start]==1){
					start = start+1;
				}
			}
			if(start!=i)
				return false;
		}
		return true;
	}
	public static void add(int c,int idx) {
		if(check(a)) {
			ans = Math.min(ans, c);
		}
		if (c>2)
			return;
		for(int i=idx;i<=H;i++) {
			for(int j=1;j<N;j++) {
				if(a[i][j]!=0)
					continue;
				if(a[i][j+1]!=0)
					continue;
				a[i][j]=1;
				a[i][j+1]=-1;
				add(c+1,i);
				a[i][j]=0;
				a[i][j+1]=0;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		H = sc.nextInt();
		a = new int[H+1][N+1]; //1 : ->, -1 : <-
		for(int i=0;i<M;i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			a[n][m] = 1;
			a[n][m+1] = -1;
			
		}
	
//		for (int i=1;i<=H;i++) {
//			for(int j=1;j<=N;j++) {
//				System.out.print(a[i][j]+"\t");
//			}System.out.println();
//		}
		add(0,1);
		if(ans>3)
			ans=-1;
		System.out.println(ans);
	}

}
