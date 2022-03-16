package repl_it.repl3;

import java.util.Scanner;

public class ParseHTML {

	public static void main(String[] args) {
		/*
		 * Write a program, that will read html variable and output attribute value of id attribute (tag) 
		 * into the console. Input will be provided in a single line as outlined below. 
		 * If html variable doesn't contain <html> attribute, print out into the console message: "Invalid input!". 

Example: 
input: <!DOCTYPE html><html><head><title>Java</title></head><body><p id="myid"></p></body></html>
output: myid
		 */
		
		Scanner scan = new Scanner(System.in);
	    String html = scan.nextLine();
	   
	    if(html.contains("<html>")) {
	    	
	    int firstIndex = html.indexOf('"');
	    int secondIndex = html.indexOf('"', firstIndex+1);
	    
	 
//	    �nce (id=) indexini bul sonra ilk " indexini bul ve sonra ikinci " indexini bul ve substring yap
	    int idIndex = html.indexOf("id=");
	    System.out.println(idIndex);
	    
	    System.out.println(html.substring(idIndex+4, html.indexOf("\"", idIndex+4)));
	    
	    }else {
	    	System.out.println("Invalid input!");
	    }
	    
	    
	    
	    
	    
	    

	}

}
