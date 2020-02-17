import java.util.Scanner;
public class MovieDriver {

public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	String again;
	do {
		Movie a = new Movie();

		System.out.println("Enter the title of a movie: ");
		a.setTitle(input.nextLine());

		System.out.println("Enter the rating of the movie: ");
		a.setRating(input.nextLine());

		System.out.println("Enter the number of tickets sold: ");
		a.setSoldTickets(input.nextInt());

		System.out.println(a.toString());
		System.out.print("Do you want to enter another? (y or n) ");
		input.nextLine();
		again = input.nextLine();
	}while (again.contains("y") || again.contains("Y"));
	input.close();
	}
}
