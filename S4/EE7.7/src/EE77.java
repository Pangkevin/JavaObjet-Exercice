//Packages � importer afin d'utiliser l'objet File

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

public class EE77 {
	
	
	  public static void main(String[] args) {
	    //Nous d�clarons nos objets en dehors du bloc try/catch
	
	    try {
	    	
	    	InputStream  ips=new FileInputStream("dictionnaire.txt"); //pour les classes g�rant les flux d'entr�e 
	    	InputStreamReader ipsr=new InputStreamReader(ips); // permet de lire les octets du fichier
	    	
	    	BufferedReader buf=new BufferedReader(ipsr); // permet de lire le fichier plus vite gr�ce �
	    	//la m�moire tampon en gros au lieu de lire byte par byte on peut lire 800 byte je crois
	    	
	    	ArrayList<String> listmot = new ArrayList();
	      
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

				 String ligne; // stocker les mots 
				
				 
					while ((ligne=buf.readLine())!=null){
						
						
						for( String str : ligne.split(" ") ){
							if (!listmot.contains(str)){
								listmot.add(str.toLowerCase());// j'ajoute les mots du fichier et je les mets en minuscule 
							}
						}
						
						
					}
					
					listmot.sort(String::compareToIgnoreCase); // je trie les mots dans la liste dans l'ordre alphab�tique 
					
					for(int i=0; i < listmot.size(); i++ ){
						
						System.out.println(listmot.get(i));
					}
				 
					
				 
				 
			} catch (IOException e) {
				e.printStackTrace();
			}
		 }
		  
		  
	  }
	  
	  



