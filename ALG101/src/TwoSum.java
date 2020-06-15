import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
	public static void main(final String[] args) {
		Scanner sc =  new Scanner(System.in);
		int key = Integer.parseInt(sc.nextLine());
		String[] val = sc.nextLine().split(" ");
		
        System.out.print(twoSum(val,key));
        sc.close();
    }
		
    public static String twoSum(String[] numbers, int target) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    String rtn = "";

	    for (int i = 0; i < numbers.length; i++) {
	        if (map.containsKey(numbers[i])) {
	            int index = map.get(numbers[i]);
	            rtn = rtn + String.valueOf(index+1) +" ";
	            rtn = rtn + String.valueOf(i+1);
	            break;
	        } else {
	            map.put(target - Integer.parseInt(numbers[i]), i);
	        }
	    }

		return rtn;
    }
}
