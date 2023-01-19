package org.example.streamApi;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Kapil Kaushik on 18/01/23
 * @project java-8-learn-code
 */

/**
 * process objects from collection is streams.
 * Stream s = c.stream();  c is collection obj
 * 1. configuration
 * 1.1 filter() for filtering
 * 1.2 map() for modification of data
 * 2. processing
 */

public class StreamExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) list.add(i * i);
        //System.out.println(list);

        // copy only even numbers into another list

        //without streams
        List<Integer> evenList = new ArrayList<>();
        for (int value : list) {
            if (value % 2 == 0) {
                evenList.add(value);
            }
        }
        //System.out.println("even list without stream " + evenList);

        // clear list
        evenList.clear();

        // with streams
        evenList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        //System.out.println("even list with stream " + evenList);

        // add 2 in every element of list

        Function<Integer, Integer> add2 = i -> i * i;

        //List<Integer> addedList = list.stream().map(i -> i + 2).collect(Collectors.toList());
        List<Integer> addedList = list.stream().map(add2).collect(Collectors.toList());
        // above 2 lines are same

        /*
         *   filter takes predicate interface obj
         *   map takes function interface obj
         */

        //System.out.println("add 2 " + addedList);

        // processing by collect()
        // this () collect elements from stream and added to specific collection

        List<String> list1 = new ArrayList<>();
        list1.add("hello");
        list1.add("kartik Jain");
        list1.add("tushar Sahni");
        list1.add("Kapil Kaushik");
        list1.add("abcdefgts");
        list1.add("helloooooooooooooooooo");

        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(20);
        list2.add(1);
        list2.add(7);
        list2.add(3);

        List<String> out = list1.stream().filter(s -> s.length() >= 6).collect(Collectors.toList()); // return a filtered list
        List<String> out1 = list1.stream().map(String::toUpperCase).collect(Collectors.toList()); // return a modified list

        // count()
        long count = list1.stream().filter(s -> s.length() >= 10).count(); // return count whose length is >=10

        // sorted()
        List<Integer> sorted = list2.stream().sorted().collect(Collectors.toList()); // default sorting increasing order

        Comparator<Integer> comparator = (a, b) -> {
            return -(a.compareTo(b));
           /* if (Objects.equals(a, b)) return 0;
            if (a > b) return -1;
            return 1;*/
            /*return -(a.compareTo(b));*/ // all if block & return stmt is replaced by this ()
        };

        List<Integer> sorted2 = list2.stream().sorted((a, b) -> -(a.compareTo(b))).collect(Collectors.toList()); // to change sorting order

        List<Integer> sorted3 = list2.stream().sorted(comparator).collect(Collectors.toList()); // to change sorting order

        // min() and max()
        // get minimum and maximum value of list using stream
        int min = list2.stream().min(Integer::compareTo).get();
        int max = list2.stream().max(Integer::compareTo).get();

        // forEach()
        Consumer<Integer> con = System.out::println; // equivalent to (a) -> System.out.println(a)
        //list2.forEach(con);

        // toArray()
        Integer[] arr = list2.stream().toArray(Integer[]::new); // list2.toArray(new Integer[0]); using collections
        //System.out.println(Arrays.toString(arr));

        // Stream.of () convert group of elements to stream or non-collections
        Stream<Integer> ss = Stream.of(1,2,3,4,5,6,7,8,9,0);
        //ss.forEach(System.out::println);

        // Stream for arrays
        Integer array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        //Stream.of(array).forEach(System.out::println);


    }
}
