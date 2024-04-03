package java8Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Questions {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,10,5,15,4,35,55,75,86);
        //Even number
        list.stream().filter(n -> n%2 == 0)
                .forEach(System.out::println);

        //number starting with 1
        list.stream().map(n-> n.toString()).filter(s ->s.startsWith("1"))
                .forEach(System.out::println);

        // first elememt
        list.stream().findFirst().ifPresent(System.out::println);
        //max
       System.out.println( list.stream().max(Integer::compare).get());

       //avg
       System.out.println( list.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0));

       list.stream().max(Integer::compare).orElse(null);

       list.stream().distinct()
               .sorted((a,b) -> Integer.compare(b,a))
               .skip(1)
               .findFirst().orElse(null);

        }
    }

