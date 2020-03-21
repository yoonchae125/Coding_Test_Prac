package code_plus.그래프와_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 토마토_7576 {

	public static void main(String[] args) {
		int dx[] = {1,-1,0,0};
		int dy[] = {0,0,1,-1};
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a[][] = new int[n][m];
		int c[][] = new int[n][m];
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j] = sc.nextInt();
				if(a[i][j]==1) {
					q.add(i); q.add(j);
					c[i][j]=1;
				}
				if(a[i][j]==-1)
					c[i][j]=-1;
			}
		}
		
		
//		q.add(0); q.add(0);
//		c[0][0]=1;
		while(!q.isEmpty()) {
			int x = q.poll();
			int y = q.poll();
			
			for(int i=0; i<4; i++) {
				int nx = x+dx[i];
				int ny = y+dy[i];
				
				if(nx<0||nx>=n||ny<0||ny>=m)
					continue;
				if(c[nx][ny]==0 && a[nx][ny]==0) {
					q.add(nx); q.add(ny);
//					System.out.println(nx+", "+ny);
					c[nx][ny] = c[x][y] + 1;
				}
			}
		}
		boolean flag = false; 
		int ans = 0;
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<m;j++) {
//				System.out.print(c[i][j]+" ");
//				
//			}System.out.println();
//		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(c[i][j]==0) {
					flag = true;
					break;
				}
				ans = Math.max(ans,  c[i][j]);
			}
			if(flag) {
				break;
			}
		}
		if(flag) {
			System.out.println("-1");
		}else {
			System.out.println(ans-1);
		}
	}

}
