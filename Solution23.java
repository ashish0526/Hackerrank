import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution23 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
    
   int index = 0;
   int counter = 0;
    while( true){
    	
     int temp = B.indexOf("010",index); 	
    	if(temp == -1){
    		break;
    	}
    	else{
    		index = temp+ 3;
    		counter++;
    	}
    	
    	
    }
    
    System.out.println(counter);
    	
    	
    	in.close();
    	
    
    
    
    
    }
}
