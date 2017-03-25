import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        int counter = 0;
        if(s.length() + t.length() <=k)
        	System.out.println("Yes");
        else{
       for(int i = 0 ; i<s.length() & i<t.length();i++){
        	
        	if(s.charAt(i) == t.charAt(i)){
        		counter++;
        		
        		
        	}
        	else
        		break;
        	
        }
       int temp = (s.length()-counter) +(t.length()  - counter);
       if(temp <=k & (k- temp) %2 == 0)
    	   System.out.println("Yes");
       else
    	   System.out.println("No");
        }
        }
}