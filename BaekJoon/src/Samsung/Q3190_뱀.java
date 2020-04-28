package Samsung;

import java.util.*;

public class Q3190_뱀 {
	static class Pair{
		int x; int y;
		Pair(int x, int y){
			this.x=x; this.y=y;
		}
	}
	public static int n, k, l;
	public static int dx[] = {0,1,0,-1}; // 오른 아래 왼 위
	public static int dy[] = {1,0,-1,0};
	public static int t[];
	public static int d[];
	public static int a[][];
	public static ArrayList<Pair> snake = new ArrayList<Pair>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt(); // 사과수
		a = new int[n][n];
		for(int i=0;i<k;i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			a[x-1][y-1] = 1;
		}
		l = sc.nextInt(); // 뱀 방향 변경 
		t = new int[l];
		d = new int[l];
		for(int i=0;i<l;i++) {
			t[i] = sc.nextInt();
			String s = sc.next();
			if(s.equals("D")) {
				d[i] = 1;
			}else {
				d[i] = -1;
			}
		}
		snake.add(new Pair(0,0));
		a[0][0] = 2;
		int ans = go(0,0,1,0);
		System.out.println(ans);
//		ArrayList list = new ArrayList();
//		list.add(1);
//		list.add(0,2);
//		System.out.println(list.get(1));
	}
	public static int go(int x, int y, int time,int dir) {
		
		int nx = x+dx[dir];
		int ny = y+dy[dir];
//		System.out.println(time+": "+nx+", "+ny+" dir: "+dir);
		
		if(nx<0||nx>=n||ny<0||ny>=n) { // 벽
			// 끝 
//			System.out.println("wall");
			return time;
		}
		
		if(a[nx][ny]==2) { // 몸통 
			// 끝
//			System.out.println("body");
			return time;
		}
		// 머리 추가
		snake.add(0, new Pair(nx,ny));
//		a[nx][ny] = 2;
		if(a[nx][ny]==1) { // 사과
//			a[nx][ny]=0; // 먹음
			a[nx][ny] = 2;
		}else { // 빈칸
			a[nx][ny] = 2;
			// 꼬리 지움
			Pair tail = snake.remove(snake.size()-1);
			a[tail.x][tail.y] = 0;
		}
//		for(int i=0;i<snake.size();i++) {
//			System.out.println(snake.get(i).x+", "+snake.get(i).y);
//		}
		// 방향 바꿔 준다.
		for(int i=0;i<l;i++) {
			if(time == t[i]) {
				dir = (dir+d[i]+4)%4;
			}
		}
		return go(nx, ny, time+1, dir);
	}
}
