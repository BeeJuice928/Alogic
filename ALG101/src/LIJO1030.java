import java.util.Scanner;

public class LIJO1030 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String tmp = sc.nextLine();
		System.out.println(compare(tmp));
		sc.close();
	}

	private static boolean compare(String tmp) {
		StringBuffer reservStr = new StringBuffer(tmp);
		boolean rtn = (reservStr.reverse().toString().equals(tmp)) ;
		return rtn;
	}
}
