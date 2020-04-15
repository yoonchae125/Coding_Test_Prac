package Samsung;

import java.util.*;

public class Q14503_로봇청소기 {
	public static int a[][];
	public static int check[][];
	public static int n,m,r,c;
	static int dx[] = {-1,0,1,0};
	static int dy[] = {0,1,0,-1};
	static int count =0;
	public static void dfs(int x, int y, int d) {
//		System.out.println(x+" "+y+"count "+count);
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<m;j++) {
//				System.out.print(a[i][j]);
//			}System.out.println();
//		}
		int nd = d;
		for(int i=0;i<4;i++) {
			nd = (nd+3)%4;
			int nx = x+dx[nd];
			int ny = y+dy[nd];
//			System.out.println("next "+nx+" "+ny);
			if(nx<0||nx>=n||ny<0||ny>=m) continue;
			if(a[nx][ny]>0) continue;
			count++;
			a[nx][ny] = 2; 
			dfs(nx,ny,nd); return;
		}
		nd = (d+2)%4;
		int nx = x+dx[nd];
		int ny = y+dy[nd];
		if(nx<0||nx>=n||ny<0||ny>=m) return;
		if(a[nx][ny] == 1) return;
		a[nx][ny] = 2;  
		dfs(nx,ny,d); return;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		r = sc.nextInt();
		c = sc.nextInt();
		int d = sc.nextInt();
		a = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		count++;
		a[r][c]=2;
		dfs(r,c,d);
		System.out.println(count);
	}

}
