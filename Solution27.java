
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution27 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner input= new Scanner(System.in);
    int q = input.nextInt();
    for(int i =0; i<q;i++){
    	String p1 = input.next();
    	String p2 = input.next();
    	boolean condition = true;
    	
    	for(char ch='a'; ch<='z';ch++){
    		if(p1.indexOf(ch) >-1 & p2.indexOf(ch) > -1){
    			System.out.println("YES");
    			condition = false;
    			break;
    			
    		}
    		
    		
    		
    	}
    	if(condition){
    		System.out.println("No");
    	}
    	
    	
    	
    }
    
    }
}