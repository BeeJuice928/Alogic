import java.util.ArrayList;
import java.util.Scanner;

public class LIJO1048 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> allDatas = new ArrayList<Integer>();
		while (sc.hasNext()) {
			String str = sc.nextLine();
			allDatas.add(Integer.parseInt(str));
		}
		System.out.println(sequence(allDatas));
		sc.close();
	}

	public static int sequence(ArrayList<Integer> allDatas) {
		int length = allDatas.get(0);
		if (length > 0) {
			int sum = allDatas.get(1);
			int tmpNum = 0;
			for(int i=1; i<=length; i++) {
				int num = allDatas.get(i);
				tmpNum += num;
				tmpNum = (tmpNum >= 0) ? tmpNum : 0;
				if (tmpNum > sum) {
					sum = tmpNum;
				}
			}
			return sum = (sum > 0) ? sum : 0;
		} else {
			return 0;
		}
	}
}
