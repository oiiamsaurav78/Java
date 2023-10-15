package introToApi;
import java.util.*;
import java.util.List;
import java.util.stream.Stream;
public class stream242b {
    public static void main(String[] args) {
        List <Integer>list=Arrays.asList(2,4,5,6,9);
        // Stream<T> <Integer> Streamdata=list.stream();
        // Streamdata.forEach(n-> System.out.println(n));
        System.out.println(list);
        Stream <Integer> Streamdata=list.stream();
        Streamdata.forEach(n-> System.out.println(n));
        // we can't use the same stream data again
        // Streamdata.forEach(n->System.out.println(n));

    }
    
}
