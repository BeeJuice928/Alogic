import java.util.Scanner;

public class LIJO1021 {
	public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        String rtn = "";
        String tmpLvl ="";
		int a = Integer.parseInt(sc.nextLine());
		for(int i=1; i<=a ;i++){
			tmpLvl = tmpLvl + "*" ;
			rtn = rtn + tmpLvl + "\n";
		}
		System.out.println(rtn);
        sc.close();  
    }
}
