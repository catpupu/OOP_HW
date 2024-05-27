package hw ;
import java.util.Scanner ;

public class HW6 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		
		Scanner input = new Scanner(System.in) ;
		
 		System.out.print("輸入數字:") ;
		int num = input.nextInt() ;
		
		// 1 + ( 2 + 4 + 6 + ... ) - ( 3 + 5 + 7 + ... )
		// 若左右括號內個數相同，每個右括號內的數都多對應的左括號數1
		// 若N為奇數，左右括號內數量一樣多 => answer = 1 - 數量
		// 若N為偶數，左個數多1 => answer = 1 - 數量 + 左括號多出的數(N)
		int sum = 1 ;
		if ( num % 2 == 1 ) {
			sum -= ( num - 1 ) / 2 ;
			System.out.println( "Answer = " + sum );
		}
		
		else  {
			sum += num ;
			sum -= ( num - 2 ) / 2 ;
			System.out.println( "Answer = " + sum );
		}
	}

}
