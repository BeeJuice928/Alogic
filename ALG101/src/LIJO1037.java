import java.util.ArrayList;
import java.util.Scanner;

public class LIJO1037 {
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
		String target = allDatas.get(0);
		for(int i=2 ;i<allDatas.size(); i++) {
			if(!allDatas.get(i).equals(target)) {
				System.out.println(allDatas.get(i));
			}
		}
		sc.close();
	}
}
