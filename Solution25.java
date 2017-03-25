import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution25 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner input = new Scanner(System.in);
    int q = input.nextInt();
    for(int i =0; i<q;i++){
    	
    	String p = input.next();
    	int result = -1;
    	for(int j=0; j<=(p.length() -1)/2;j++){
    		
    		if(p.charAt(j) != p.charAt(p.length()-1-j)){
    			if(j+1<=(p.length()-1)/2 & p.charAt(j+1) == p.charAt(p.length()-1-j) ){
    				result = j;
    				break;
    				
    			}
    			if(p.length() - j - 2 >(p.length()-1)/2 & p.charAt(j) == p.charAt(p.length()-j-2)){
    				result = p.length() - j- 1;
    				break;
    			}
    			
    			
    			
    		}
    		
    		
    		
    		
    	}
    	System.out.println(result);
    	
    	
    	
    	
    }
    input.close();
    		
    
    }
}
