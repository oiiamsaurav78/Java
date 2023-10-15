package introToApi;
import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class forEach223 {public static void main(String[] args) {
    List <Integer> list1= new ArrayList<Integer>();
    list1.add(2);
    list1.add(4);
    list1.add(8);
    System.out.println(list1);
    // we can also print the above by following easy code;
    List <Integer> list2= Arrays.asList(2,4,5,6,80);
    System.out.println(list2);
    for(Integer i:list2){
        System.out.println(i);
    }
    System.out.println("--------------------------------------------------it will give same result-------------");
    // use foreach 
    list2.forEach(n->System.out.println(n));
    // line 21 uses the consumer interface
    // // again consumer
    // Consumer <Integer> cons= new Consumer<Integer>(){
    //     @Override
    //     public void accept(Integer i)
    //     {
    //         System.out.println(i);
    //     }
    // }
    // // System.out.println(i);
    // list2.forEach(cons);
    Consumer <Integer> cons =i -> System.out.println(i);
    list2.forEach(cons);
}
    
}
    
