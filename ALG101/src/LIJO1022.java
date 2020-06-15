import java.util.Scanner;

public class LIJO1022 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String rtn = "";
		int levl = Integer.parseInt(sc.nextLine());
		// 層數(n)
		for(int n = 1;n <= levl; n++){   
			// 空白數(n - 1)
			for(int space = 0; space < levl-n; space++){ 
				rtn = rtn + " ";
			} 
			// 星星數(2n - 1)
			for(int star = 0; star < 2*n-1; star++){ 
				rtn = rtn + "*";
			}
			rtn = rtn + "\n";
		}
		System.out.println(rtn);
		sc.close();  
	}
}
