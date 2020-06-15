import java.util.ArrayList;
import java.util.Scanner;

public class LIJO1018 {
	public static void main(String[] args) {
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
		System.out.println(count(allDatas));
		sc.close();
	}

	private static int count(ArrayList<String> allDatas) {
		String[] tmp = allDatas.get(1).split(" ");
		int size = Integer.parseInt(allDatas.get(0));
		String str = tmp[0];
		int tmpMax = 1;
		int thisCounts = 1;
		for(int i=1; i<size; i++){
			if(str.equals(tmp[i])) {
				thisCounts ++;
				if(thisCounts > tmpMax) {
					tmpMax = thisCounts;
				}
			}else {
				str = tmp[i] ;
				thisCounts = 1 ;		
			}
		}
		return tmpMax;
	}
}
