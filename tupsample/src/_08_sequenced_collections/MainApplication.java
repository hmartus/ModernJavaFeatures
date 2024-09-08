package _07_sequenced_collections;

import java.util.*;

public class MainApplication {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));

        // old version
        int first = numbers.get(0);
        int last = numbers.get(numbers.size() - 1);
        System.out.println("First element(old): "+ first); // 1
        System.out.println("Last element(old):" + first); // 9

        // new API
        int newFirst = numbers.getFirst();
        int newLast = numbers.getLast();
        System.out.println("First element(new API): "+ newFirst); // 1
        System.out.println("Last element(new API):" + newLast); // 9

        //add values on first and last elements.
        numbers.addFirst(0);
        numbers.addLast(10);

        //reverse the list
        var reverseNumbers = numbers.reversed();
        System.out.println("reverseNumbers: " + reverseNumbers); // [10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

        // A sequenced set is a Set that is a SequencedCollection that contains no duplicate elements.
        //     SequencedSet<E> reversed();    // covariant override
        LinkedHashSet<Integer> integerSet = new LinkedHashSet<>(numbers);
        System.out.println("integerSet:" + integerSet.reversed()); // [9, 8, 7, 6, 5, 4, 3, 2, 1]


        // SequencedMap<K, V> extends Map<K, V>
        LinkedHashMap<String, Integer> sequencedMap = new LinkedHashMap<>();
        sequencedMap.put("one", 1);
        sequencedMap.put("two", 2);
        sequencedMap.put("three", 3);

        System.out.println("sequencedMap: " + sequencedMap); // {one=1, two=2, three=3}
        System.out.println("firstEntry: " + sequencedMap.firstEntry()); // one=1
        System.out.println("lastEntry: " + sequencedMap.lastEntry()); // three=3
        System.out.println("pollFirstEntry: " + sequencedMap.pollFirstEntry()); // one=1
        System.out.println("pollLastEntry: " + sequencedMap.pollLastEntry()); // three=3
        System.out.println("sequencedMap: " + sequencedMap); // {two=2}

    }

}
