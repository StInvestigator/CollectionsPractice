package collection.code;

import java.util.*;

public class Main {

    static <T,E>void printMap(Map<T, E> map){
        var set = map.entrySet();
        for(var entry : set){
            System.out.print(entry.getKey() + ": ");
            System.out.println(entry.getValue());
        }
    }

    public static void main(String[] args) { // 1
        List<String> list1 = new ArrayList<>();
        String[] strings = new String[]{"Hello","World","Cool","Strings"};
        list1.addAll(Arrays.asList(strings));
        System.out.println("Array 1 - " + list1);

        List<String> list2 = new ArrayList<>(list1);
        System.out.println("Array 2 - " + list2);

        List<String> list3 = Arrays.asList("First line", "Hello", "World", "Mega line");
        System.out.println("Array 3 - " + list3);

        list2.addAll(list2.size()/2,list3);
        System.out.println("Array 2 after inserting array 3 in the center - " + list2);
        list2.sort(Collections.reverseOrder());
        System.out.println("Array 2 after reverse ordering - " + list2);

        var iterator = list2.iterator();
        boolean isDeleting = false;
        while(iterator.hasNext()){
            iterator.next();
            if(isDeleting) {
                iterator.remove();
            }
            isDeleting = !isDeleting;
        }
        System.out.println("Array 2 after deleting every second element - " + list2);

        System.out.println("-".repeat(20)); // 2

        Set<String> set1 = new HashSet<>();
        set1.add("First line");
        set1.add("Second line");
        set1.addAll(list1);
        set1.addAll(list2);
        System.out.println("Set 1 - " + set1);

        Set<String> set2 = new LinkedHashSet<>();
        set2.addAll(list2);
        set2.addAll(list3);
        System.out.println("Set 2 - " + set2);

        System.out.println("-".repeat(20)); // 3

        Map<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(0, "January");
        map1.put(1, "February");
        map1.put(2, "March");
        map1.put(3, "April");
        map1.put(4, "May");
        map1.put(5, "June");
        map1.put(6, "July");
        map1.put(7, "August");
        map1.put(8, "September");
        map1.put(9, "October");
        map1.put(10, "November");
        map1.put(11, "December");
        System.out.println("0 and 11 months : " + map1.get(0) + " and " + map1.get(11));
        map1.replace(5,"Vacation");
        System.out.println("element with key 5 : " + map1.get(5));

        Map<Integer, String> map2 = new HashMap<>();
        map2.putAll(map1);

        System.out.println("My print map 1: ");
        printMap(map1);
        System.out.println("My print map 2: ");
        printMap(map2);

        Map<String,Set<String>> map3 = new LinkedHashMap<>();
        map3.put("Mark",new LinkedHashSet<>(Arrays.asList("+380502210190","123@gmail.com","No skype")));
        map3.put("Igor",new LinkedHashSet<>(Arrays.asList("+380762330234","432423@gmail.com","No skype")));
        System.out.println("Mark`s info: " + map3.get("Mark"));
        System.out.println("Igor`s info: " + map3.get("Mark"));

        System.out.println("-".repeat(20)); // 4

        Set<User> userSet = new HashSet<>();
        userSet.add(new User("Ivan",20,"+380506660190"));
        userSet.add(new User("Ivan",20,"+380506660190"));
        userSet.add(new User("Ivan",25,"+380506660190"));
        System.out.println("User set - " + userSet);
    }
}