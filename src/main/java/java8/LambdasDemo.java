package java8;

import java.util.Arrays;
import java.util.List;

public class LambdasDemo {
    public static void main(String[] args) {
        final List<String> list = Arrays.asList("string 1", "string 2", "string 3");

        // using forEach instead of classic loops
        list.forEach(System.out::println);
        list.forEach(listItem -> System.out.println(listItem));
    }
}
