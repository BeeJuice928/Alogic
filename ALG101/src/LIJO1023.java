import java.util.Scanner;

public class LIJO1023 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String rtn = "";
		int levl = Integer.parseInt(sc.nextLine());
		// �h��(n)
		for(int n = 1;n <= levl; n++){   
			// �ťռ�(n - 1)
			for(int space = 0; space < levl-n; space++){ 
				rtn = rtn + " ";
			} 
			// ���l��(2n - 1)
			for(int star = 0; star < 2*n-1; star++){ 
				rtn = rtn + "*";
			}
			rtn = rtn + "\n";
		}
		// ��F(n -1)
		for(int n = 1;n <= levl-1; n++) {
			// �ťռ�(n - 1)
			for(int m = 1;m <= levl-1; m++){ 
				rtn = rtn + " ";
			} 
			rtn = rtn + "|"+ "\n";
		}
		System.out.println(rtn);
		sc.close();  
	}
}
