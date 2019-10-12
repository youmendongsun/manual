package _01._05._08;

import java.util.Arrays;
import java.util.List;

public class Demo_01_05_08 {

    public static void main(String[] args) {

        (new Demo_01_05_08()).test1();
    }

    private void test1() {

        String[] str = new String[] {"yang", "hao"};
        List list = Arrays.asList(str);

        list.add("apple"); // UnsupportedOperationException
    }

    private void test2() {

        String[] str = new String[] {"yang", "hao"};
        List list = Arrays.asList(str);

        str[0] = "changed";
        System.out.println(list.get(0)); // changed
    }

    private void test3() {

        String[] str = new String[] {"yang", "hao"};
        List list = Arrays.asList(str);

        list.set(0, "changed again");
        System.out.println(str[0]); // changed again
    }

}
