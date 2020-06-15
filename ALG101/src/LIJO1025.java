import java.util.Scanner;

public class LIJO1025 {
	public static void main (String[] args){
		Scanner sc =  new Scanner(System.in);
		String str = sc.nextLine();
		String[] tmp = str.split(" ");
		String rtn = "";
		int n = Integer.parseInt(tmp[1]);
		for(int i = Integer.parseInt(tmp[0]); i<n ; i++ ) {
			int multi =  String.valueOf(i).length();
			int tmpNum = sum(i, multi);
			if (i == tmpNum) {
				rtn = rtn + String.valueOf(i) + "\n";
			}
		}
		System.out.println(rtn);
		sc.close();  
	}

	private static int sum(int i, int multi) {
		String[] tmp = String.valueOf(i).split("");
		double sum = 0;
		double b = Double.valueOf(multi); 
		for(String str : tmp) {
			double a = Double.valueOf(str); 
			sum = sum + Math.pow(a, b);
		}
		return (int)sum;
	}
}
