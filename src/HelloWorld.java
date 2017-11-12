import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello ASE2017 - How are you now? :)");
		System.out.println("Please enter your name:");
		Scanner scanner = new Scanner(System.in);
		String username = scanner.nextLine();
		
		HelloUser user = new HelloUser();
		user.setUserName(username);
		
		System.out.println("Hello " + user.getUserName() + "!");
		

	}

}

