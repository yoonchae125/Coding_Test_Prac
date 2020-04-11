package DFS_BFS;

import java.util.*;

public class 여행경로_43164 {
	static ArrayList<Integer> path = new ArrayList<Integer>();
	static ArrayList<Integer> ans = new ArrayList<Integer>();
	static int check[];
	static String[] answer;
	public static String[] solution(String[][] tickets) {
		check = new int[tickets.length];
		
		for(int i=0;i<tickets.length;i++) {
        	if(tickets[i][0].equals("ICN")) {
        		if(check[i]==0) {
	        		check[i]=1; path.add(i);
	        		go(tickets,i);
	        		check[i]=0; path.remove(path.size()-1);
        		}
        	}
        }
		answer = new String[ans.size()+1];
        answer[0]="ICN";
        for(int i=1;i<answer.length;i++) {
        	answer[i]=tickets[ans.get(i-1)][1];
        }
        
        return answer;
    }
	public static void go(String[][] tickets,int idx) {
//		System.out.println(idx);
		if(path.size()==tickets.length) {
//			ans=compare(ans,path);
			return;
		}
		for(int i=0;i<tickets.length;i++) {
        	if(tickets[i][0].equals(tickets[idx][1])) {
        		if(check[i]==0) {
	        		check[i]=1; path.add(i);
	        		go(tickets,i);
	        		check[i]=0; path.remove(path.size()-1);
        		}
        	}
        }
	}
//	public static ArrayList
	public static void main(String[] args) {
		String[][] tickets = 
//			{{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}}; //["ICN", "JFK", "HND", "IAD"]
			{{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}}; //["ICN", "ATL", "ICN", "SFO", "ATL", "SFO"]
		String[] answer = solution(tickets);
		for(String str:answer) {
			System.out.print(str+" ");
		}
		System.out.println("abc".compareTo("bc"));
	}

}
