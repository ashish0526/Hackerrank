import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String topic[] = new String[n];
        for(int topic_i=0; topic_i < n; topic_i++){
            topic[topic_i] = in.next();
        }
        int firstrow;
        int max;
		int secondrow;
        for(int i = 0;i<n-1;i++){
        	for(int j=i+1; j<n;j++){
        		int counter = 0;
        		for(int k = 0; k<topic[i].length();k++){
        			if(Integer.parseInt(String.valueOf(topic[i].charAt(k))) || Integer.parseInt(String.valueOf(topic[j].charAt(k)))){
        				
        				
        			}
        			
        			
        		}
        			
        		
        		
        		
        	}
        	
        	
        }
    }
}
