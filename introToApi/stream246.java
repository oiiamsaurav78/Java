package introToApi;
import java.util.*;
import java.util.List;
import java.util.stream;
import java.util.stream.Stream;
public class stream246 {public static void main(String[] args) {
    List<Integer> list= Arrays.asList(2,5,3,9,8,10,7);
    System.out.println(list);
    Stream<Integer> streamData= list.stream();
    // streamData.forEach(n->System.out.println(n));
    // System.out.println(streamData)
    // Stream <Integer> sortedStream=streamData.sorted();
    // sortedStream.forEach(n->System.out.println(n));
    // Stream <Integer> mapStream=sortedStream.map(n->n*2);
    // mapStream.forEach(n->System.out.println(n));
    Stream finalStream = streamData.filter(n->n%2==0).sorted().map(n->n*2);
    finalStream.forEach(n->System.out.println(n));


}
    
}
