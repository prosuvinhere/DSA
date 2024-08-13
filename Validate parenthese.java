import java.util.*;

public class Main{
    
    public static boolean check(String str){
        Stack<Character> s = new Stack<>();
        for(int  i = 0 ; i < str.length(); i++){
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
                s.push(str.charAt(i));
            }else{
                if(s.isEmpty()){
                    return false;
                }
                if(s.peek() == '(' && str.charAt(i) == ')' ){
                    s.pop();
                }
                else if(s.peek() == '{' && str.charAt(i) == '}' ){
                    s.pop();
                }
                else if(s.peek() == '[' && str.charAt(i) == ']' ){
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String args[]){
        String str = new String("(){}[");
        System.out.println(check(str));
    }
}
