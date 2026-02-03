import com.sun.jdi.IntegerValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. Merge Unique Elements
        /*ArrayList<String> list1 = new ArrayList<>();
        list1.add("The broken sword");
        list1.add("Sleeping Beauty");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Yey");
        list2.add("Sleeping Beauty");
        ArrayList<String> result = new ArrayList<>();
        for(String item : list1) {
            if(!result.contains(item)) {
                result.add(item);
                for(String item2 : list2) {
                    if(!result.contains(item)) {
                        result.add(item);
                    }
                }

                System.out.println(result);
            }
        }*/
        //2. Find Maximum Element
        /*ArrayList<String> movies = new ArrayList<>();
        movies.add("Avatar");
        movies.add("Interstellar");
        movies.add("Up");

        String longest = movies.get(0);

        for (String m : movies) {
            if (m.length() > longest.length()) {
                longest = m;
            }
        }

        System.out.println(longest);*/
        //3. Count Occurrences
        /*ArrayList<String> foods = new ArrayList<>();
        foods.add("Pizza");
        foods.add("Burger");
        foods.add("Pizza");

        int count = 0;

        for (String f : foods) {
            if (f.equals("Pizza")) {
                count++;
            }
        }

        System.out.println(count);*/
        //4. Remove All Matching Elements
        /*ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Banana");

        fruits.remove("Banana");

        System.out.println(fruits);*/
        //5. Replace All Elements
        /*ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");

        for (int i = 0; i < colors.size(); i++) {
            colors.set(i, "Black");
        }

        System.out.println(colors);*/
        //6. Check Sublist Presence
        /*ArrayList<String> sports = new ArrayList<>();
        sports.add("Football");
        sports.add("Tennis");
        sports.add("Basketball");

        ArrayList<String> check = new ArrayList<>();
        check.add("Football");
        check.add("Tennis");

        System.out.println(sports.containsAll(check));*/
        //7. Find Index of Element
        /*ArrayList<String> flowers = new ArrayList<>();
        flowers.add("Rose");
        flowers.add("Lily");
        flowers.add("Rose");

        System.out.println(flowers.indexOf("Rose"));
        System.out.println(flowers.lastIndexOf("Rose"));*/
        //8. Remove Duplicates
        /*ArrayList<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Cat");

        ArrayList<String> unique = new ArrayList<>();

        for (String a : animals) {
            if (!unique.contains(a)) {
                unique.add(a);
            }
        }

        System.out.println(unique);*/
        //9. Convert ArrayList to Array
        /*ArrayList<String> cities = new ArrayList<>();
        cities.add("Paris");
        cities.add("Tokyo");

        String[] arr = cities.toArray(new String[0]);*/
        //10. Convert Array to ArrayList
        /*int[] nums = {1, 2, 3};
        ArrayList<Integer> list = new ArrayList<>();

        for (int n : nums) {
            list.add(n);
        }*/
        //11. Find Common Elements
        /*ArrayList<String> list1 = new ArrayList<>();
        list1.add("USA");
        list1.add("France");
        list1.add("Germany");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Germany");
        list2.add("Italy");
        list2.add("USA");

        ArrayList<String> common = new ArrayList<>();

        for (String country : list1) {
            if (list2.contains(country)) {
                common.add(country);
            }
        }

        System.out.println(common);*/
        //12. Remove Even-Length Strings
        /*ArrayList<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Bob");
        names.add("Maria");
        names.add("Tom");

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() % 2 == 0) {
                names.remove(i);
                i--; // важно!
            }
        }

        System.out.println(names);*/
        //13. Find Smallest Element
        /*ArrayList<String> songs = new ArrayList<>();
        songs.add("Hello");
        songs.add("Sky");
        songs.add("Wonderful World");

        String shortest = songs.get(0);

        for (String song : songs) {
            if (song.length() < shortest.length()) {
                shortest = song;
            }
        }

        System.out.println(shortest);*/
        //14. Replace All Vowels
        /*ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");

        for (int i = 0; i < words.size(); i++) {
            String w = words.get(i);
            w = w.replaceAll("[aeiou]", "*");
            words.set(i, w);
        }

        System.out.println(words);*/
        //15. Partition ArrayList
        /*ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int n : numbers) {
            if (n % 2 == 0) {
                even.add(n);
            } else {
                odd.add(n);
            }
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);*/
        //16. Rotate Elements
        /*ArrayList<String> days = new ArrayList<>();
        days.add("Mon");
        days.add("Tue");
        days.add("Wed");
        days.add("Thu");
        days.add("Fri");

        Collections.rotate(days, 2);

        System.out.println(days);*/
        //17. Remove Null Values
        /*ArrayList<String> students = new ArrayList<>();
        students.add("Alex");
        students.add(null);
        students.add("John");

        students.removeIf(name -> name == null);

        System.out.println(students);*/
        //18. Find Second Largest Element
        /*ArrayList<String> movies = new ArrayList<>();
        movies.add("Avatar");
        movies.add("Titanic");
        movies.add("Up");

        String longest = "";
        String second = "";

        for (String m : movies) {
            if (m.length() > longest.length()) {
                second = longest;
                longest = m;
            } else if (m.length() > second.length() && !m.equals(longest)) {
                second = m;
            }
        }

        System.out.println(second);*/
        //19. Replace Elements with Lengths
        /*ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");

        ArrayList<Integer> lengths = new ArrayList<>();

        for (String f : fruits) {
            lengths.add(f.length());
        }

        System.out.println(lengths);*/
        //20. Create Nested ArrayList
        ArrayList<ArrayList<String>> departments = new ArrayList<>();

        ArrayList<String> it = new ArrayList<>();
        it.add("Alice");
        it.add("Bob");

        ArrayList<String> hr = new ArrayList<>();
        hr.add("John");
        hr.add("Emma");

        departments.add(it);
        departments.add(hr);

        for (ArrayList<String> dept : departments) {
            System.out.println(dept);
    }
}