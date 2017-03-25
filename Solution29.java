
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution29 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    
    Scanner input = new Scanner(System.in);
    String p = input.next();
    HashMap<Character,Integer> set = new HashMap<Character,Integer>();
    
    for(int i =  0;i<p.length();i++){
    	  Character d = new Character(p.charAt(i));
    	if(set.containsKey(d)){
    		set.put(d, set.get(d) + 1);
    	}
    	else
    		set.put(d,1);
    }
    
    int min = Collections.min(set.values());
    int max = Collections.max(set.values());
    HashMap<Integer,Integer> intMap = new HashMap();
    for(int count : set.values())
    {
       Integer val = intMap.get(count);
        if(null != val)
            {
            intMap.put(count,++val);
        }
        else
            {
            intMap.put(count,1);
        }
    }

    String output= intMap.size() == 1  ||( intMap.size() <= 2 && (intMap.get(min) <= 1 || intMap.get(max) <= 1)) ? "YES" : "NO";
    System.out.println(output);

    
    }
}