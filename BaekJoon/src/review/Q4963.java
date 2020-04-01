package review;

import java.util.Scanner;

public class Q4963 {
	public static final int[] dx = {0, 0, 1, -1, 1, 1, -1, -1};
    public static final int[] dy = {1, -1, 0, 0, 1, -1, 1, -1};
	public static void dfs(int x,int y,int a[][],int c[][]) {
		int n = a.length;
		int m = a[0].length;
		for(int i=0;i<8;i++) {
			
			int nx = x+dx[i];
			int ny = y+dy[i];
			if(nx<0||nx>=n||ny<0||ny>=m)
				continue;
			if(c[nx][ny]==0 && a[nx][ny]==1) {
				c[nx][ny]=1;
				dfs(nx,ny,a,c);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int w = sc.nextInt();
			int h = sc.nextInt();
			if(w==0 && h==0)
				break;
			int a[][] = new int[h][w];
			int c[][] = new int[h][w];
			int count=0;
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					a[i][j] = sc.nextInt();
				}
			}
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					if(c[i][j]==0 && a[i][j]==1) {
						count++;
						dfs(i,j,a,c);
					}
				}
			}
			System.out.println(count);
		}
	}

}
