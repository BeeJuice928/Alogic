import java.util.ArrayList;
import java.util.Scanner;

public class LIJO1035 {
	public static void main (String[] args) {
		Scanner sc =  new Scanner(System.in);
		ArrayList<Integer> allDatas = new ArrayList<Integer> ();
		while(sc.hasNext()){
			String str = sc.nextLine();
			if(str.equals("end")) {
				break;
			}else {
				allDatas.add(Integer.parseInt(str));
			} 	
		}
		int times = allDatas.get(0);
		for(int i=1 ;i<=100; i++) {
			for(int j=1; j<=times; j++) {
				if(allDatas.get(j).equals(i)) {
					System.out.println(allDatas.get(j));
				}
			}
		}
		sc.close();
	}
}
