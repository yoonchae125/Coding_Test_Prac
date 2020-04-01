package review;

import java.util.*;

public class Q13549 {
	public static final int max = 1000000;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[max];
		int c[] = new int[max];
		Arrays.fill(c, -1);
		
		Queue<Integer> q = new LinkedList<Integer>();
		Queue<Integer> nq = new LinkedList<Integer>();
		q.add(n);
		c[n]=0;
		while(!q.isEmpty()) {
			int x = q.poll();
			if(x*2<max) {
				if(c[x*2]<0) {
					c[x*2]=c[x];
					q.add(x*2);
				}
			}
			if(x-1>=0) {
				if(c[x-1]<0) {
					c[x-1]=c[x]+1;
					nq.add(x-1);
				}
			}
			if(x+1<max) {
				if(c[x+1]<0) {
					c[x+1]=c[x]+1;
					nq.add(x+1);
				}
			}
			if(q.isEmpty()) {
				q=nq;
				nq=new LinkedList<Integer>();
			}
		}
		System.out.println(c[k]);
	}

}
