package code_plus.그래프와_BFS;

import java.util.*;

public class 이모티콘_14226 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Queue<Integer> q = new LinkedList<Integer>();
		
		int check[][] = new int[n+1][n+1];
		for (int i=0; i<=n; i++) {
            Arrays.fill(check[i], -1);
        }
		q.add(1); q.add(0);
		check[1][0]=0;
		while(!q.isEmpty()) {
			int s = q.poll();
			int c = q.poll();
			
			if (check[s][s] == -1) {
				check[s][s] = check[s][c] + 1;
                q.add(s); q.add(s);
            }
            if (s+c <= n && check[s+c][c] == -1) {
            	check[s+c][c] = check[s][c] + 1;
                q.add(s+c); q.add(c);
            }
            if (s-1 >= 0 && check[s-1][c] == -1) {
            	check[s-1][c] = check[s][c] + 1;
                q.add(s-1); q.add(c);
            }
		}
		int ans = -1;
        for (int i=0; i<=n; i++) {
            if (check[n][i] != -1) {
                if (ans == -1 || ans > check[n][i]) {
                    ans = check[n][i];
                }
            }
        }
        System.out.println(ans);
	}

}
