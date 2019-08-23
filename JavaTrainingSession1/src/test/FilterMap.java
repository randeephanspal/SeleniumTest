import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMap {


    public static void main(String[] args) {

//        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6");

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

//        List<Integer> numbers = new ArrayList<Integer>();
//    numbers.add(10);
//    numbers.add(20);
//        numbers.add(31);
        System.out.println(numbers);

//        List<Integer> even = numbers.stream().map(s -> Integer.valueOf(s)).filter(num -> num%2==0).collect(Collectors.toList());

        List<Integer> even = numbers.stream()
                .filter(num -> num%2==0)
                .collect(Collectors.toList());


        System.out.println(even);


        List<String> number =  Arrays.asList("1", "2", "3", "4", "5", "6");
        List<Integer> ev = numbers.stream().map(s -> Integer.valueOf(s))
                .filter(num -> num%2==0)
                .collect(Collectors.toList());
        System.out.println(ev);



    }







}
