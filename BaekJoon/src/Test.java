import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		list.add(13); list.add(2);
		list.remove(13);
		for(int i:list)
			System.out.println(i);
	}

}
