import java.util.Scanner;

public class LIJO1034 {
	public static void main(final String[] args) {
		Scanner sc =  new Scanner(System.in);
		int key = Integer.parseInt(sc.nextLine());
		char[] val = sc.nextLine().toCharArray();
        System.out.print(enCrypt(val,key));
        sc.close();
    }

	private static String enCrypt(char[] val, int key) {
		String rtn = "" ;
		for (char chart : val) {
			// 大寫區間
            if (chart >= 'A' && chart <= 'Z') {
            	int postion = chart - 'A';
            	chart = (char) ((postion + key) % 26 + 'A');
            // 小寫區間
            } else if (chart >= 'a' && chart <= 'z') {
                int postion = chart - 'a';
                chart = (char) ((postion + key) % 26 + 'a');
            }
            rtn = rtn + chart;
        }

		return rtn;
	}
}
