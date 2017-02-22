package setCalculator;

import java.util.Scanner;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;
/**
 * 
 * @author pangke16
 * Read the number of operations to do then execute the setCalcultor method
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre calculs a faire:");
		int n = sc.nextInt();
		for (int i=0; i<n;i++){
			try {
				setCalculator();			
			} catch (Exception e){
				System.out.println(e.toString());
			}
		}

	}
	/**
	 * Read the operation to be done and compute it
	 */
	public static void setCalculator(){
		TreeSet<Integer> set1 = new TreeSet<Integer>();
		TreeSet<Integer> set2 = new TreeSet<Integer>();
		TreeSet<Integer> setResult = new TreeSet<Integer>();
		System.out.println("calcul:");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		
		String[] tablestr = input.split("[\\+\\-\\*]");//regular expression to split using the *, - or +
		tablestr[0] = tablestr[0].replaceAll("[\\[\\] ]", "");// remove [ and ] and spaces
		tablestr[1] = tablestr[1].replaceAll("[\\[\\] ]", "");
		if (tablestr.length!=2 || tablestr[0].length()==0){
			throw new RuntimeException();
		}
		
		for(String str : tablestr[0].split(",")){
			if (!str.equals("")) set1.add(Integer.parseInt(str));
		}
		
		for(String str : tablestr[1].split(",")){
			if (!str.equals("")) set2.add(Integer.parseInt(str));
		}
		
		
		if( input.contains("+")){
			setResult.addAll(set1);
			setResult.addAll(set2);		
		}
		else if( input.contains("-")){
			setResult.addAll(set1);
			setResult.removeAll(set2);		
		}
		else if( input.contains("*")){
			setResult.addAll(set1);
			setResult.retainAll(set2);		
		}
		
		
		
		java.util.Iterator<Integer> it = setResult.iterator();
		System.out.print("[");
	    while(it.hasNext()){
	    	
	    	System.out.print(it.next());
	    	
	    	if (it.hasNext()) System.out.print(", ");
	    }
	    System.out.println("]");
		
	}

}
