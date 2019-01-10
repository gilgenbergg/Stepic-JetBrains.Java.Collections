import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int amount = sc.nextInt();
    int even;
    int odd;
    Deque<Integer> stack = new ArrayDeque<>();
    while (sc.hasNext()) {
      int cur = sc.nextInt();
      if (cur % 2 == 0)
        stack.offerFirst(cur);
      else stack.offerLast(cur);
    }
    for (int i=0; i<amount; i++) {
      System.out.println(stack.pollFirst());
    }
  }
}