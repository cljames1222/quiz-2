import java.util.Scanner;

public class tuition {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("cost of this year?");
		double tui = input.nextDouble();
		double finish = tui;
		System.out.println("Perecentage$%.2f"+ tui);
		double perc1 = input.nextDouble();
		for (int i=1; i <= 4;i++) {
			System.out.println("increase percentage?");
			finish = ((perc1/100)* tui)+ tui;
		}
			
		System.out.println(finish);
	}
}
