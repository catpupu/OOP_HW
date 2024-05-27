package hw2;

import java.util.Scanner ;
import java.util.ArrayList ;

public class main {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		
		boolean command = true ;
		Scanner get_cmd = new Scanner(System.in) ;
		
		// 儲存不同類別的所有物件
		ArrayList <Student> students = new ArrayList<>() ;
		ArrayList <Teacher> teachers = new ArrayList<>() ;

		// 說明結構，且 2. 3. 4. 5. 皆有完成
		System.out.println("本題會先讓使用者輸入任意個學生和教師物件，在最後分別以 Name 和 Age 排序並使用 toString() 印出") ;
		
		// 學生物件
		System.out.println("是否創建學生物件(y/n):") ;
		command = judge_cmd( get_cmd.next() ) ;
		
		while ( command ) {
			Student temp_s = new Student() ;
			students.add(temp_s) ;
			
			System.out.print("是否繼續創建下一個物件(y/n):");
			command = judge_cmd( get_cmd.next() ) ;
		}
		
		// 老師物件
		System.out.println("是否創建老師物件(y/n):") ;
		command = judge_cmd( get_cmd.next() ) ;
		
		while ( command ) {
			Teacher temp_t = new Teacher() ;
			teachers.add(temp_t) ;
			
			System.out.print("是否繼續創建下一個物件(y/n):");
			command = judge_cmd( get_cmd.next() ) ;
		}
		
		get_cmd.close() ;
		
		// 輸出依照不同key(Name、Age)的排序結果
		ShowInfo sort = new ShowInfo( students, teachers ) ;
		
		System.out.println("showInfoByName():") ;
		sort.showInfoByName() ;
		System.out.print("\n===============================\n\n") ;
		
		System.out.println("showInfoByAge():") ;
		sort.showInfoByAge() ;
	}
	
	
	// static : 因為main要用所以也要一同在最初載入
	public static boolean judge_cmd( String cmd ) {
		
		if ( cmd.equals("n") ) return false ;
		else if ( cmd.equals("y") ) return true ;
		else System.out.println("Error") ;
		
		return false ;
	}

}
