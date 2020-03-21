package code_plus.그래프와_BFS;

import java.util.*;

public class 숨바꼭질_1697 {
	static final int MAX = 1000000;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int d = sc.nextInt();
		
		int check[] = new int[MAX+1];
		Queue q = new LinkedList<Integer>();
		q.add(s);
		check[s]=1;
		
		while(!q.isEmpty()) {
			int now = (int) q.poll();
			int next;
			if(now-1>=0) {
				next = now-1;
				if(check[next]==0) {
					q.add(next);
					check[next] = check[now]+1;
					if(next==d)
						break;
				}
			}
			if(now+1<=MAX) {
				next = now+1;
				if(check[next]==0) {
					q.add(next);
					check[next] = check[now]+1;
					if(next==d)
						break;
				}
			}
			if(now*2<=MAX) {
				next = now*2;
				if(check[next]==0) {
					q.add(next);
					check[next] = check[now]+1;
					if(next==d)
						break;
				}
			}
		}
		
		System.out.println(check[d]-1);
	}

}
