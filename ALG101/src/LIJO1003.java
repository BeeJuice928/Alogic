import java.util.ArrayList;
import java.util.Scanner;

public class LIJO1003 {
	public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
		ArrayList<String> allDatas = new ArrayList<String> ();
		ArrayList<Integer> strIndex = new ArrayList<Integer> ();
		String tmpStr = "";
		String finalStr = "";
		while(sc.hasNext()){
			String str = sc.nextLine();
			if(str.equals("end")) {
				break;
			}else {
				allDatas.add(str);	
			} 
		}
		int wordCounts = Integer.parseInt(allDatas.get(0));
		int letterCounts = Integer.parseInt(allDatas.get(wordCounts+1));
		for(int i=1 ; i<= wordCounts ; i++){
			tmpStr = tmpStr + allDatas.get(i);
			
		}
		for(int i = 1 ; i<=letterCounts; i++) {
			strIndex.add(Integer.parseInt(allDatas.get(i + wordCounts+1)));
		}
		for(int i : strIndex) {
			finalStr = finalStr + tmpStr.substring(i-1,i);
		}
		System.out.println(finalStr);
		sc.close();
    }
	
}
