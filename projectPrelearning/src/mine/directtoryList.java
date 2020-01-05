package mine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class directtoryList {

    /*public static void main(String[] args) throws IOException {

        Path start = Paths.get("D:\\wosfilerepo_QA\\");
        try (Stream<Path> stream = Files.walk(start, 1)) {
            List<String> collect = stream
                    .map(String::valueOf)
                    .sorted()
                    .collect(Collectors.toList());

            collect.forEach(System.out::println);
        }


    }*/

    public static void main(String[] args) throws IOException {

        Path start = Paths.get("D:\\wosfilerepo_QA\\");
        try (Stream<Path> stream = Files.walk(start, Integer.MAX_VALUE)) {
            List<String> collect = stream
                    .map(String::valueOf)
                    .sorted()
                    .collect(Collectors.toList());

            collect.forEach(System.out::println);
        }


    }

}
