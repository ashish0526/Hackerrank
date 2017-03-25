
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution30 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String number = in.next();
        char[] chars = number.toCharArray();
        
        int counter = 0;
        for(int i =0; i<=(number.length()-1)/2;i++){
        	if(number.charAt(i) !=number.charAt(n-1-i))
        		counter++;
        	
        }
        if(counter > k)
        	System.out.println("-1");
        else{
        	int t = k-counter;
        	while(t>=0){
        		int j = 0;
        		if(number.charAt(j)!='9' & number.charAt(n-1-j)!='9'){
        			chars[j] = '9';
        			chars[n-j-1] = '9';
        			t--;
        			counter--;
        			
        		}
        	}
        	for(int i = 0; i<n & counter >=0;i++){
        		
        		if(chars[i] != chars[n-1-i]){
        			
        			int max = Math.max((int)chars[i],(int)chars[n-1-i]);
        				chars[i] = (char)max;
        			    chars[n-i-1] = (char)max;
        			counter--;
        			
        		}
        		
        		
        		
        	}
        	
        	String p = chars.toString();
            System.out.println(p);
        	
        	
        	
        }
        
    }
}
