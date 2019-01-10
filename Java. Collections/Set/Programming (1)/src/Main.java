import java.util.*;

public class Main {

  public static void main(String[] args) {


    Set<String> nameSet = new TreeSet<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
    for (int i=0; i<nameSet.size(); i++) {
      System.out.println(((TreeSet<String>) nameSet).pollFirst());
    }
    System.out.println(((TreeSet<String>) nameSet).pollLast());
  }
}