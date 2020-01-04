package hash;
import java.util.*;

public class 완주하지못한선수 {

	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        
        for(String player:participant) {
        	hm.put(player, hm.getOrDefault(player, 0)+1); // 동명이인일 경우 +1
//        	if(hm.get(player)==null)
//        		hm.put(player,1);
//        	else
//        		hm.replace(player, hm.get(player)+1);
        }
        for(String cplayer:completion) {
        	// 완주한 선수 제거 
        	hm.replace(cplayer, hm.get(cplayer)-1);
        }
        Set keys = hm.keySet();
        Iterator it = keys.iterator();
        
        while(it.hasNext()) {
        	String key = (String) it.next();
        	if(hm.get(key)>0)
        		answer=key;
        }
        
        return answer;
    }
	public static void main(String[] args) {
		
		// leo
		String[] participant1 = {"leo", "kiki", "eden"};
		String[] completion1 = {"eden", "kiki"};
		// vinko
		String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
		// mislav
		String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
		String[] completion3 = {"stanko", "ana", "mislav"};
	
		// leo
		System.out.println(solution(participant1,completion1));
		// vinko
		System.out.println(solution(participant2,completion2));
		// mislav
		System.out.println(solution(participant3,completion3));
	}

}
