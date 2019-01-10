import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Set<String> set = new TreeSet<>();
    int amount = sc.nextInt();
    while (sc.hasNext()) {
      set.add(sc.nextLine());
    }
    for (String db:set)
      System.out.println(db);
  }
}