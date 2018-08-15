package br.com.poc;

import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ForTestSuite {


    private final List<String> list = Arrays.asList("1", "2", "5", "-1", "4");

    @Test
    public void for_with_index() {

        for (int index = 0; index < list.size(); index++) {
            String element = list.get(index);

            System.out.println(element);
        }
    }


    @Test
    public void for_with_explicit_iterator() {

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }

    @Test
    public void for_with_implicit_iterator() {

        for (String element : list) {
            System.out.println(element);
        }
    }

    @Test
    public void for_each_java_8_lambda() {

        list.forEach(element -> {
            System.out.println(element);
        });
    }

    @Test
    public void for_each_java_8_method_reference() {

        list.forEach(System.out::println);
    }
}
