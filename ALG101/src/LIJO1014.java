import java.util.Scanner;

public class LIJO1014 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int tmp = Integer.parseInt(sc.nextLine());
		System.out.println(parse((String.valueOf(tmp))));
		sc.close();
	}

	private static int parse(String tmp) {
		String[] chi = tmp.split("");
		final double a = 9;
		int multi = tmp.length()-1;
		double sum = 0;
		for(int i=multi; i>=0; i--) {
			sum = sum + Math.pow(a, i)*Integer.parseInt(chi[multi-i]);
		}
		
		return (int)sum;
	}

}
