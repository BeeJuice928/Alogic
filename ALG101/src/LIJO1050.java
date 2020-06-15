import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LIJO1050 {
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
		System.out.print(twoSum(allDatas));
		
		sc.close();
	}

	private static String twoSum(ArrayList<String> allDatas) {
		int target = Integer.parseInt(allDatas.get(0).split(" ")[1]);
		String[] tmp = allDatas.get(1).split(" ");
		String rtn ="";
		Map<Integer,Integer> tmpMap = new HashMap<>();
		for(int i=0; i<tmp.length; i++) {
			int thisVal = Integer.parseInt(tmp[i]);
			if( thisVal<= target) {
				if(tmpMap.containsKey(thisVal)) {
					rtn = tmpMap.get(thisVal) + " " + i;
				}else {
					tmpMap.put(target-thisVal, i);
				}
			}
		}
		return rtn;
	}
}
