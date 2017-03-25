import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution20 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    String[] p = new String[n];
    for(int i = 0; i<n;i++){
    	
    	p[i] = input.next();
    }
    HashSet<Character> available = new HashSet<Character>();
    String minString = p[0];
    for(int i = 1; i<n;i++){
    	if(p[i].length() < minString.length())minString = p[i];
    }
    String temp = minString;
    minString = p[0];
    p[0] =temp;
    		int counter = 0;
    		
    	for(int j = 0; j<p[0].length();j++){
    		boolean condition =  true;
    	
    		if(!available.contains(p[0].charAt(j))){
    			for(int k =1; k<n;k++){
    				if(!p[k].contains(""+p[0].charAt(j))){
    					available.add(p[0].charAt(j));
    					condition = false;
    					break;
    					
    				}
    				
    			}
    			if(condition){
    				counter++;
    				available.add(p[0].charAt(j));
    			}
    		}
    		
    		
    	}
    
    
    System.out.println(counter);
}
    
    
    
}