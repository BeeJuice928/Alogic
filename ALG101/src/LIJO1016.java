import java.util.ArrayList;
import java.util.Scanner;

public class LIJO1016 {
	public static void main (String[] args) {
		Scanner sc =  new Scanner(System.in);
		ArrayList<String> allDatas = new ArrayList<String> ();
		ArrayList<String> tmpDatas = new ArrayList<String> ();
		String rtn = "";
		while(sc.hasNext()){
			String str = sc.nextLine();
			if(str.equals("end")) {
				break;
			}else {
				allDatas.add(str);
			} 	
		}
		int n = Integer.parseInt(allDatas.get(0));
		int aCounts = 0;
		int bCounts = 0;
		for(int i =1 ; i<=n; i++) {
			if(allDatas.get(i).equals("A")) {
				aCounts ++ ;
			}else {
				bCounts ++;
			}
			tmpDatas.add(allDatas.get(i));
		}
		if(aCounts == bCounts) {
			System.out.println("PEACE");
		}else {
			String find = (aCounts > bCounts) ? "B" : "A";
			for(int i = 0; i<tmpDatas.size();i++) {
				if(tmpDatas.get(i).equals(find)) {
					rtn = rtn + (i+1) + "\n";
				}
			}
			System.out.println(rtn);	
		}
		sc.close();
	}
}
