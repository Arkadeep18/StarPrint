import java.util.*;
public class Prac14 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Row");
	int x = sc.nextInt();
	System.out.println("Enter column");
	int y = sc.nextInt();
			
		for(int a=1; a<=x;a++) {
			for(int b=1; b<=y;b++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

} 
