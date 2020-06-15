import java.util.ArrayList;
import java.util.Scanner;

public class LIJO1005 {
	 public static void main (String[] args){
			Scanner sc =  new Scanner(System.in);
			ArrayList<Integer> allDatas = new ArrayList<Integer> ();
			String rtn = "";
			int sumMine; // 自己的正因數總和
			int sumFriend; // sumMine的正因數總和
			while(sc.hasNext()){
				String str = sc.nextLine();
				if(str.equals("end")) {
					break;
				}else {
					allDatas.add(Integer.parseInt(str));
				} 		
			}
			for(int me:allDatas){  
				sumMine = calu(me);    
				sumFriend = calu(sumMine);             
				if( me == 0){ 
					break;
				}else{
					if(me == sumFriend){
						System.out.println(sumMine);
					}else{
						System.out.println("QQ");
					}
				}
			}

			System.out.println(rtn);
			sc.close();  
		}
		// 計算正因數總和
		public static int calu(int num){
			int sum = 0;
			for(int i=1;i<num;i++){
				if(num%i==0){
					sum = sum+i;
				}
			}
			return sum;
		}
}
