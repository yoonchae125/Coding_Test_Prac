package Samsung;
import java.util.*;
public class 게리멘더링2 {
	static int dx[] = {1,-1};
	static int dy[] = {-1,1};
	static int[][] gu;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		gu = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;i<n;j++) {
				gu[i][j]=sc.nextInt();
			}
		}
	}

}
