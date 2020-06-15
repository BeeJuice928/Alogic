import java.util.ArrayList;
import java.util.Scanner;

public class LIJO1036 {
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
		int times = Integer.parseInt(allDatas.get(0));
		for(int i=times ;i>0; i--) {
			System.out.println(allDatas.get(i));
		}
		sc.close();
	}
}
