package LambdaExpressions;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PeopleApp {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Ramia", 25),
                new Person( "Peter", 31),
                new Person( "Steve", 25),
                new Person( "Balu", 32),
                new Person( "Sarah", 12)
        );

//case 1
        Person person1 = personList.stream() //convert list to stream
                .filter(x ->x.getName().equals("Peter") && x.getAge() == 31 ) // we want "Peter" with age 31 only
                .findAny()  // If 'findAny' then return found
                .orElse(null);	// If not found, return null
        System.out.println("case 1---------------------------");
        System.out.println(person1);

//-------------------------------------------------------
//case 2
        Person person2 = personList.stream()
                .filter(p -> p.getName().startsWith("S") && p.getAge() == 1)
                .findAny()  //if we have 2 names starting with "S" it returns the first match!
                .orElse(null);	// If not found, return null
        System.out.println("case 2---------------------------");
        System.out.println(person2);

//-------------------------------------------------------
//case 3
        Person person3 = personList.stream()
                .filter((p) -> p.getAge() >= 18)
               // .filter((p) -> p.getName().startsWith("B"))
                .findAny()  // If 'findAny' then return found
                .orElse(null);	// If not found, return null
        System.out.println("case 3---------------------------");
        System.out.println(person3);

//-------------------------------------------------------
//case 4
        Person person4 = personList.stream()
                .filter(p-> p.getName().equals("Sarah"))
                .findAny()
                .orElse(null);
        System.out.println("case 4---------------------------");
        System.out.println(person4);

//-------------------------------------------------------
 //case 5
        List<String> names = personList.stream() //a List of Strings
                //.filter(p->p.getAge() > 18)
                .map(Person::getName)       //.map(p->p.getName())
                .collect(Collectors.toList());     //get all names
        System.out.println("case 5---------------------------");
        System.out.println(names);
//-------------------------------------------------------
//case 6
        List<Integer> ages = personList.stream()//a List of integers!
                .map(Person::getAge)
                .collect(Collectors.toList());  //collect to convert them to List
        System.out.println("case 6---------------------------");
        System.out.println(ages);
//-------------------------------------------------------
//case 7
        List<Person> people = new ArrayList<>(personList);  //just collect the Persons
        //List<Person> people = personList.stream()     //a List of Person objects!
          //      .collect(Collectors.toList());  //just collect the Persons
        System.out.println("case 7---------------------------");
        System.out.println(people);
//-------------------------------------------------------
//case 8
        List<Person> people2 = personList.stream()
                .filter(p->p.getName().startsWith("S"))
                .collect(Collectors.toList());
        System.out.println("case 8---------------------------");
        System.out.println(people2); //gives all names start with "S"
//-------------------------------------------------------
//case 9
        Map<Integer, List<Person>> peopleAges = personList.stream()
                .collect(Collectors.groupingBy(Person::getAge));   //grouping based on age
        System.out.println("case 9---------------------------");
        System.out.println(peopleAges);
//-------------------------------------------------------
//case 10
        System.out.println("case 10---------------------------");
       personList.stream()
                .forEach((p)-> System.out.println(p.getName() + " : "  + p.getAge()));
//-------------------------------------------------------
//case 11
        System.out.println("case 11---------------------------");
        personList.stream()
                .forEach(p-> {
                    System.out.println(p.getName() + " : ");
                     System.out.println(p.getAge());
                });




    }
}
