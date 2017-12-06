package edu.luc.cs271.myhashmap;

import java.util.*;

public class Main {

  public static void main(final String[] args) throws InterruptedException {
      HashMap<Integer, String> map = new HashMap<String, String>(); // i think we will want to try using a string string map

      //example of adding this
      map.put("Bonjour", "Hello");
      hmap.put("Comment Ca Va?", "How Are you?"); //if we wanted to do a french langauge flash card, doesn't really matter about content
  

      /* Display content using Iterator*/
      Set flashTitle = map.entrySet();
      Iterator itr = flashTitle.iterator();
      while(itr.hasNext()) {
         Map.Entry entry = (Map.Entry)itr.next();
         System.out.print("Test yourself: "+ eentry.getKey() + " );
         //here would we want to do an if else to see if the answer is correct
         //display the value if correct, don't dispay it not correct prompt for another input?
         System.out.println("The answer is: " +entry.getValue());
      }


   /* // set up the scanner so that it separates words based on space and punctuation
    final Scanner input = new Scanner(System.in).useDelimiter("[^\\p{Alnum}]+");
    // TRIALED measure the performance for MyHashMap, HashMap, and TreeMap several times each!
    final Map<String, Integer> counts = new MyHashMap<>(); // a prime number!
    final long time0 = System.currentTimeMillis(); // current time
    while (input.hasNext()) {
      final String word = input.next();
      final Integer count = counts.get(word);
      counts.put(word, count == null ? 1 : count + 1);
    }
    final ArrayList<Map.Entry<String, Integer>> arr = new ArrayList<>(counts.size());
    arr.addAll(counts.entrySet());
    System.out.println(
        "time in ms: " + (System.currentTimeMillis() - time0)); // time elapsed since above
    Collections.sort(arr, new DescendingByCount());
    for (int i = 0; i < 10 && i < arr.size(); i += 1) {
      System.out.println(arr.get(i));
    }
  }
} */
