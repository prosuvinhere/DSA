import java.util.*;

public class Main{
    
    public static void nxtgrt(int arr[], int nxt[]){
        Stack<Integer> s = new Stack<>();
        for(int i = arr.length-1; i >= 0 ; i--){
            while(!s.isEmpty() && arr[s.peek()] < arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nxt[i] = -1;
            }else{
                nxt[i] = arr[s.peek()];
            }
            s.push(i);
        }
    }
    
    public static void main(String args[]){
        int arr[] = {6,8,0,1,3};
        int nxt[] = new int[arr.length];
        nxtgrt(arr,nxt);
        for(int i = 0; i < arr.length; i++){
            System.out.println(nxt[i]);
        }
    }
}
