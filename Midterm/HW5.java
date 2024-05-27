package hw ;
import java.util.Scanner ;

public class HW5 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		
		Scanner input = new Scanner(System.in) ;
		
 		System.out.print("輸入數字:") ;
		int num = input.nextInt() ;
		
		// 嘗試除以任何小於自己且不是1的數，整除 => 不是質數
		for ( int test_div = 2 ; test_div < num ; test_div++ ) {
			if ( num % test_div == 0 ) {
				System.out.println( num + "不是質數" );
				return ;
			}
		}
		
		System.out.println( num + "是質數" );
	}

}
