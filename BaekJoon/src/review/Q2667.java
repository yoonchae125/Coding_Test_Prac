package review;

import java.util.*;

public class Q2667 {
	public static int n;
	public static int a[][];
	public static int c[][];
	public static int dx[] = {1,-1,0,0};
	public static int dy[] = {0,0,1,-1};
	public static ArrayList<Integer> num = new ArrayList<Integer>();
	public static void bfs(int X,int Y,int count) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(X); q.add(Y);
		c[X][Y]=count;
		int sum=1;
		while(!q.isEmpty()) {
			int x = q.poll(); int y = q.poll();
			for(int i=0;i<4;i++) {
				int nx = x+dx[i];
				int ny = y+dy[i];
				if(nx<0||nx>=n||ny<0||ny>=n)
					continue;
				if(c[nx][ny]==0&&a[nx][ny]==1) {
					c[nx][ny]=count;
					q.add(nx); q.add(ny);
					sum++;
				}
					
			}
		}
		num.add(sum);
	}
	public static void main(String[] args) {
		int count=0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		a = new int[n][n];
		c = new int[n][n];
		
		for(int i=0;i<n;i++) {
			String str = sc.next();
			for(int j=0;j<n;j++) {
				a[i][j] = str.charAt(j)-'0';
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a[i][j]==1&&c[i][j]==0) {
					count++;
					bfs(i,j,count);
				}
			}
		}
		System.out.println(count);
		Collections.sort(num);
		for(int s:num) {
			System.out.println(s);
		}
		
	}

}
