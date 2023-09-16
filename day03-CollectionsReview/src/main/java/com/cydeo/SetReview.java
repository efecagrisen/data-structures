package com.cydeo;

import java.util.HashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {

        // 1. create a set

        Set<Student> set = new HashSet<>();

        // 2. add element
        set.add(new Student(1,"Jack"));
        set.add(new Student(2,"Julia"));
        set.add(new Student(4,"Marry"));
        set.add(new Student(3,"Mike"));
        System.out.println(set.add(new Student(4, "Marry")));

        System.out.println(set);
        String str = "Java Developer";
        System.out.println(firstRepeatingChar(str));

    }

    public static Character firstRepeatingChar(String str){
        //what is the time complexity of the following code? --> O(n)

        // create a hashSet
        Set<Character> chars = new HashSet<>(); // in here we have Space Complexity of O(n)

        // iterate over the char array and add chars into hashSet
        for (Character ch : str.toCharArray()) if (!chars.add(ch)) return ch;

        // if add ops is false return that char



        return null;
    }



}
