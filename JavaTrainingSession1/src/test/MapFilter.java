import java.util.*;
import java.util.stream.Collectors;

public class MapFilter {

    public static void main(String[] args) {

        List<Integer> n = Arrays.asList(10,11,12,13,14,15);

        List<Integer> even = n.stream()
                            .filter(num -> num%2==0)
                            .map(na -> na)
                            .collect(Collectors.toList());

        System.out.println(even);

    }
}
