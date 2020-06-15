import java.util.ArrayList;
import java.util.Scanner;

public class LIJO1024 {
	public static void main(final String[] args) {
		Scanner sc =  new Scanner(System.in);
		ArrayList<String> allDatas = new ArrayList<String> ();
		while(sc.hasNext()){
			String str = sc.nextLine();
			allDatas.add(str);
		}
		int n = Integer.parseInt(allDatas.get(0));
		int m = Integer.parseInt(allDatas.get(1));
        System.out.print(multi(n,m));
        sc.close();
    }

	private static String multi(int n, int m) {
		String rtn = "";
		for(int i=1; i<=n;i++) {
			for(int j=1; j<=m; j++) {
				rtn = rtn + i + "*" + j + "=" + i*j +"\n";
			}
		}
		return rtn;
	}
}
