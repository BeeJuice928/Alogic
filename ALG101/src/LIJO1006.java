import java.util.ArrayList;
import java.util.Scanner;

public class LIJO1006 {
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
		int sitCounts  = allDatas.get(0);
		int sitNum  = allDatas.get(1);
		ArrayList<String> finalDatas = new ArrayList<String> ();
		ArrayList<Integer> sitDatas = new ArrayList<Integer> ();
		// 已有人的座位
		for(int i=0; i < sitNum ; i++ ){
			sitDatas.add(allDatas.get(i+2));
		}
		// 連號
		for(int i=1; i < sitCounts; i += 2){
			if ( !sitDatas.contains(i) && !sitDatas.contains(i+1))
				finalDatas.add(i+","+(i+1));
		}
		// 偶數號
		for(int i=1; i < sitCounts-1; i += 2){
			if ( !sitDatas.contains(i) && !sitDatas.contains(i+2)) 
				finalDatas.add(i+","+(i+2));
		}
		// 奇數號
		for(int i=2; i < sitCounts-1; i += 2){
			if ( !sitDatas.contains(i) && !sitDatas.contains(i+2)) 
				finalDatas.add(i+","+(i+2));
		}
		System.out.println(finalDatas.size());
		sc.close();  
	}
}
