package school.mjc.stage0.loops.task1;

import java.util.stream.Stream;

public class RepeatIsBad {
    public static void main(String[] args) {
        repeatIsBad();
    }
    @SuppressWarnings("java:S106")
    public static void repeatIsBad(){
      //  System.out.println("writing the same code doesn't have much impact, and it's also time consuming\nwriting the same code doesn't have much impact, and it's also time consuming\nwriting the same code doesn't have much impact, and it's also time consuming\nwriting the same code doesn't have much impact, and it's also time consuming\nwriting the same code doesn't have much impact, and it's also time consuming\nwriting the same code doesn't have much impact, and it's also time consuming\nwriting the same code doesn't have much impact, and it's also time consuming\nwriting the same code doesn't have much impact, and it's also time consuming\nwriting the same code doesn't have much impact, and it's also time consuming\nwriting the same code doesn't have much impact, and it's also time consuming\nwriting the same code doesn't have much impact, and it's also time consuming\nwriting the same code doesn't have much impact, and it's also time consuming\nwriting the same code doesn't have much impact, and it's also time consuming\nwriting the same code doesn't have much impact, and it's also time consuming\nwriting the same code doesn't have much impact, and it's also time consuming\nwriting the same code doesn't have much impact, and it's also time consuming\nwriting the same code doesn't have much impact, and it's also time consuming\nwriting the same code doesn't have much impact, and it's also time consuming\nwriting the same code doesn't have much impact, and it's also time consuming\nwriting the same code doesn't have much impact, and it's also time consuming");

        Stream
                .generate(() -> "writing the same code doesn't have much impact, and it's also time consuming")
                .limit(20)
                .forEach(System.out::println);
    }
}
