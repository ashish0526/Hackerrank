
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            // your code goes here
        int counter = 10;
        int  i = 0;
        while(true){
        	if(s.length() == i & counter>0){
        		System.out.println("No");
        		break;
        		
        	}
        	if( counter == 0){
        		System.out.println("Yes");
        		break;
        		
        	}
        	
        	switch(counter){
        	
        	case 10:
        		if(s.charAt(i) == 'h'){
        			i++;
        			counter--;
        			break;
        			
        		}
        		else{
        			i++;
        			break;
        		}
        	case 9:
        		if(s.charAt(i) == 'a'){
        			i++;
        			counter--;
        			break;
        		}
        		else{
        			i++;
        		  break;
        		}
        	case 8:
        		if(s.charAt(i)=='c'){
        			counter--;
        		   i++;
        	     break;
        		}
        		else{
        			i++;
        		  break;
        		}
        	case 7:
        		if(s.charAt(i)=='k'){
        			counter--;
        		   i++;
        		   break;
        		}else{
        			i++;
        		  break;
        		}
        	case 6:
        		if(s.charAt(i) == 'e'){
        			counter--;
        			i++;
        			break;
        		}
        		else{
        			i++;
        		  break;
        		}
        	case 5:
        		if(s.charAt(i) == 'r'){
        			counter--;
        			i++;
        			break;
        		}
        		else{
        			i++;
        			break;
        		}
        	case 4:
        		if(s.charAt(i) == 'r'){
        			counter--;
        			i++;
        			break;
        		
        	}
        		else{
        			i++;
        			break;
        		}
        		
        	case 3:
        		if(s.charAt(i) == 'a'){
        			counter--;
        			i++;
        			break;
        		}
        		else{
        			i++;
        			break;
        		}
        	case 2:
        		if(s.charAt(i) == 'n'){
        			counter--;
        			i++;
        			break;
        	}
        		else{
        			i++;
        			break;
        		}
        	case 1:
        		if(s.charAt(i) == 'k'){
        			i++;
        			counter--;
        		   break;
        		}
        		else{
        			i++;
        		}
        	}
        	
        	
        	
        	
        }
        
        
        
        }
    }
}
