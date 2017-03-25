import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solutio15 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner input = new Scanner(System.in);
    String s = input.next();
    if(isPanagram(s)){
    	System.out.println("pangram");
    }
    else{
    	System.out.println("not pangram");
    }
    
    
    } 
   private static boolean isPanagram(String s){
	   
	   s = s.toLowerCase();
	    
	   for(int i = 0; i<26;i++){
		   
		   char current = (char)(97 +i);
	     if(!s.contains(""+current)){
	    	 
	    	 return false;
		     
		   
	}
	     
	   
   }
	   return true;
	   
   
    
} 
}
