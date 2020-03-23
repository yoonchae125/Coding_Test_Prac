package code_plus.그래프와_BFS;

import java.util.*;
class Pair1 {
    int x, y, z;
    Pair1(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
public class 벽_부수고_이동하기_2206 {
	public static int[] dx = {1, -1, 0, 0};
    public static int[] dy = {0, 0, 1, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int[][] a = new int[n][m];
        int[][][] d = new int[n][m][2];
        for (int i=0; i<n; i++) {
            String s = sc.nextLine();
            for (int j=0; j<m; j++) {
                a[i][j] = s.charAt(j) - '0';
            }
        }
        d[0][0][0] = 1;
        Queue<Pair1> q = new LinkedList<Pair1>();
        q.offer(new Pair1(0, 0, 0));
        while (!q.isEmpty()) {
            Pair1 p = q.remove();
            int x = p.x;
            int y = p.y;
            int z = p.z;
            for (int k=0; k<4; k++) {
                int nx = x+dx[k];
                int ny = y+dy[k];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (a[nx][ny] == 0 && d[nx][ny][z] == 0) {
                    d[nx][ny][z] = d[x][y][z] + 1;
                    q.offer(new Pair1(nx, ny, z));
                }
                if (z == 0 && a[nx][ny] == 1 && d[nx][ny][z+1] == 0) {
                    d[nx][ny][z+1] = d[x][y][z] + 1;
                    q.offer(new Pair1(nx, ny, z+1));
                }
            }
        }
        if (d[n-1][m-1][0] != 0 && d[n-1][m-1][1] != 0) {
            System.out.println(Math.min(d[n-1][m-1][0], d[n-1][m-1][1]));
        } else if (d[n-1][m-1][0] != 0) {
            System.out.println(d[n-1][m-1][0]);
        } else if (d[n-1][m-1][1] != 0) {
            System.out.println(d[n-1][m-1][1]);
        } else {
            System.out.println(-1);
        }
    }
}
