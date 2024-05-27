package hw2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ShowInfo {
	// 使用介面讓 Student 和 Teacher 能放在同一個 ArrayList 並進行排序
	private ArrayList <Person> people ;
	
	public ShowInfo( ArrayList <Student> students, ArrayList <Teacher> teachers  ) {
		people = new ArrayList<>();
        people.addAll(students);
        people.addAll(teachers);
	}
	
	public void showInfoByName() {
		sort_showInfo(0) ; // key = Name
	}
	
	public void showInfoByAge() {
		sort_showInfo(1) ; // key = Age
	}
	
	// 不同key值的排序，合併方便管理
	private void sort_showInfo( int key ) {
		// 依姓名升序(default)排列
		if (key == 0) Collections.sort(people, Comparator.comparing(Person::getName)) ;
		
		// 依出生年降序排列(年齡由小到大，升序)，年齡容易重複故另加姓名排序
		else if (key == 1) Collections.sort(people, Comparator.comparingInt(Person::getBorn).reversed().thenComparing(Person::getName)) ;
		
		// error
		else System.out.println("Sort error") ;

		// showInfo
        for (Person out : people) {
            System.out.println(out) ;
        }
	}
}
