import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int counter = 0;
        int temp = 0;
        while(temp!=n-1){
         if( temp+2 <=n-1){
        	 if(c[temp +2]!=0){
        	   temp+=2;
        	   counter++;
        	                   }
        }
        else{
        	temp+=1;
        	counter++;
        }
    }
    
    System.out.println(counter);   

}
}