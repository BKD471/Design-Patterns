package javaRefresher.streamsss;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StremDemo {
    public static void main(String[] args) {
        System.out.println("################## Stream Creation #####################################");
        //from collection
        List<Integer> stremedList = Arrays.asList(1234, 5678, 7890, 12356);
        Stream<Integer> stream1 = stremedList.stream();
        System.out.println(stream1.collect(Collectors.toSet()));

        //from array
        Integer[] arr1 = {345, 4564, 1213, 5657};
        Stream<Integer> stream2 = Arrays.stream(arr1);
        System.out.println(stream2.collect(Collectors.toSet()));

        //from static method
        Stream<Integer> stream3 = Stream.of(2435, 35465, 134, 76, 787);
        System.out.println(stream3.collect(Collectors.toSet()));

        //from StreamBuilder
        Stream.Builder<Integer> streamBuilder = Stream.builder();
        streamBuilder.add(354).add(245).add(3356).add(4767).build();
        System.out.println(streamBuilder);

        System.out.println("####################### Inter Ops ####################################");

        System.out.println("*********************** Filter ***************************************");
        Stream<String> stream4=Stream.of("I","am","a","Spring Boot","and","Angular","developer");
        List<String> names=stream4.filter(str->str.length()>=5).collect(Collectors.toList());
        System.out.println(names);

        System.out.println("*********************** MAP ***************************************");
        Stream<String> stream5=Stream.of("I","am","a","Spring Boot","and","Angular","developer");
        List<String> names1=stream5.map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(names1);

        System.out.println("*********************** FLAT MAP ***************************************");
        List<List<String>> sentenceList=Arrays.asList(
                Arrays.asList("Java","Spring Boot"),
                Arrays.asList("JavaScript","Angular"),
                Arrays.asList("LLD","HLD")
        );
        Stream<String> wordsStream=sentenceList.stream()
                .flatMap((List<String> sentence)->sentence.stream());
        System.out.println(wordsStream.collect(Collectors.toList()));

        Stream<String> wordsStream2=sentenceList.stream()
                .flatMap((List<String> sentence)->sentence.stream()
                        .map(String::toUpperCase));
        System.out.println(wordsStream2.collect(Collectors.toList()));

        System.out.println("*********************** DISTINCT ***************************************");
        Integer[] arr2={69,69,345,5746,1343,5746};
        Stream<Integer> stream6=Arrays.stream(arr2).distinct();
        System.out.println(stream6.collect(Collectors.toList()));

        System.out.println("*********************** SORTED ***************************************");
        Integer[] arr4={9,8,7,6,5,4,2,1};
        Stream<Integer> stream7=Arrays.stream(arr4).sorted();
        System.out.println(stream7.collect(Collectors.toList()));

        System.out.println("*********************** PEEK ***************************************");
        Integer[] arr7={9,8,7,6,5,4,2,1};
        Stream<Integer> stream8=Arrays.stream(arr7)
                .map(i->i+69)
                .peek(i->System.out.print(i+" "))
                .filter(i->i>=74);
        System.out.println(stream8.collect(Collectors.toList()));

        System.out.println("*********************** toArray ***************************************");
        List<Integer> numbersList=Arrays.asList(1,2,3,4,5,6,7);
        Integer[] filteredArray=numbersList.stream().filter(t->t>=2)
                .toArray((int size)-> new Integer[size]);
        for(int i:filteredArray) System.out.print(i+" ");
    }
}
