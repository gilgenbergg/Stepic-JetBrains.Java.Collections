import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> list = new ArrayList<>();
    List<Integer> res = new ArrayList<>();
    while (sc.hasNextInt())
        list.add(sc.nextInt());
    for (int i=0; i<list.size(); i++)
      if (i % 2 != 0)
        res.add(list.get(i));
    Collections.reverse(res);
    for (int i = 0; i < res.size(); i++) {
      System.out.print(res.get(i)+ " ");
    }
  }
}