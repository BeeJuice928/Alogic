import java.util.ArrayList;
import java.util.Scanner;

public class LIJO1009 {
	public static void main (String[] args) {
		Scanner sc =  new Scanner(System.in);
		ArrayList<String> allDatas = new ArrayList<String> ();
		String rtn = "";
		while(sc.hasNext()){
			String str = sc.nextLine();
			if(str.equals("end")) {
				break;
			}else {
				allDatas.add(str);
			} 	
		}
		String tmpStr ="";
		for(String str:allDatas) {
			tmpStr = tmpStr +"\n" +str;
		}
		String[] tmpList = tmpStr.split("");
		for(int i=tmpList.length-1 ; i>0 ; i--){
			rtn = rtn + tmpList[i];
		}
		System.out.println(rtn.trim());
		sc.close();
	}
}
