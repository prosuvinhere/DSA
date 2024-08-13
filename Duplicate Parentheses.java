import java.util.*;

public class Main{
    
    public static boolean Dupe(String str){
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            //closing
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true; // duplicate
                }else{
                    s.pop(); //operator poped
                }
            }else{
                s.push(ch);
            }
        }
        return false;
    }
    
    public static void main(String args[]){
        String str1 = "((a+b))"; // t
        String str2 = "(a+b)"; // f
        System.out.println(Dupe(str2));
    }
}
