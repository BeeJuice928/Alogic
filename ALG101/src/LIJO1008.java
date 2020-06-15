import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class LIJO1008 {
	public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
		BigInteger bucketSize = new BigInteger("2147483648");
		BigInteger water = new BigInteger(sc.nextLine());
		BigInteger multi = new BigInteger("2");
		ArrayList<BigInteger> bucketType = new ArrayList<BigInteger>();
		int chkSize = bucketSize.compareTo(new BigInteger("0"));
		int chkWater = bucketSize.compareTo(new BigInteger("0"));
		while(chkSize ==1 && chkWater == 1){
			// 水桶容量小於或等於水容量
			if( bucketSize.compareTo(water) < 1){
				water = water.subtract(bucketSize);
				bucketType.add(bucketSize);
			} 
			bucketSize = bucketSize.divide(multi) ;
			chkSize = bucketSize.compareTo(new BigInteger("0"));
			chkWater = bucketSize.compareTo(new BigInteger("0"));
		}
		System.out.println(bucketType.size());
        sc.close();  
    }
}
