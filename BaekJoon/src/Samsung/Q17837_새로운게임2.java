package Samsung;

import java.util.*;

public class Q17837_새로운게임2 {
//	public static Queue<Pair> q;
	public static boolean flag = false;
	public static int ans = 0;
	public static int loc[][]; // 말 위치
	public static int board[][]; // 체스판 
	public static ArrayList<Integer> status[][]; // 말들 쌓인 상태
	public static int N,K;
	public static int dx[]= {0,0,0,-1,1};
	public static int dy[]= {0,1,-1,0,0};
	public static void white(int t) {
		int x = loc[t][0]; int y = loc[t][1]; int d = loc[t][2];
		int nx = x+dx[d]; int ny = y+dy[d];
		//일단 이동 
		loc[t][0]=nx;
		loc[t][1]=ny;
		
		int start=-1;
		for(int i=0;i<status[x][y].size();i++) {
			int n = status[x][y].get(i);
			if(n==t) {
				start=i; break;
			}
		}
//		for(int i=start;i<status[x][y].size();i++) {
		while(status[x][y].size()>start) {
			int n = status[x][y].remove(start);
//			System.out.println("rm"+n);
			status[nx][ny].add(n);
			loc[n][0]=nx;
			loc[n][1]=ny;
		}
		if(status[nx][ny].size()>=4)
			flag=true;
//		for(int i:status[nx][ny]) {
//			System.out.print(i+"|");
//		}
		
	}
	public static void red(int t) {
		int x = loc[t][0]; int y = loc[t][1]; int d = loc[t][2];
		int nx = x+dx[d]; int ny = y+dy[d];
		//일단 이동 
		loc[t][0]=nx;
		loc[t][1]=ny;
		
		for(int i=status[x][y].size()-1;i>=0;i--) {
			int n = status[x][y].remove(i);
			status[nx][ny].add(n);
			loc[n][0]=nx;
			loc[n][1]=ny;
			if(n==t) break;
		}
		if(status[nx][ny].size()>=4)
			flag=true;
	}
	public static void blue(int t) {
		int x = loc[t][0]; int y = loc[t][1]; int d = loc[t][2];
		int nx = x+dx[d]; int ny = y+dy[d];
		// 방향 바꾸고 
		int nd=reverseDir(d);
		loc[t][2]=nd;
		nx = x+dx[nd]; ny = y+dy[nd];
		if(nx<1||nx>N||ny<1||ny>N) { // 체스판 밖
			return;
		}
		if(board[nx][ny]==2) { // 또 파랑
			return;
		}
		if(board[nx][ny]==0) { // white
			white(t);
			return;
		}
		if(board[nx][ny]==1) { // red
			red(t);
			return;
		}
	}
	public static int reverseDir(int d) {
		int nd=-1;
		switch(d) {
		case 1:
			nd=2; break;
		case 2: 
			nd=1; break;
		case 3: 
			nd=4; break;
		case 4:
			nd=3; break;
		}
		return nd;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		
		board = new int[N+1][N+1];
		status = new ArrayList[N+1][N+1];
		loc = new int[K+1][3];
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				board[i][j] = sc.nextInt();
				status[i][j] = new ArrayList<Integer>();
			}
		}
//		q = new LinkedList<Pair>();
	
		for(int i=1;i<=K;i++) {
			int x = sc.nextInt();
			loc[i][0] = x;
			int y = sc.nextInt();
			loc[i][1] = y;
			loc[i][2] = sc.nextInt();
			status[x][y].add(i);
//			q.add(new Pair(x,y,d));
		}
		while(true) {
			if(flag)
				break;
			ans++;
//			System.out.println(ans);
			if(ans>=1000) {
				ans=-1;
				break;
			}	
			
			for(int t=1;t<=K;t++) {
				
				int x = loc[t][0]; int y = loc[t][1]; int d = loc[t][2];
				int nx = x+dx[d]; int ny = y+dy[d];
				if(nx<1||nx>N||ny<1||ny>N) { // 체스판 밖
					blue(t);
				}
				else if(board[nx][ny]==2) { // 또 파랑
					blue(t);
				}
				else if(board[nx][ny]==0) { // white
//					System.out.println(x+","+y+","+nx+","+ny);
					white(t);
				}
				else if(board[nx][ny]==1) { // red
					red(t);
				}
				
			}
//			System.out.println("\nstatus");
//			for(int i=1;i<=N;i++) {
//				System.out.print(status[1][i]+",");
//			}
//			for(int i=1;i<=K;i++) {
//				int x = loc[i][0];
//					int y = loc[i][1];
//					int d = loc[i][2];
//					System.out.println(x+","+y+","+d);	
//			}
			
		}
		
		System.out.println(ans);
	}

}
