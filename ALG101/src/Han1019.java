import java.util.Scanner;

public class Han1019 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String whString = in.nextLine();
		int hight = Integer.parseInt(whString.split(" ")[1]);
		int weight = Integer.parseInt(whString.split(" ")[0]);
		String wlineString = "";
		for (int i = 0; i < hight; i++)
			wlineString += in.nextLine();
		
		int step = 0;
		int locate = 0;
		int lastLocate = wlineString.length() - 1;
		int fromTyp = 0;
		while (locate < lastLocate) {
			if (fromTyp != 2 && locate % weight < weight - 1 && wlineString.charAt(locate + 1) == '.') {
				int rightStep = rightStepCount(locate, weight, wlineString);
				locate += rightStep;
				step += rightStep;
				fromTyp = 1;
			}
			else if (fromTyp != 1 && locate % weight > 0 && wlineString.charAt(locate - 1) == '.') {
				int leftStep = leftStepCount(locate, weight, wlineString);
				locate -= leftStep;
				step += leftStep;
				fromTyp = 2;
			}
			else if (fromTyp != 4 && locate < weight * (hight - 1) && wlineString.charAt(locate + weight) == '.') {
				int downStep = downStepCount(locate, weight, hight, wlineString);
				locate += (downStep * weight);
				step += downStep;
				fromTyp = 3;
			}
			else if (fromTyp != 3 && locate >= weight && wlineString.charAt(locate - weight) == '.') {
				int upStep = upStepCount(locate, weight, hight, wlineString);
				locate -= (upStep * weight);
				step += upStep;
				fromTyp = 4;
			}
		}
		System.out.println(step);
		in.close();
	}
	
	private static int upStepCount(int locate, int weight, int hight, String wlineString) {
		if (locate < weight || wlineString.charAt(locate - weight) == '#')
			return 0;
		else
			return upStepCount(locate - weight, weight, hight, wlineString) + 1;
	}
	
	private static int downStepCount(int locate, int weight, int hight, String wlineString) {
		if (locate >= weight * (hight - 1) || wlineString.charAt(locate + weight) == '#')
			return 0;
		else
			return downStepCount(locate + weight, weight, hight, wlineString) + 1;
	}
	
	private static int rightStepCount(int locate, int weight, String wlineString) {
		if (locate % weight == weight - 1 || wlineString.charAt(locate + 1) == '#')
			return 0;
		else
			return rightStepCount(locate + 1, weight, wlineString) + 1;
	}
	
	private static int leftStepCount(int locate, int weight, String wlineString) {
		if (locate % weight == 0 || wlineString.charAt(locate - 1) == '#')
			return 0;
		else
			return leftStepCount(locate - 1, weight, wlineString) + 1;
	}

}
