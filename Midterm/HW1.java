package hw ;
import java.util.Scanner ;

public class HW1 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		
		Scanner input = new Scanner(System.in);
		int num[] = new int[2] ;
		
 		System.out.print("輸入數字a:") ;
		num[0] = input.nextInt();
		System.out.print("輸入數字b:") ;
		num[1] = input.nextInt() ;
		
		System.out.println("\n交換後...\n") ;
		swap( num, 0, 1 ) ;
		
		System.out.println("a:" + num[0]) ;
		System.out.println("b:" + num[1]) ;
		
	}

	// 用陣列當call by reference
	public static void swap( int arr[], int first, int second ) {
		// 防陣列溢位
		if ( arr.length < first || arr.length < second ) return ;
		
		// swap
		int temp = arr[first] ;
		arr[first] = arr[second] ;
		arr[second] = temp ;
	}
}