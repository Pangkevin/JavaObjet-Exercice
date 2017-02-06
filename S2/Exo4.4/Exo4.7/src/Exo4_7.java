import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exo4_7 {
		 

	public static void main(String[] args) {
			
		
		int quizNbre1[]= new int[10];
		 int quizNbre2[] = new int[10];
		 int trueAnswer[] = new int[10];
		 int reponse=0;
		 int scoreQuiz=0;
		
		GenerateNumber1(quizNbre1);
		GenerateNumber2(quizNbre2);
		GenerateAnswer(quizNbre1,quizNbre2,trueAnswer);
		Scanner sc = new Scanner(System.in);
		
		
		/*for(int i=0; i < trueAnswer.length ; i++){
		System.out.println(trueAnswer[i]+"reponse");
		System.out.println(quizNbre1[i]+"q1");
		System.out.println(quizNbre2[i]+"q1");
		}*/
		
		
		for(int i=0; i<quizNbre1.length ; i++){
			
			System.out.println("Voici votre question numero"+i);
			System.out.println(quizNbre1[i]+"+"+quizNbre2[i]);
		
				 reponse = sc.nextInt();
				
				if(reponse == trueAnswer[i]){
					
					scoreQuiz=1 +scoreQuiz;		
				}
				
				
				
				
		}

		
		System.out.println("Le score est de "+scoreQuiz);
		
	}
	
	
	/**
	 * @param tab
	 * @return le tableau initialisé du premier chiffre de la question
	 */
	public static void GenerateNumber1(int tab[]){
		
			Random ran = new Random();
			
		for(int i=0; i < tab.length; i++){
			
			tab[i]=ran.nextInt(6) + 1;
			
		}
		
	}
	
	/**
	 * @param tab
	 * @return le tableau initialisé du deuxieme chiffre de la question
	 */
	public static void GenerateNumber2(int tab[]){
		
		Random ran = new Random();
		
	for(int i=0; i < tab.length; i++){
		
		tab[i]=ran.nextInt(6) + 1;
		
	}
	
}

	
	
	
/**
 * @param tab1
 * @param tab2
 * @param tabAnswer
 * @return le tableau initialisé avec les réponses  cad tab 1 + tab2
 */
public static void GenerateAnswer(int tab1[], int tab2[], int tabAnswer[]){
		
		Random ran = new Random();
		
	for(int i=0; i < tab1.length; i++){
		
		tabAnswer[i] = tab1[i] + tab2[i];
	}
	
}
	
}
