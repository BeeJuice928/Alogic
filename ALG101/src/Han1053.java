import java.util.Scanner;

public class Han1053 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String whString = in.nextLine();
		int hight = Integer.parseInt(whString.split(" ")[0]);
		int weight = Integer.parseInt(whString.split(" ")[1]);
		String wlineString = "";
		for (int i = 0; i < hight; i++)
			wlineString += in.nextLine();
		Integer[][] stepAry = new Integer[hight][weight];
		stepAry[0][0] = 0;
		stepAry = reNewStepAry(0, 0, 0, wlineString.length() - 1, weight, hight, wlineString, stepAry);
		System.out.println(stepAry[hight - 1][weight - 1]);
		in.close();
	}
	
	private static Integer[][] reNewStepAry(int fromType, int step, int locate, int lastLocate, int weight, int hight, String wlineString, Integer[][] stepAry) {
		int xLocate = locate % weight;
		int yLocate = locate / weight;
		if (locate != lastLocate) {
			if (fromType != 2 && canUpStep(locate, weight, hight, wlineString)) {
				if (stepAry[yLocate - 1][xLocate] == null || stepAry[yLocate - 1][xLocate] > step + 1) {
					stepAry[yLocate - 1][xLocate] = step + 1;
					stepAry = reNewStepAry(1, step + 1, goUpStep(locate, weight), lastLocate, weight, hight, wlineString, stepAry);
				}
			}
			if (fromType != 1 && canDownStep(locate, weight, hight, wlineString)) {
				if (stepAry[yLocate + 1][xLocate] == null || stepAry[yLocate + 1][xLocate] > step + 1) {
					stepAry[yLocate + 1][xLocate] = step + 1;
					stepAry = reNewStepAry(2, step + 1, goDownStep(locate, weight), lastLocate, weight, hight, wlineString, stepAry);
				}
			}
			if (fromType != 4 && canLeftStep(locate, weight, wlineString)) {
				if (stepAry[yLocate][xLocate - 1] == null || stepAry[yLocate][xLocate - 1] > step + 1) {
					stepAry[yLocate][xLocate - 1] = step + 1;
					stepAry = reNewStepAry(3, step + 1, goLeftStep(locate), lastLocate, weight, hight, wlineString, stepAry);
				}
			}
			if (fromType != 3 && canRightStep(locate, weight, wlineString)) {
				if (stepAry[yLocate][xLocate + 1] == null || stepAry[yLocate][xLocate + 1] > step + 1) {
					stepAry[yLocate][xLocate + 1] = step + 1;
					stepAry = reNewStepAry(4, step + 1, goRightStep(locate), lastLocate, weight, hight, wlineString, stepAry);
				}
			}
		}
		else {
			if (stepAry[yLocate][xLocate] == null || stepAry[yLocate][xLocate] < step + 1)
				stepAry[yLocate][xLocate] = step;
		}
		return stepAry;
	}

	private static int goUpStep(int locate, int weight) {
		return locate - weight;
	}

	private static int goDownStep(int locate, int weight) {
		return locate + weight;
	}

	private static int goRightStep(int locate) {
		return locate + 1;
	}

	private static int goLeftStep(int locate) {
		return locate - 1;
	}

	private static boolean canUpStep(int locate, int weight, int hight, String wlineString) {
		return locate >= weight && wlineString.charAt(locate - weight) == '.';
	}

	private static boolean canDownStep(int locate, int weight, int hight, String wlineString) {
		return locate < weight * (hight - 1) && wlineString.charAt(locate + weight) == '.';
	}

	private static boolean canRightStep(int locate, int weight, String wlineString) {
		return locate % weight != weight - 1 && wlineString.charAt(locate + 1) == '.';
	}

	private static boolean canLeftStep(int locate, int weight, String wlineString) {
		return locate % weight != 0 && wlineString.charAt(locate - 1) == '.';
	}
}
