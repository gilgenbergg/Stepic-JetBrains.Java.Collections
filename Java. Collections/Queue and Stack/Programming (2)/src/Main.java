import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int amount = sc.nextInt();
    Deque<Integer> stack = new ArrayDeque<>();
    while (sc.hasNext()) {
        stack.add(sc.nextInt());
    }
    for (int i=0; i<amount; i++)
      System.out.println(stack.pollLast());
  }
}