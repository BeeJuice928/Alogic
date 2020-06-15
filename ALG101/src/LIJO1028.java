import java.util.Scanner;

public class LIJO1028 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String[] tmp = sc.nextLine().replace(" ", "").split("");
		System.out.println(divine(tmp));
		sc.close();
	}

	private static int divine(String[] tmp) {
		int originalNum = 0;
		for(String str:tmp) {
			originalNum = originalNum + Integer.parseInt(str);
		}
		String[] original = String.valueOf(originalNum).split("");
		int finalNum = 0;
		while(original.length > 1) {
			for(String str:original) {
				finalNum = finalNum + Integer.parseInt(str);
				original = String.valueOf(finalNum).split("");
			}
		}
		return finalNum;
	}
}
