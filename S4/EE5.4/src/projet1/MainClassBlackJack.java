package projet1;

import java.util.Scanner;

public class MainClassBlackJack {
	
	public static void main(String[] args) {
		BlackjackHand hand = new BlackjackHand();
		Deck deck = new Deck();
		TextIO textio = new TextIO();
		String reponse;
		Scanner sc = new Scanner(System.in);
		
		
		do {
			int nb_cartes_a_tirer;
			
			do {
			
			System.out.println("Combien de cartes voulez vous tirer ?");
			nb_cartes_a_tirer = textio.getInt();
			
			}while(nb_cartes_a_tirer < 2 || nb_cartes_a_tirer >6);
			
			for (int i=0; i<nb_cartes_a_tirer; i++){
				hand.addCard(deck.dealCard());
			}
			
			System.out.println("Valeur de la main :"+hand.getBlackjackValue());
			
			System.out.println("Voulez vous continuer ?");
			
			reponse = sc.nextLine();
			
			
		} while (reponse.equals("yes"));
		
		
		System.out.println("Formidable tu es raisonnable mon petit Padawan!");
		
		
	}


}
