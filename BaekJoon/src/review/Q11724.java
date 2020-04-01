package review;

import java.util.*;

public class Q11724 {
	static boolean[] check;
	static int v;
	static int e;
	static ArrayList<Integer> a[];
	public static void bfs(int v) {
		for(int linked:a[v]) {
			if(!check[linked]) {
				check[linked]=true;
				bfs(linked);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		v = sc.nextInt();
		e = sc.nextInt();
		check = new boolean[v+1];
		a = new ArrayList[v+1];
		for(int i=1;i<=v;i++) {
			a[i] = new ArrayList<Integer>();
		}
		for(int i=0;i<e;i++) {
			int n = sc.nextInt();
			int u = sc.nextInt();
			a[n].add(u);
			a[u].add(n);
		}
		int c=0;
		for(int i=1;i<=v;i++) {
			if(!check[i]) {
				c++;
				bfs(i);
			
			}
		}
		System.out.println(c);
	}

}
