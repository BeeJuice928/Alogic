import java.util.ArrayList;
import java.util.Scanner;

public class LIJO1026 {
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
        System.out.print(validate(allDatas));
        sc.close();
	}

	private static boolean validate(ArrayList<String> allDatas) {
		int index = Integer.parseInt(allDatas.get(0))-1;
		String[] tmp = allDatas.get(1).split(" ");
		int multi = Integer.parseInt(tmp[1])/Integer.parseInt(tmp[0]);
		for(int i=1; i<index; i++) {
			if(Integer.parseInt(tmp[i+1])/Integer.parseInt(tmp[i]) != multi) {
				return false;
			} 
		}
		return true;
	}
}
