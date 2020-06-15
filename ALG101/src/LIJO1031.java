import java.util.ArrayList;
import java.util.Scanner;

public class LIJO1031 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int range = Integer.parseInt(sc.nextLine());
		int sum = 0;
		ArrayList<Integer> tmp = new ArrayList<Integer>();

		for(int i =1; i<=range; i++ ) {
			int a = (int) Math.sqrt(i);
			if(i == a*a) {
				tmp.add(i);
			}
		}
		for(int i : tmp) {
			sum = sum + i ;
		}
		System.out.println(sum);
		sc.close();
	}
}