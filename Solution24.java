import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution24 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner input = new Scanner(System.in);
    int q = input.nextInt();
    for(int i =0 ; i<q;i++){
    	
    	String p = input.next();
    	int counter= 0;
    	for(int j =0;j<=(p.length()-1)/2;j++){
    		
    		if(p.charAt(j)  > p.charAt(p.length()-1-j)){
    			counter+=p.charAt(j) - p.charAt(p.length()-1-j);
    		
    			
    		}
    		else{
    			counter+= p.charAt(p.length()-1-j) - p.charAt(j) ;
    			
    		}
    		
    		
    		
    	}
    	System.out.println(counter);
    	
    	
    }
    input.close();
    
    
    }
}