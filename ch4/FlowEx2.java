import java.util.*;

public class FlowEx2 {

	public static void main(String[] args) {
		
		outer: while(true) {
			int menu = 0, num = 0;
			
			Scanner scanner = new Scanner(System.in);
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			
			if (menu == 0) {
				System.out.println("End");
				break;
				}
			else if(menu != 1 && menu !=2 && menu !=3){
				System.out.println("Wrong");
				continue;
				}
			
			System.out.printf("%d", menu);	
			
		}
	}
	
}