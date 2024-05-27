package hw1;

import java.lang.Math ;
import java.util.Scanner ;

public class HW1 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		double edge1, edge2, edge3, degree, radian ;
		Scanner get_tri = new Scanner( System.in ) ;
		
		System.out.println("輸入兩邊邊長與其夾角可算出第三邊") ;
		
		System.out.print("邊長1:") ;
		edge1 = get_tri.nextDouble() ;
		System.out.print("邊長2:") ;
		edge2 = get_tri.nextDouble() ;
		System.out.print("夾角角度:") ;
		degree = get_tri.nextDouble() ;
		
		// 把角度轉成弧度，因 Math 的三角函數方法只有用弧度算的
		radian = Math.toRadians(degree) ;
		
		// 餘弦定理:a^2 = b^2 + c^2 - 2bc * cos(A)
		
		// 先求a^2
		edge3 = Math.pow(edge1, 2) + Math.pow(edge2, 2) - 2 * edge1 * edge2 * Math.cos(radian) ;
		// System.out.println(Math.pow(edge1, 2) + ", " + Math.pow(edge2, 2) + ", " + Math.cos(degree)) ; // 確認用
		
		// 開根號
		edge3 = Math.sqrt(edge3) ;
		
		System.out.println("第三邊邊長為:" + edge3) ;
		get_tri.close();
	}

}
