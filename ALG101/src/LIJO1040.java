import java.util.ArrayList;
import java.util.Scanner;

public class LIJO1040 {
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
		System.out.print(join(allDatas));
		sc.close();
	}

	private static String join(ArrayList<String> allDatas) {
		String separator = allDatas.get(0);
		int a = Integer.parseInt(allDatas.get(1));
		String rtn=allDatas.get(2);
		for(int i=3; i<=a+1; i++) {
			rtn = rtn  + separator  + allDatas.get(i);
		}
		return rtn;
	}
}
