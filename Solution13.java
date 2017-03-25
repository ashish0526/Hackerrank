
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int counter = 0;
        for(int i = 0; i<s.length();i++){

        if(i %3== 0  || i%3 == 2){

          if(s.charAt(i) !='S' )
              counter++;
            
        }
      else{
     if(s.charAt(i) !='O')
         counter++;

}

}
        System.out.println(counter);
            
        }
    }

