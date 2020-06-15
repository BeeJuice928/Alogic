import java.util.ArrayList;
import java.util.Scanner;

public class LIJO1011 {
	public static void main (String[] args) {
		Scanner sc =  new Scanner(System.in);
		ArrayList<String> allDatas = new ArrayList<String> ();
		while(sc.hasNext()){
			String str = sc.nextLine();
			if(str.equals("end")) {
				break;
			}else {
				allDatas.add(str);
			} 	
		}
		String[] tmp = allDatas.get(1).split(" ");
		int person = Integer.parseInt(allDatas.get(0));
		int sum = 0;
		for (String i : tmp) {
			sum = sum + Integer.parseInt(i);
		}
		System.out.println((sum/person) >= 183 ? "real" : "fake");
		sc.close();
	}
}
