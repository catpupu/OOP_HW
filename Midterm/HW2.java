package hw ;

import java.util.Scanner ;

public class HW2 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		
		Scanner input = new Scanner(System.in) ;
		
		System.out.print("輸入數字:") ;
		int num = input.nextInt() ;
		
		if ( mod0(num, 3) && mod0(num, 5) && mod0(num, 7) )
			System.out.println(num + "被3, 5, 7同時整除") ;
		
		else
			System.out.println(num + "不被3, 5, 7同時整除") ;
	}
	
	// 回傳是否整除(bool)
	// Parameter(被除數, 除數)
	private static boolean mod0( int dividend, int divisor ) {
		return dividend % divisor == 0 ;
	}

}
