package hash;

import java.util.*;
public class 베스트앨범 {
	public static int[] solution(String[] genres, int[] plays) {
//        int[] answer = {};
        ArrayList<Integer> ans=new ArrayList<Integer>();
        // 장르에 속하는 앨범 넣을 HashMap
        HashMap<String, ArrayList> hm = new HashMap<String, ArrayList>();
        
        for(int i=0;i<genres.length;i++) {
        	String genre = genres[i];
        	if(hm.get(genre)==null) {
        		ArrayList<Integer> list = new ArrayList<Integer>();
        		list.add(i);
        		hm.put(genre, list);
        	}else {
        		ArrayList list =hm.get(genre);
        		list.add(i);
        		hm.replace(genre, list);
        	}	
        }
        
        List<String> keySetList = new ArrayList<>(hm.keySet());
        
        Collections.sort(keySetList, new Comparator<String>() {
            @SuppressWarnings("deprecation")
			@Override
            public int compare(String o1, String o2) {
            	ArrayList list1 = hm.get(o1);
            	ArrayList list2 = hm.get(o2);
            	int sum1=0;
            	int sum2=0;
            	for(int i=0;i<list1.size();i++) {
            		sum1+= plays[(int)list1.get(i)];
            	}
            	for(int i=0;i<list2.size();i++) {
            		sum2+= plays[(int)list2.get(i)];
            	}
            	// 내림차순 
            	return new Integer(sum2).compareTo(new Integer(sum1));	
            }

        });
        for(String key : keySetList) {
        	System.out.println("key: "+key+", values"+hm.get(key));
            ArrayList<Integer> list = hm.get(key);
            Collections.sort(list, new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					if(plays[o1]!=plays[o2]) {
						// 내림차순 
						return new Integer(plays[o2]).compareTo(new Integer(plays[o1]));
					}else {
						// 오름차순 
						return o1.compareTo(o2);
					}
				}
            	
            });
            if(list.size()<2) {
            	ans.add(list.get(0));
            }else {
            	for(int i=0;i<2;i++) {
            		ans.add(list.get(i));
            	}
            }
        }
        int answer[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++) {
        	answer[i]=ans.get(i);
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		
		int[] answer = solution(genres,plays); // 4, 1, 3, 0
		
		for(int a : answer) {
			System.out.print(a+", "); 
		}
	}

}
