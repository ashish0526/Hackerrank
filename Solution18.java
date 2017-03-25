import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution18 {

    public static void main(String[] args) {
        //your code goes here
        
    Scanner input = new Scanner(System.in);
    String s = input.next();
     HashSet<Integer> weight = new HashSet<Integer>();  		
    int w = 0;
    for(int i=0 ;i<s.length();i++){
    	w = w + s.charAt(i) -'a' + 1;
    	weight.add(w);
    	
      while( i+1 <s.length() ){
    	  if(s.charAt(i) == s.charAt(i+1)){
    			w  = w + s.charAt(i+1) -'a' +1;
    			weight.add(w);
    			i++;
    	        continue;
    		}
    		else{
    			w=0;
    			break;
    		}
    	
    	
    }
    
    
    }
    
    
    int q = input.nextInt();
    for(int i =0 ; i<q;i++){
    	
    	int x = input.nextInt();
    	if(weight.contains(x))
    		System.out.println("Yes");
    	else
    		System.out.println("No");
    }
    input.close();
    }
}
