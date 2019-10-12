package _01._05._01;


import java.util.ArrayList;
import java.util.List;

public class Demo_01_05_02 {

    public static void main(String[] args) {

        Demo_01_05_02 demo = new Demo_01_05_02();

        demo.testArrayListSubList1();

    }

    public void testArrayListSubList1() {

        List<String> list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        List<String> subList = list.subList(1, 4);
        print(subList); // [2, 3, 4]

        subList.add(0, "200");
        print(list); // [1, 200, 2, 3, 4]

        list.add("5");
        print(subList); // ConcurrentModificationException
    }

    public void testArrayListSubList2() {

        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        // ClassCastException: java.util.ArrayList$SubList cannot be cast to java.util.ArrayList
        ArrayList sub = (ArrayList) arrayList.subList(1, 2);
        print(sub);
    }

    private void print(List list) {

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < list.size(); i ++) {
            sb.append(list.get(i));
            if (i == (list.size() - 1)) {
                sb.append("]");
            } else {
                sb.append(", ");
            }
        }
        System.out.println(sb.toString());
    }

}
