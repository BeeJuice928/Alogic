import java.util.ArrayList;
import java.util.Scanner;

public class LIJO1047 {
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
		int a = Integer.parseInt(allDatas.get(0).split(" ")[0]);
		int b = Integer.parseInt(allDatas.get(0).split(" ")[1]);
		ArrayList<String>  targert = new ArrayList<String>();
		ArrayList<String>  findList =new  ArrayList<String>();
		for(int i=1; i<=a; i++) {
			targert.add(allDatas.get(i));
		}
		for(int j=a+1; j<=a+b; j++ ) {
			findList.add(allDatas.get(j));
		}
		
		for(String str:findList) {
			if(targert.contains(str)) {
				System.out.println(targert.indexOf(str));
			}else {
				System.out.println("-1");
			}
		}
		sc.close();
	}
}
