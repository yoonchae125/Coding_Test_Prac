package review;

import java.util.*;

public class Q3055 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int a[][] = new int[r][c];
		int check[][] = new int[r][c];
		int water[][] = new int[r][c];
		for(int i=0;i<r;i++) {
			Arrays.fill(check[i], -1);
			Arrays.fill(water[i], -1);
		}
		int Dx=0,Dy=0;
		int Sx=0,Sy=0;
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i=0;i<r;i++) {
			String str = sc.next();
			for(int j=0;j<c;j++) {
				char ch = str.charAt(j);
				switch(ch) {
					case 'D':
						Dx = i; Dy = j;
						break;
					case 'S':
						Sx = i; Sy = j;
						break;
					case '.':
						break;
					case '*':
						water[i][j]=0;
						q.add(i); q.add(j);
						break;
					case 'X':
						water[i][j]=0;
						break;
				}
			}
		}
//		for(int i=0;i<r;i++) {
//			for(int j=0;j<c;j++) {
//				System.out.print(water[i][j]+" ");
//			}System.out.println();
//		}
		int dx[] = {1,-1,0,0};
		int dy[] = {0,0,1,-1};
		boolean f = false;
		while(!q.isEmpty()) {
			int x = q.poll(); int y=q.poll();
			for(int i=0;i<4;i++) {
				int nx = x+dx[i];
				int ny = y+dy[i];
				
				if(nx<0||nx>=r||ny<0||ny>=c)
					continue;
				if(nx==Dx&&ny==Dy)
					continue;
				if(water[nx][ny]==-1) {
					water[nx][ny]=water[x][y]+1;
					q.add(nx); q.add(ny);
				}
			}
		}
//		for(int i=0;i<r;i++) {
//			for(int j=0;j<c;j++) {
//				System.out.print(water[i][j]+" ");
//			}System.out.println();
//		}System.out.println();
		q.add(Sx); q.add(Sy);
		check[Sx][Sy]=0;
		while(!q.isEmpty()) {
			int x = q.poll(); int y=q.poll();
			for(int i=0;i<4;i++) {
				int nx = x+dx[i];
				int ny = y+dy[i];
				
				if(nx<0||nx>=r||ny<0||ny>=c)
					continue;
				if(nx==Dx&& ny==Dy) {
					check[nx][ny]=check[x][y]+1;
					break;
				}
				if(water[nx][ny]>check[x][y]+1) {
					
					check[nx][ny]=check[x][y]+1;
					q.add(nx); q.add(ny);
				}
			}
		}
//		for(int i=0;i<r;i++) {
//			for(int j=0;j<c;j++) {
//				System.out.print(check[i][j]+" ");
//			}System.out.println();
//		}
		if(check[Dx][Dy]==-1)
			System.out.println("KAKTUS");
		else
			System.out.println(check[Dx][Dy]);
			
	}

}
