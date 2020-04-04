package review;

import java.util.*;

public class Q14226 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int [][]check=new int[s+1][s+1];
		for (int i=0; i<=s; i++) {
            Arrays.fill(check[i], -1);
        }
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1); q.add(0);
		check[1][0]=0;
		while(!q.isEmpty()) {
			int n=q.poll(); int c = q.poll();
			if(check[n][n]==-1) {
				check[n][n]=check[n][c]+1;
				q.add(n); q.add(n);
			}
			if(n+c<=s && check[n+c][c]==-1) {
				check[n+c][c]=check[n][c]+1;
				q.add(n+c); q.add(c);
			}
			if(n-1>0 && check[n-1][c]==-1) {
				check[n-1][c]=check[n][c]+1;
				q.add(n-1); q.add(c);
			}
		}
		int ans = -1;
        for (int i=0; i<=s; i++) {
            if (check[s][i] != -1) {
                if (ans == -1 || ans > check[s][i]) {
                    ans = check[s][i];
                }
            }
        }
        System.out.println(ans);
	}

}
