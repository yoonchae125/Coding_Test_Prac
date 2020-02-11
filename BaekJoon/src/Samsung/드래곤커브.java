package Samsung;
import java.util.*;
public class 드래곤커브 {
	public static int dx[] = {1, 0, -1, 0};
	public static int dy[] = {0, -1, 0, 1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean[][] map = new boolean[101][101];

		
		//x, y, d, g
		// (x,y) 드래곤 커브의 시작 점, d는 시작 방향, g는 세대
		// 0: x좌표가 증가하는 방향 (→)
		// 1: y좌표가 감소하는 방향 (↑)
		// 2: x좌표가 감소하는 방향 (←)
		// 3: y좌표가 증가하는 방향 (↓)
	
		for(int i=0;i<n;i++) {
			int x= sc.nextInt();
			int y= sc.nextInt();
			int d= sc.nextInt();
			int g= sc.nextInt();
			
			map[x][y]=true;
			
			int end = (int) Math.pow(2, g);
			int[] gs = new int[end];
			gs[0]=d;
			for(int j=1;j<=g;j++) {
				int start = (int)Math.pow(2, j-1);
				for(int idx=0;idx<start;idx++) {
					gs[idx+start]=(gs[start-idx-1]+1)%4;
				}
			}
			//점 찍기 
			for(int gg: gs) {
				x+=dx[gg];
				y+=dy[gg];
				map[x][y]=true;
			}
		}
		
		int count=0;
		// 맵 탐색
	    int cnt = 0;
	    for (int i = 0; i < 100; i++) {
	        for (int j = 0; j < 100; j++) {
	            if (map[i][j] && map[i][j + 1] && map[i + 1][j] && map[i + 1][j + 1]) {
	                cnt++;
	            }
	        }
	    }
	    System.out.println(cnt);

	}
	static class Point{
		int x,y;
		Point(int x, int y){
			this.x=x;
			this.y=y;
		}
		void printP() {
			System.out.print("("+x+", "+y+")");
		}
	}

}
