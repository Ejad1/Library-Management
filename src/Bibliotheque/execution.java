package Bibliotheque;

import java.util.Scanner;
import java.util.ArrayList;

public class execution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/* Creation of the books list */
		ArrayList <Livre> mesLivres = new ArrayList<>();
		
		/* Creating five (5) books titles */
		String[] titles = { 
				"Bible", "Mes étoiles noirs", "Chrétiens en zone dangereuse", "My book", "Your book"
				};
		
		/* Creating five (5) books authors */
		Auteur[] authors = new Auteur[5];

        // Initialization of author info
        authors[0] = new Auteur("Dieu", "00-00-0000", "Créateur du ciel et de la terre.");
        authors[1] = new Auteur("Lilian Thuram ?", "02-02-1990", "Ancien footballeur.");
        authors[2] = new Auteur("Author3", "03-03-1985", "Biographie de l'auteur 3.");
        authors[3] = new Auteur("EJAD", "04-04-1975", "Best programmer of the world.");
        authors[4] = new Auteur("Author5", "05-05-2000", "Cool.");
        
        /* Setting year of publication and numbers */
        int[] years = { 0000, 2010, 2000, 2003, 2005 };
        int[] numbers = { 10000, 500, 1000, 750, 450 };
        
        
        /* General setting of the books */
        for (int i = 0; i < 5; i++) {
        	Livre unLivre = new Livre(titles[i], authors[i], years[i], numbers[i]);
        	mesLivres.add(unLivre);
        }
		
		System.out.println(" *** Welcome to our library management program *** \n");
		
		/* User info */
		System.out.println("Enter the user name : ");
		String userName = scanner.next();
		
		System.out.println("Enter the user birthday (Day-Month-Year) : ");
		String userBirthday = scanner.next();
		
		System.out.println("Enter the user id : ");
		int userId = scanner.nextInt();
		
		/* Creating an user */
		Utilisateur user = new Utilisateur(userName, userBirthday, userId);
		
		String answer;
		do {
			System.out.println("What do you want to do ? : ");
			System.out.println("1- Borrow a book \n2- Bring back a book \n3-Exit ");
			
			System.out.println("Your choice : ");
			int choice = scanner.nextInt();
			
			switch (choice) {
			/* Case 1 : borrow a book */
			case 1 : 
				System.out.println("List of books : ");
				int i = 1;
				/* For each loop */
				for (Livre livre : mesLivres) {
					System.out.println(i + "- " + livre.getTitle());
					i++;
				}
				System.out.println("The id of the book you want : ");
				int id = scanner.nextInt() - 1;
				user.emprunterLivres( mesLivres.get(id) );
				
				/* Display user info */
				user.afficherDetails();
				break;
				
			/* case 2 : bring back a book */
			case 2 :
				System.out.println("Enter the book name : ");
				String bookName = scanner.next();
				
				Livre livreBack = new Livre(bookName, authors[1], 2003, 5);
				
				user.retournerLivre(livreBack);

				/* Display user info */
				user.afficherDetails();
				break;
				
			/* Case 3 : exit to the program */
			case 3 :
				System.out.println("Goodbye and thank you for using our program");
				answer = "N";
				break;
			}
			
			System.out.println("Do you want to continue ? (Y/N) : ");
			answer = scanner.next().toUpperCase();
		} while ( !answer.equals("N") );

		System.out.println("\n*** Goodbye and thank you for using our program ***");
		
		
		scanner.close();
	}
}
