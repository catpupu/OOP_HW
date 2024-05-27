package hw2;

import java.util.Scanner;

public class Teacher implements Person {
	private String name, subject ;
	private int born ;
	
	// Constructor
	public Teacher() {
		Scanner tch_para = new Scanner(System.in) ;
		
		System.out.println("輸入老師參數") ;
		System.out.print("姓名:") ;
		name = tch_para.next() ;
		System.out.print("出生年(民國):") ;
		born = tch_para.nextInt() ;
		System.out.print("交授科目(國文、英文或數學):") ;
		subject = tch_para.next() ;
		
		while ( !subject.equals("國文") && !subject.equals("英文") && !subject.equals("數學") ) {
			System.out.print("交授科目(國文、英文或數學):") ;
			subject = tch_para.next() ;
		}
		
		tch_para.close() ;
	}
	
	// Override
	public String toString() {
		return "teacher{name=" + name + ", born=" + born + ", subject=" + subject + "}" ;
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
