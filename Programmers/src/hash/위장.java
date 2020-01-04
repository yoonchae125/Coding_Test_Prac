package hash;

import java.util.*;

public class 위장 {
	public static int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        
        for(String[] cloth: clothes) {
        	hm.put(cloth[1],hm.getOrDefault(cloth[1], 0)+1);
        }
        
        Set keys = hm.keySet();
        Iterator it = keys.iterator();
        
        while(it.hasNext()) {
        	String key = (String)it.next();
        	answer*=hm.get(key)+1;
        }
        
        return answer-1;
    }
	public static void main(String[] args) {
		// Test Case
		String[][] clothes1 = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		String[][] clothes2 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
		
		System.out.println(solution(clothes1)); //5
		System.out.println(solution(clothes2)); //3
	}

}
