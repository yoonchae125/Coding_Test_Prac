package hash;

import java.util.*;

public class 전화번호목록 {

	public static boolean solution(String[] phone_book) {
        boolean answer = true;
        for(int i=0; i<phone_book.length-1; i++) {
            for(int j=i+1; j<phone_book.length; j++) {
                if(phone_book[i].startsWith(phone_book[j])) {return false;}
                if(phone_book[j].startsWith(phone_book[i])) {return false;}
            }
        }
        return answer;
    }
	public static void main(String[] args) {
		// false
		String[] phone_book1= {"119", "97674223", "1195524421"};
		// true
		String[] phone_book2 = {"123","456","789"};
		// false
		String[] phone_book3 = {"12","123","1235","567","88"};
		
		// false
		System.out.println(solution(phone_book1));
		// true
		System.out.println(solution(phone_book2));
		// false
		System.out.println(solution(phone_book3));
	}

}
