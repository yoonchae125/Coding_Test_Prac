import java.util.Scanner;

public class Q1562 {
	public static final int mod = 1000000000;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long d[][] = new long[n+1][10];
		for(int i=0;i<10;i++) {
			d[1][i]=1;
		}
		for(int i=2;i<=n;i++) {
			for(int j=0;j<10;j++) {
				if(i-1>0 && j-1>=0)
					d[i][j]=d[i-1][j-1]%mod;
				if(i+1<n+1&&j+1<10)
					d[i][j]+=d[i-1][j+1]%mod;
			}
		}
		long ans = 0;
//		for(int i=0;i<=n;i++) {
//			for(int j=0;j<10;j++) {
//				System.out.print(d[i][j]+" ");
//				ans=(ans+d[i][j])%mod;
//			}System.out.println();
//		}
		for(int i=0;i<10;i++) {
			ans+=d[n][i];
		}
		System.out.println(ans%mod);
	}

}
