package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> nums = null;
        System.out.println(ElementFinder.getMinimumElement(nums));

        nums = new ArrayList<Integer>(Arrays.asList(5, 3, 2, 4, 1, 8));;
        System.out.println(ElementFinder.getMinimumElement(nums));
        System.out.println(ElementFinder.getMaximumElement(nums));

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Muhammad", "Eid", 22));
        users.add(new User("Ahmed", "Essam", 12));
        users.add(new User("Baraa", "Khaled", 30));

        System.out.println(ElementFinder.getMinimumElement(users));
        System.out.println(ElementFinder.getMaximumElement(users));

        System.out.println(ElementFinder.getMinimumElement(users, new UserComparator()));
        System.out.println(ElementFinder.getMaximumElement(users, new UserComparator()));
    }
}