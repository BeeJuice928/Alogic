import java.util.Scanner;

public class LIJO1013 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int a = Integer.parseInt(sc.nextLine())-1;
		int rtn = calu(a);
		System.out.println(rtn);
		sc.close();
	}

	private static int calu(int a) {
	    if (1 == a) {
	        return 1;
	    }
	 
	    if (2 == a) {
	        return 2;
	    }
	 
	    if (a > 2) {
	        return calu(a-1) + calu(a-2);
	    }
		return a;
	}
}
