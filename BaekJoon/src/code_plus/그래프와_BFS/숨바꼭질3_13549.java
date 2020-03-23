package code_plus.그래프와_BFS;

import java.util.*;

public class 숨바꼭질3_13549 {

	public static void main(String[] args) {
		int max = 1000000;
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int d = sc.nextInt();
		Queue q = new LinkedList<Integer>();
		Queue nq = new LinkedList<Integer>();
		int check[] = new int[max];
		Arrays.fill(check, -1);
		q.add(s);
		check[s]=0;
		while(!q.isEmpty()) {
			int now = (int) q.poll();
			if(now*2<max) {
				if(check[now*2]<0) {
					check[now*2]=check[now];
					if(now*2==d) {
						break;
					}
					q.add(now*2);
				}
			}
			if(now-1>=0) {
				if(check[now-1]<0) {
					
					check[now-1]=check[now]+1;
					if(now-1==d) {
						break;
					}
					nq.add(now-1);
				}
			}
			if(now+1<max) {
				if(check[now+1]<0) {
					check[now+1]=check[now]+1;
					if(now+1==d) {
						break;
					}
					nq.add(now+1);
				}
			}
			
			if(q.isEmpty()) {
				q = nq;
				nq = new LinkedList<Integer>();
			}
		}
		System.out.println(check[d]);
				
	}

}
