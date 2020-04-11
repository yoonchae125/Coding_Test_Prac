package DFS_BFS;

import java.util.*;

public class 단어변환_43163 {
	static int ans=9999;
	static int check[];
	public static int solution(String begin, String target, String[] words) {
        int answer=0;
        check=new int[words.length];
        for(int i=0;i<words.length;i++) {
			if(check[i]==0 && diffone(words[i],begin)) {
				check[i]=1;
				go(target,words,i,1);
				check[i]=0;
			}
        }
        if(ans==9999)
        	ans=0;
        return ans;
    }
	public static void go(String target,String[] words,int idx,int num) {
		
		if(words[idx].equals(target)) {
//			System.out.println(words[idx]+", "+num);
			ans = Math.min(ans, num);
			return;
		}
		for(int i=0;i<words.length;i++) {
			if(check[i]==0 && diffone(words[i],words[idx])) {
				check[i]=1;
				go(target,words,i,num+1);
				check[i]=0;
			}
		}
	}
	static boolean diffone(String str1, String str2) {
		int diff = 0;
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)-str2.charAt(i)!=0)
				diff++;
		}
		if(diff>=2)
			return false;
		else return true;
	}
	public static void main(String[] args) {
		String begin = "hit"; 
		String target = "cog";
		String[] words = 
//			{"hot", "dot", "dog", "lot", "log", "cog"}; //4
//			{"hot", "dot", "dog", "lot", "log"}; //0
			{"hot","hog","dog","cog"};
		solution(begin, target, words);
		System.out.println(ans);
	}

}
