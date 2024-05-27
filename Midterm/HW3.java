package hw ;

public class HW3 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		
		// 共4行
		for ( int line = 1 ; line <= 4 ; line++ ) {
			// 排版空格
			// 左space = 4 - line
			for ( int space = 4 - line ; space > 0 ; space-- )
				System.out.print(" ") ;
		
			// 印星星
			// star = 1 + ( line - 1 ) * 2
			for ( int star = 2 * line - 1 ; star > 0 ; star-- )
				System.out.print("*") ;
			
			// 好像可以不用
			for ( int space = 4 - line ; space > 0 ; space-- )
				System.out.print(" ") ;
			
			// 換行
			System.out.print("\n") ;
		}
	}

}
