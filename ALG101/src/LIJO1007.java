import java.util.ArrayList;
import java.util.Scanner;

public class LIJO1007 {
	public static void main (String[] args) {
		Scanner sc =  new Scanner(System.in);
		ArrayList<String> allDatas = new ArrayList<String> ();
		ArrayList<String> rtn = new ArrayList<String> ();
		while(sc.hasNext()){
			String str = sc.nextLine();
			if(str.equals("end")) {
				break;
			}else {
				allDatas.add(str);
			} 	
		}
		int pairs = Integer.parseInt(allDatas.get(0));
		int tmpMax = Integer.parseInt( (allDatas.get(1).split(" "))[1]);
		rtn.add((allDatas.get(1).split(" "))[0]);
		for (int i=2; i<=pairs ;i++) {
			int nowScr = Integer.parseInt( (allDatas.get(i).split(" "))[1]);
			if (tmpMax < nowScr) {
				rtn.clear();
				rtn.add((allDatas.get(i).split(" "))[0]);
				tmpMax = nowScr ;
			}else if (tmpMax == nowScr) {
				if(rtn.contains((allDatas.get(i).split(" "))[0])) {
					
				}else {
					rtn.add((allDatas.get(i).split(" "))[0]);
				}
			}
		}
		System.out.println(splitRtn(rtn));
		sc.close();
	}

	private static String splitRtn(ArrayList<String> rtn) {
		String end ="";
		for(String splitRtn:rtn) {
			end = end + "\n" + splitRtn;
		}
		return end.trim();
	}

}