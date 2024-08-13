import java.util.*;

public class Main{
    
    public static String rev(String str){
        Stack<Character> s = new Stack<>();
        int n = str.length();
        for(int i = 0; i < n ; i++){
            s.push(str.charAt(i));
        }
        
        StringBuilder rev = new StringBuilder("");
        
        for(int i = 0; i < n ; i++){
            char top = s.pop();
            rev.append(top);
        }
        
        return rev.toString();
    }
    
    public static void main(String args[]){
        String str = "abc";
        String out = rev(str);
        System.out.println(out);
    }
}
