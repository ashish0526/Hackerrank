
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution28 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
        	HashSet<Character> charSet = new HashSet<Character>();
        	
            String s = in.next();
            int cost = 0;
            String p = "";
            for(int i =0;i<s.length();i++){
            	if(charSet.contains(s.charAt(i))){
            		p = p + s.charAt(i);
            		
            	}
            	else{
            		cost+=1;
            		p = p + s.charAt(i);
            		charSet.add(s.charAt(i));
            	}
            	
            	
            }
            System.out.println(cost);
        }
    }
}
