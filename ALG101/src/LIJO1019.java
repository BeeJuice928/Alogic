import java.util.ArrayList;
import java.util.Scanner;

public class LIJO1019 {
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
		System.out.println(foot(allDatas));
		sc.close();
	}

	private static int foot(ArrayList<String> allDatas) {
		int x = Integer.parseInt(allDatas.get(0).split(" ")[0]);
		int y = Integer.parseInt(allDatas.get(0).split(" ")[1]);
		int counts  = 0;
		for(int i=1;i<=y;i++) {
			for(int j=1;j<=x;j++) {
				if(allDatas.get(i).split("")[j-1].equals(".")) {
					counts++;
				}
			}
		}
		return counts-1 ;
	}
}
