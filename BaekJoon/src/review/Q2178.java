package review;

import java.util.*;

public class Q2178 {
	public static int n,m;
	public static int a[][];
	public static int c[][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dx[] = {1,-1,0,0};
		int dy[] = {0,0,1,-1};
		
		n = sc.nextInt();
		m = sc.nextInt();
		a = new int[n][m];
		c = new int[n][m];
		for(int i =0;i<n;i++) {
			String str = sc.next();
			for(int j=0;j<m;j++) {
				a[i][j] = str.charAt(j)-'0';
			}
		}
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(0); q.add(0);
		c[0][0] = 1;
		while(!q.isEmpty()){
			int x = q.poll(); int y = q.poll();
			for(int i=0;i<4;i++) {
				int nx = x+dx[i];
				int ny = y+dy[i];
				if(nx<0||nx>=n||ny<0||ny>=m)
					continue;
				if(c[nx][ny]==0 && a[nx][ny]==1) {
					q.add(nx); q.add(ny);
					c[nx][ny] = c[x][y] + 1;
				}
			}
		}
		System.out.println(c[n-1][m-1]);
	}

}
