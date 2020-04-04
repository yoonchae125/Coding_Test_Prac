package review;

import java.util.*;

public class Q7576 {

	public static void main(String[] args) {
		int dx[] = {1,-1,0,0};
		int dy[] = {0,0,1,-1};
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a[][] = new int[n][m];
		int c[][] = new int[n][m];
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i=0;i<n;i++)
			Arrays.fill(c[i], -1);
		int empty=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j] = sc.nextInt();
				if(a[i][j]==1) {
					q.add(i); q.add(j);
					c[i][j]=0;
				}
				if(a[i][j]==-1) {
					empty++;
				}
			}
		}
		while(!q.isEmpty()) {
			int x = q.poll(); int y = q.poll();
			for(int i=0;i<4;i++) {
				int nx = x+dx[i];
				int ny = y+dy[i];
				if(nx<0||nx>=n||ny<0||ny>=m)
					continue;
				if(c[nx][ny]==-1 && a[nx][ny]!=-1) {
					c[nx][ny]=c[x][y]+1;
					q.add(nx); q.add(ny);
					
				}
			}
		}
		
		int ans = 0;
		int emp=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(c[i][j]==-1)
					emp++;
				ans = Math.max(ans,  c[i][j]);
			}
			
		}
		
		if(emp!=empty)
			System.out.println(-1);
		else
			System.out.println(ans);
		
	}

}
