
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution31 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner input  = new Scanner(System.in);
    int n = input.nextInt();
    String s =  input.next();
    int a = 0;
    int	t = 0;
    int c = 0;
    int g = 0;
    for(int i = 0; i<n;i++){
    	if(s.charAt(i) == 'A')
    		a++;
    	if(s.charAt(i)=='T')
    		t++;
    	if(s.charAt(i) == 'C')
    		c++;
    	if(s.charAt(i) =='G')
    		g++;
    	
    	
    }
    	a = a - n/4;
    	t = t - n/4;
    	c = c - n/4;
    	g = g -n/4;
    	int total = 0;
    	if(a>0)
    		total+=a;
    	if(t>0)
    		total+=t;
    	if(c>0)total+=c;
    	if(g>0)total+=g;
    
    
    for(int i = 0; i<n-total;i++){
    	for(int j =0 ; j<n-total;j++){
    	String p = s.substring(j,i+total+j);
    	for(int temp=0; temp<p.length();temp++){
    		int noOfAs;
    		int noOfTs;
    		int noOfCs;
    		int noOfGs;
    		if(p.charAt(i))
    	}
    	
    	}
    }
    
    }
}