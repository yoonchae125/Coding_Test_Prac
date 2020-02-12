package Samsung;

import java.util.*;

public class 연구소 {
	static LinkedList queue = new LinkedList<Point>();
	
	static int n,m;
	static int map[][];
	static int answer=0;
	
	// 아래, 오른, 왼, 위 
	static int dx[]= {0,1,-1,0};
	static int dy[]= {1,0,0,-1};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n=sc.nextInt();
		m=sc.nextInt();
		map=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				map[i][j]=sc.nextInt();
				if(map[i][j]==2) {
					queue.add(new Point(i,j));
				}
			}
		}
//		printMap(map);
		if(map[0][0]==0) {
			ArrayList<Point> points=new ArrayList<Point>();
			points.add(new Point(0,0));
			makeWall(points,new Point(0,0));
			makeWall(null,new Point(0,0));
		}else {
			makeWall(null,new Point(0,0));
		}
		System.out.println(answer);
	}

	public static void makeWall(ArrayList<Point> points,Point last) {
		if(points!=null) {
			if(points.size()==3) {
//				System.out.println("----");
//				for(Point p:points) {
//					System.out.println(p.x+","+p.y);
//				}
//				System.out.println("----");
				spread(points);
				return;
			}
		}
		int x = last.x;
		int y = last.y;
		
		if(x>=n&&y>=m)
			return;
		
		int flag=0;
		for(int i=x;i<n;i++) {
			int j;
			if(i==x) {
				j=y+1;
			}else {
				j=0;
			}
			for(;j<m;j++) {
				if(map[i][j]==0) {
					x=i; y=j;
					flag=1;
					break;
				}
			}
			if (flag==1)
				break;
			
		}
		if(flag==0)
			return;
		ArrayList<Point> p1;
		if(points==null)
			p1 = new ArrayList<Point>();
		else
			p1= (ArrayList<Point>) points.clone();
		p1.add(new Point(x,y));
		makeWall(p1,new Point(x,y));
		
		ArrayList<Point> p2;
		if(points==null)
			p2 = null;
		else
			p2= (ArrayList<Point>) points.clone();
		makeWall(p2,new Point(x,y));
	}
	
	public static void spread(ArrayList<Point> points) {
		int copyMap[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				copyMap[i][j]=map[i][j];
			}
		}
		for(Point p: points) {
			copyMap[p.x][p.y]=1;
		}
		Queue q =(Queue) queue.clone();
		while(!q.isEmpty()) {
			Point p = (Point) q.poll();
			int x=p.x;
			int y=p.y;
//			System.out.println(x+","+y);
			for(int i=0;i<4;i++) {
				int mx=x+dx[i];
				int my=y+dy[i];
				if(mx>=n||mx<0||my>=m||my<0)
					continue;
				if(copyMap[mx][my]==0) {
					copyMap[mx][my]=2;
					q.add(new Point(mx,my));
				}
			}
		}
		int count = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(copyMap[i][j]==0)
					count++;
			}
		}
//		printMap(copyMap);
		answer=Math.max(count, answer);
	}
	public static void printMap(int map[][]) {
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[i].length;j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
	static class Point{
		int x, y;
		Point(int x,int y){
			this.x=x;
			this.y=y;
		}
	}
}
