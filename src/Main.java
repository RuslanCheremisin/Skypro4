import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        task2(List.of(2,3,5,6,31,6,8));
    }
    public static <T> void findMinMax(Stream<? extends T> stream,
                                      Comparator<? super T> order,
                                      BiConsumer<? super T, ? super T> minMaxConsumer){
        minMaxConsumer.accept(stream.min(order).orElse(null),stream.max(order).orElse(null));

    }
    public static void task2(List<Integer> intList){
        System.out.println(intList.stream()
                .filter(i -> i % 2 == 0)
                .count());
    }
}