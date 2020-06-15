import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class LIJO1004 {
	public static void main (String[] args) {
		Scanner sc =  new Scanner(System.in);
		ArrayList<String> allDatas = new ArrayList<String> ();
		ArrayList<String> tmpList = new ArrayList<String> ();
		String rtn = "";
		while(sc.hasNext()){
			String str = sc.nextLine();
			if(str.equals("end")) {
				break;
			}else {
				allDatas.add(str);	
			} 		
		}
		int pairCounts = Integer.parseInt(allDatas.get(0));
		for(int i=1; i<=pairCounts; i++){
		    tmpList.add(allDatas.get(i));
		}
		for(String tmpStr : tmpList){
			String[] pair = tmpStr.split(" ");
			BigInteger   a = new BigInteger(pair[0]) ;
			BigInteger   b = new BigInteger(pair[1]) ;
			int compare = a.compareTo(b);
			String type = pair[2];
			if(compare == 0) {
				rtn = rtn + "DRAW" + "\n" ;
			}else {
				if( (compare == 1 && type.equals("1"))|| (compare == -1 && type.equals("-1"))) {
					rtn = rtn + "A" + "\n" ;
				}else {
					rtn = rtn + "B" + "\n" ;
				}
			}
		}
		System.out.println(rtn);
		sc.close();  
	}
}
