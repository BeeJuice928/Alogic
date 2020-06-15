import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LIJO1017 {
	public static void main (String[] args) {
		Scanner sc =  new Scanner(System.in);
		ArrayList<String> allDatas = new ArrayList<String> ();
		while(sc.hasNext()){
			String str = sc.nextLine();
			allDatas.add(str);	
		}
		System.out.println(take(allDatas));
		sc.close();
	}

	private static int take(ArrayList<String> allDatas) {
		ArrayList<Integer> valueDatas = new ArrayList<Integer> ();
		int bagSize = Integer.parseInt(allDatas.get(0));
		int things = Integer.parseInt(allDatas.get(1));
		int sum = 0 ;
		for(int i=0 ; i<things ;i++) {
			valueDatas.add(Integer.parseInt(allDatas.get(i+2)));
		}
		Collections.sort(valueDatas);
		int val = valueDatas.size();
		int size = val-bagSize > 0 ? val-bagSize : 0;
		for(int i = val-1; i>= size;i--) {
			sum = sum + valueDatas.get(i);
		}
		return sum;
	}
}
