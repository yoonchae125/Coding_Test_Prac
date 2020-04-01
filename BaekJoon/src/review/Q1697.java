package review;

import java.util.*;

public class Q1697 {
	static final int MAX = 1000000;
	public static void main(String[] args) {
		
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
