package DFS_BFS;

import java.util.*;

public class 네트워크_43162 {
	
	public static int solution(int n, int[][] computers) {
        int answer = 0;
        Queue<Integer>q = new LinkedList<Integer>();
        int check[] = new int[n];
        int dx[] = {1,-1,0,0};
        int dy[] = {0,0,1,-1};
        for(int i=0;i<n;i++) {
        	if(check[i]>0)
        		continue;
        	q.add(i);
        	check[i]=1;
        	while(!q.isEmpty()) {
        		int v = q.poll();
        		for(int j=0;j<n;j++) {
        			if(check[j]==0&&computers[v][j]==1) {
        				q.add(j); check[j]=1;
        			}
        				
        		}
        	}
        	answer++;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int n = 3;
		int[][] computers= 
//			{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
//			{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
			{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
		System.out.println(solution(n,computers));
	}

}
