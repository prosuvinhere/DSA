import java.util.LinkedList;
import java.util.Queue;

public class Main {
  public static void first(String str) {
    int[] freq = new int[26];
    Queue<Character> q = new LinkedList<>();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      q.add(ch);
      freq[ch - 'a'] += 1;
      while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
        q.remove();
      }
      if (q.isEmpty()) {
        System.out.println(-1);
      } else {
        System.out.println(q.peek());
      }
    }
  }

  public static void main(String[] args) {
    String str = "aabccxb";
    first(str);

  }
}
