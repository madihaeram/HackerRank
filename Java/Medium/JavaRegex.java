import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    public static boolean isValidIPAddress(String ip){
        String pattern = "(\\d{1,2}|(0|1)\\"+"d{2}|2[0-4]\\d|25[0-5])";
        String IP = pattern+"\\."+pattern+"\\."+pattern+"\\."+pattern;
        Pattern p =Pattern.compile(IP);
        
        if(ip == null){
            return false;
        }
            Matcher m = p.matcher(ip);
            return m.matches();
            
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
         while(in.hasNext()){
            String str = in.next();
            System.out.println(isValidIPAddress(str));
        }
        
    }
}


class MyRegex{
    final String pattern = "(\\d{1,2}|(0|1)\\"+"d{2}|2[0-4]\\d|25[0-5])";
}