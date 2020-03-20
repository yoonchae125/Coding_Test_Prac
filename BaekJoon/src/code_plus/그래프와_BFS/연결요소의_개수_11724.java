package code_plus.그래프와_BFS;

import java.util.*;

public class 연결요소의_개수_11724 {
	static ArrayList<Integer>[] a;
	static int check[];
	static int n,m;
	public static void dfs(int v) {
		if(check[v]==1)
			return;
		check[v]=1;
		for(int i:a[v]) {
			if(check[i]==0)
				dfs(i);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		a = new ArrayList[n+1];
		check = new int[n+1];
		for(int i=1;i<=n;i++) {
			a[i] = new ArrayList<Integer>();
		}
		for(int i=0;i<m;i++) {
			int v = sc.nextInt();
			int u = sc.nextInt();
			a[v].add(u);
			a[u].add(v);
		}
//		for(int i=1;i<=n;i++) {
//			for(int j=0;j<a[i].size();j++) {
//				System.out.print(a[i].get(j)+" ");
//			}
//			System.out.println();
//		}
		int ans=0;
		for(int i=1;i<=n;i++) {
			if(check[i]==0) {
				ans++;
				dfs(i);
			}
			
		}
		System.out.println(ans);
	}

}
