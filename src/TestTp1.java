import java.util.Scanner;

public class TestTp1 {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String phrase = sc.nextLine();
		
		
		Exo25(phrase);
		triCompareChaineChara(phrase);
		
		
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
		
		for(int i =0; i <= indice-1; i++){
			
			lettrePhrase =phrase.charAt(i);
			
			lettrePhraseConvertionString = String.valueOf(lettrePhrase);
			
			
			if(!(lettrePhrase >= 'a' && lettrePhrase <= 'z') || (lettrePhrase >= 'A' && lettrePhrase <= 'Z')){
			
				motApresSplit = phrase.substring(indiDebutChaineCara, i);
				
				System.out.println(motApresSplit);
				indiDebutChaineCara = i +1	;
				
				
		}else if(i == indice-1){
			
			motApresSplit = phrase.substring(indiDebutChaineCara, i+1);
			
			System.out.println(motApresSplit);
			indiDebutChaineCara = i +1	;
			
			
		}
		
	}
	}
}
