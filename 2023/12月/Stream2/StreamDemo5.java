package a01mystream;

import java.util.stream.Stream;

public class StreamDemo5 {
    public static void main(String[] args) {
        //零散数据   Arrays.Stream.of
        Stream.of(1,2,3,4,5).forEach(s-> System.out.println(s));
        Stream.of('1','2','3','4','5').forEach(s-> System.out.println(s));
    }
}
