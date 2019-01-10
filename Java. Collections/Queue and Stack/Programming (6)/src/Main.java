import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Deque<String> stack = new ArrayDeque<>();
    boolean flag = true;
    String in = sc.nextLine();
    String[] array = in.split("");
    String last = "";
    for (String cur: array) {
      if ((cur == "(") || (cur == "{") || (cur == "[")) {
        stack.offerLast(cur);
        last = cur;
      }
      if ((cur == ")") || (cur=="}") || (cur == "]")) {
        if (stack.isEmpty())
          flag = false;
        else if (cur == last)
          stack.pollLast();
        else {
          stack.offerLast(cur);
          flag = false;
        }
      }
    }
    if (!stack.isEmpty())
      flag = false;
    System.out.print(flag);
  }
}