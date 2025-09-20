import java.util.*;
public class Nestedif {
	
	public static void main(String[] args) {
		
		int score=54;
		if(score>35) {
			System.out.println("now cycle");
		}
		if(score>53) {
			System.out.println("now bike");
		}
		if(score>90) {
			System.out.println("apple iphone");
		}
		else {
			System.out.println("not apple");
		}
		if(score>50) {
			System.out.println("Laptop");
		}
		
		
		int mark=90;
		if(mark>89 && mark<100) {
			System.out.println("good mark");
		}
		else if (mark>100) {
			System.out.println("best");
		}
		else {
			System.out.println("try score good mark");
		}
		
		boolean kfc=true;
		boolean chicken=true;
		boolean pepsi = true;
		if(kfc) {
			System.out.println("Enter kfc");
			
			if(chicken) {
				System.out.println("Enter chicken");
				
			if(pepsi) {
				System.out.println("ENter pepsi");
			}
			else {
				System.out.println("Not entered kfc");
			}

		}
		
			else {
				System.out.println("Not entereed");
			}
		}
		
	}

}
