import java.util.Scanner;

public class LIJO1027 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String[] tmp = sc.nextLine().replace("-", "").split("");
		System.out.println(validate(tmp));
		sc.close();
	}

	private static String validate(String[] tmp) {
		String kind = tmp[0].equals("4")? "VISA" : "MASTER_CARD " ;
		int chkNum = Integer.parseInt(tmp[15]);
		int sumOdd = 0 ;
		int sumEven =0 ;
		for(int i=0; i<=15;i++) {
			int n = Integer.parseInt(tmp[i]);			
			if(i%2 ==0) {
				int odd = (n*2 > 10) ? (n*2)-9 : n*2;
				sumOdd = sumOdd + odd;
			}else {
				sumEven = sumEven + n;
			}
		}
		int finalSum = 10- ((sumOdd + sumEven)%10) ;
		return ( chkNum == finalSum) ? kind : "INVALID";
	}
}
