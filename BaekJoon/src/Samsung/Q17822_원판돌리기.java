package Samsung;

import java.util.*;

public class Q17822_원판돌리기 {
	public static int dx[]= {1,-1,0,0};
	public static int dy[]= {0,0,1,-1};
	public static int n,m,t;
	public static ArrayList<Integer> dq[];
	public static ArrayList<Integer> nq[];
	public static void rotate(int idx,int d,int k) {
//		System.out.println(idx+"원 "+k+"번 회전 ");
		while(k-->0) {
			if(d==0) { //clock
				dq[idx].add(0,(dq[idx].remove(m-1)));
			}
			if(d==1) { //counter
				
				dq[idx].add(m-1,dq[idx].remove(0));
			}
		}
	}
	public static boolean removeNear() {
		nq = new ArrayList[n+1];
		for(int i=1;i<=n;i++) {
			nq[i]=new ArrayList(dq[i]);
		}
		boolean exist = false;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<m;j++) {
				if(dq[i].get(j)==-1)
					continue;
				for(int d=0;d<4;d++) {
					int nx = i+dx[d];
					if(nx==n+1) continue;
					if(nx==0) continue;
					int ny = j+dy[d];
					if(ny==m) ny=0;
					if(ny==-1) ny=m-1;
//					if(i==2 && j==0) {
//						System.out.println(nx+" "+ny);
//						System.out.println(dq[i].get(j));
//						System.out.println(dq[nx].get(ny));
//					}
					if(dq[i].get(j) == dq[nx].get(ny)) {
//						if(i==2 && j==0)
//							System.out.println("지움 ");
						exist = true;
						nq[i].remove(j);
						nq[i].add(j,-1);
						nq[nx].remove(ny);
						nq[nx].add(ny,-1);
					}
				}
			}
		}
		return exist; 
	}
	public static void changeAvg() {
		double avg = getAvg();
		if(avg==-1)
			return;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<m;j++) {
				if(dq[i].get(j)!=-1) {
					int a = dq[i].get(j);
					if(dq[i].get(j)>avg) {	
						dq[i].remove(j);
						dq[i].add(j,a-1);
					}
					else if(dq[i].get(j)<avg) {	
						dq[i].remove(j);
						dq[i].add(j,a+1);
					}
				}
			}
		}
	}
	public static double getAvg() {
		int sum=0;
		int count=0;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<m;j++) {
				if(dq[i].get(j)!=-1) {
					sum+=dq[i].get(j);
					count+=1;
				}
			}
		}
		if(count==0)
			return -1;
		return (double)sum/count;
	}
	public static int getSum() {
		int sum=0;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<m;j++) {
				if(dq[i].get(j)!=-1) {
					sum+=dq[i].get(j);
				}
			}
		}
		return sum;
	}
	public static void printCircle() {
		for(int i=1;i<=n;i++) {
			for(int j:dq[i]) {
				System.out.print(j+" ");
			}System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		t = sc.nextInt();
		
		dq = new ArrayList[n+1];
		for(int i=1;i<=n;i++) {
			dq[i] = new ArrayList<Integer>();
			for(int j=0;j<m;j++) {
				dq[i].add(sc.nextInt());
			}
		}
		
		while(t-->0) { // rotate 
			int x = sc.nextInt();
			int d = sc.nextInt(); //0: clock 1:counterclock
			int k = sc.nextInt(); 
			for(int i=x;i<=n;i+=x) {
				rotate(i,d,k);
			}
//			System.out.println("돌리");
//			printCircle();
			if(removeNear()) { //1
				dq = nq;
//				dq = new ArrayList[n+1];
//				for(int i=1;i<=n;i++) {
//					dq[i]=new ArrayList(nq[i]);
//				}
//				printCircle();
			}else {//2
				changeAvg();
			}
//			System.out.println("정리");
//			printCircle();
		}
		int ans = getSum();
		System.out.println(ans);
//		printCircle();

		
		
	}

}
