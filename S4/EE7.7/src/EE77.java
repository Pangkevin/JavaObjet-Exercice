

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/**
 * 
 * @author pangke16
 * Read the file 'dictionnaire.txt' and print out the words sorted by alphabetical order
 */
public class EE77 {
	
	
	  public static void main(String[] args) {
	    try {
	    	
	    	InputStream  ips=new FileInputStream("dictionnaire.txt"); //file where words are stored
	    	InputStreamReader ipsr=new InputStreamReader(ips);
	    	
	    	BufferedReader buf=new BufferedReader(ipsr);
	    	ArrayList<String> listmot = new ArrayList<String>();
	      
	      PutWordHashSet(buf, listmot);
	
	      buf.close();
	                
	    } catch (FileNotFoundException e) {
	      e.printStackTrace();
	    } catch (IOException e) {
	      e.printStackTrace();
	    }     	
	  }
	  
	  
	  public static void PutWordHashSet(BufferedReader buf,ArrayList<String> listmot ){
		  
			 
			 try {

				 String ligne;
				
				 
					while ((ligne=buf.readLine())!=null){
						
						
						for( String str : ligne.split(" ") ){
							if (!listmot.contains(str)){
								listmot.add(str.toLowerCase());
							}
						}
						
						
					}
					
					listmot.sort(String::compareToIgnoreCase);
					
					for(int i=0; i < listmot.size(); i++ ){
						
						System.out.println(listmot.get(i));
					}
				 
					
				 
				 
			} catch (IOException e) {
				e.printStackTrace();
			}
		 }
		  
		  
	  }
	  
	  



