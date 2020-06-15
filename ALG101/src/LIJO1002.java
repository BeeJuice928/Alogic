import java.util.Scanner;

public class LIJO1002 {
	public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
		String rtn = "";
        while(sc.hasNext()){
            String[] str = sc.nextLine().split(" ");
            long a = Long.parseLong(str[0]);
            long b = Long.parseLong(str[1]);
            if( a==0 && b==0){
                break;
            }
            if (a > b){
                rtn = rtn + a + "\n";
            }else{
                rtn = rtn + b + "\n";
            }
        }
		System.out.println(rtn);
        sc.close();  
    }
}
