import java.math.BigInteger;
import java.util.Scanner;

public class LIJO1015 {
	public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
		BigInteger a = new BigInteger(sc.nextLine());
		BigInteger val = new BigInteger("340");
		System.out.println(a.multiply(val));
        sc.close();  
    }
}
