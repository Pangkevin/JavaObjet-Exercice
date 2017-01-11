import java.util.Scanner;

public class TestTp1 {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String phrase = sc.nextLine();
		
		
		Exo25(phrase);
		
		
		
	}
	
	
	
	public static void  Exo25(String phrase){
		
		String[] parts = phrase.split("[ ;]");
	
		
		for( int i =0; i <= parts.length-1; i++){
			
		System.out.println(parts[i]);
		
		}
		
		
	}

}
