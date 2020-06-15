import java.util.ArrayList;
import java.util.Scanner;

public class LIJO1012 {
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
		
		int a =  Integer.parseInt(allDatas.get(0));
		int b =  Integer.parseInt(allDatas.get(1));
		int tmpPrice = a > b ? a : b;
		int maxPrice  = tmpPrice *2;
		int totalPrice = a + b;
		System.out.println(String.valueOf(maxPrice) + "\n" + String.valueOf(maxPrice-totalPrice));
		sc.close();
	}
}
