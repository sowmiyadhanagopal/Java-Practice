
package java_8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamCollectDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Spring", "Boot");
        List<String> result = list.stream().collect(Collectors.toList());
        System.out.println(result);
    }
}
