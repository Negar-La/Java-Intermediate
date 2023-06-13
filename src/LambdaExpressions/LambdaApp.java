package LambdaExpressions;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaApp {
    public static void main(String[] args) {
        List<String> arrString = new ArrayList<>();
        arrString.add("Negar");
        arrString.add("Jane");
        arrString.add("David");

        arrString.forEach(x->System.out.println(x.toUpperCase()));
        System.out.println("---------------------------");
//-------------------------------------------------------

        List<Integer> arr = Arrays.asList (1, 2, 3, 4, 5);

        //multiple statements should be inside {}
        arr.forEach(x -> {x = x+ 10;
        System.out.println(x);});

        List<Integer> collect1 = arr.stream().map(x-> x * 2).collect(Collectors.toList()); //required type is List
        System.out.println(collect1);    //[2, 4, 6, 8, 10]
        System.out.println("---------------------------");
//-------------------------------------------------------

        arr.forEach(x->{
            x +=2;
            System.out.println(x);
        });
        System.out.println("---------------------------");
//-------------------------------------------------------
/*
        for(int x : arr){
            x = x+ 10;
            System.out.println(x);
        }

 */
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
            myList
                .stream()                       //beginning of the stream flow
                .filter(s->s.startsWith("c"))      //intermediate operation
                .map(String::toUpperCase)       //intermediate operation  .map(c->c.toUpperCase())
                .sorted()
                .forEach(System.out::println);   //terminal operation = final operation performed on a stream
        System.out.println("---------------------------");
//-------------------------------------------------------





    }
}
