import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution42 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        for(int a0 = 0; a0 < Q; a0++){
            int n = in.nextInt();
            String b = in.next();
           boolean condition1  = false;
        HashMap<Character,Integer>  count = new HashMap<Character,Integer>();
        for(int i =0; i<b.length();i++){
        	if('A'<=b.charAt(i) &&  b.charAt(i) <='Z')
        		count.put(b.charAt(i),count.get(b.charAt(i)) + 1);
        }
        
        
        }
    }
    
    private static boolean allEqual(HashMap<Character,Integer> color){
    	Iterator it = color.entrySet().iterator();
    	Character ch = it.getKey();
    	for(Character c:color.keySet()){
    		
    	}
    }
}

