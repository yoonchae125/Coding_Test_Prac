package code_plus.그래프와_BFS;

import java.util.*;

public class DFS와_BFS_1260 {
	static int n,m;
	static int a[][];
	static int c[];
	public static void DFS(int v) {
		
		if(c[v]==1)
			return;
		c[v]=1;
		System.out.print(v+" ");
		for(int i=1;i<=n;i++) {
			if(c[i]==0 && a[v][i]==1) {
				DFS(i);
			}
		}
	}
	public static void BFS(int v) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(v);
		c[v]=1;
		while(!q.isEmpty()) {
			int node = q.poll();
			System.out.print(node+" ");
			for(int i=1;i<=n;i++) {
				if(c[i]==0 && a[node][i]==1) {
					q.add(i);
					c[i]=1;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int v = sc.nextInt();
		
		a = new int[n+1][n+1];
		c = new int[n+1];
		
		for(int i=0;i<m;i++) {
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			a[c][d]=1;
			a[d][c]=1;
		}
//		for(int i=0;i<n+1;i++) {
//			for(int j=0;j<n+1;j++) {
//				System.out.print(a[i][j]+" ");
//			}System.out.println();
//		}
		DFS(v);  System.out.println();
		c = new int[n+1];
		BFS(v);
	}

}
