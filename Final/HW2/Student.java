package hw2;

import java.util.Scanner ;

public class Student implements Person {
	private String name ;
	private int born, sid, grade ;
	
	// Constructor
	public Student() {
		Scanner std_para = new Scanner(System.in) ;
		
		System.out.println("輸入學生參數") ;
		System.out.print("姓名:") ;
		name = std_para.next() ;
		System.out.print("出生年(民國):") ;
		born = std_para.nextInt() ;
		System.out.print("學號:") ;
		sid = std_para.nextInt() ;
		System.out.print("年級:") ;
		grade = std_para.nextInt() ;
		
		std_para.close();
	}
	
	// Override
	public String toString() {
		return "student{name=" + name + ", born=" + born + ", sid=" + sid + ", grade=" + grade + "}" ;
	}
	
    // Interface Override
    public String getName() {
        return name;
    }

    // Interface Override
    public int getBorn() {
        return born;
    }
}
