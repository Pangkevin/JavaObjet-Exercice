import java.util.ArrayList;
import java.util.Scanner;


public class Exo3_4 {
	
	 
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String phrase = sc.nextLine();
		
		
		Exo25(phrase); // avec la fonction split()
		triCompareChaineChara(phrase);//sans split()
		
		
	}
	
	
	
	public static void  Exo25(String phrase){
		
		String[] parts = phrase.split("[ ;]");
	
		
		for( int i =0; i <= parts.length-1; i++){
			
		System.out.println(parts[i]);
		
		}
		
		
	}
	
	public static void triCompareChaineChara(String phrase){
		
		
		int indice =phrase.length();
		char lettrePhrase;
		String lettrePhraseConvertionString;
		String motApresSplit;
		int indiDebutChaineCara = 0;
		
		ArrayList<String> mots = new ArrayList<String>();
		
		for(int i =0; i <= indice-1; i++){
			
			lettrePhrase =phrase.charAt(i);
			
			lettrePhraseConvertionString = String.valueOf(lettrePhrase);
			
			
			if(!(lettrePhrase >= 'a' && lettrePhrase <= 'z') || (lettrePhrase >= 'A' && lettrePhrase <= 'Z')){
			
			
				motApresSplit = phrase.substring(indiDebutChaineCara, i);
				
				mots.add(motApresSplit);
				
				indiDebutChaineCara = i +1	;
			
				//al.add(i);
				
				
		}else if(i == indice-1){
			
			motApresSplit = phrase.substring(indiDebutChaineCara, i+1);
			
			//System.out.println(motApresSplit);
			mots.add(motApresSplit);
			indiDebutChaineCara = i +1	;
			
			
		}
		
	}
		
		int tailleList = mots.size();
		
		for (int i = 0; i <= tailleList-1; i++){
			
			if(mots.get(i).length() != 0){
			
				System.out.println(mots.get(i));
		}
		
		
		
		
	}
}
}
