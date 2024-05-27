package hw ;

public class HW4 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		
		int teacher_score[] = { 50, 40, 30, 90, 32, 68, 71, 38, 59, 92 } ;
		
		// 遍歷印出
		for ( int traverse = 0 ; traverse < teacher_score.length ; traverse++ ) {
			if ( traverse != teacher_score.length - 1 )
				System.out.print( teacher_score[traverse] + ", " ) ;
			
			else
				System.out.println( teacher_score[traverse] ) ;
		}
		
		System.out.println( "最大值:" + max( teacher_score ) ) ;
		System.out.println( "平均:" + mean( teacher_score ) ) ;
		
	}

	// 遍歷取最大
	private static int max( int[] arr ) {
		int max = 0 ;
		
		for ( int traverse = 0 ; traverse < arr.length ; traverse++ )
			if ( max < arr[traverse] ) max = arr[traverse] ;
			
		return max ;
	}
	
	// 算平均 = 遍歷加總 / 個數
	private static float mean( int[] arr ) {
		float sum = 0 ;

		for ( int traverse = 0 ; traverse < arr.length ; traverse++ )
			sum += arr[traverse] ;
		
		sum /= arr.length ;
		return sum ;
	}
}
