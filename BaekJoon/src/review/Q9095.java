package review;

import java.util.Scanner;

public class Q9095 {
	public static int d[];
	public static int go(int n,int now) {
		if(now==n)
			return 1;
		if(now>n)
			return 0;
		return go(n,now+1)+go(n,now+2)+go(n,now+3);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		d=new int[11];
		d[0]=1;
		d[1]=1;
		for(int i=2;i<11;i++) {
			if(i-1>=0) {
				d[i]+=d[i-1];
			}
			if(i-2>=0) {
				d[i]+=d[i-2];
			}
			if(i-3>=0) {
				d[i]+=d[i-3];
			}
		}
//		System.out.println(d[3]);
		while(t-->0) {
			int n =sc.nextInt();
			System.out.println(d[n]);
		}
	}

}
