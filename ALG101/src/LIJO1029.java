import java.util.Scanner;

public class LIJO1029 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[2]);
		String kind = str[1];
		int rtn = calu(a,kind,b);
		System.out.println(rtn);
		sc.close();
	}

	private static int calu(int a, String kind, int b) {
		int rtn = 0 ;
		switch (kind) {
        case "+":
        	rtn = a + b ;
        case "-":
        	rtn = a - b ;
        	break;
        case "*":
        	rtn = a * b ;
        	break;
        case "/":
        	rtn = a / b ;
        	break;
        }
		return rtn;
	}
}
