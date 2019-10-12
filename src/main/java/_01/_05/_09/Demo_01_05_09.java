package _01._05._09;

import java.util.ArrayList;
import java.util.List;

public class Demo_01_05_09 {

    /**
     * 1） List<? extends Fruit> 定义的集合不支持 add();
     * 2） 用来接方法的返回值；
     * 3） 只能读；
     */
    public void getFruit() {

        // getFruits() 返回的都是 Fruit 或 Fruit 的子类
        List<? extends Fruit> list = getFruits();

        // 不可以
        // list.add(new Apple());

        // 可以的
        Fruit f1 = list.get(0);

        // 不可以，如果是个 Orange 是无法用 Apple 装的
        // Apple a = fruits.get(0);
    }

    /**
     * 1） List<? super Fruit> 定义的集合只能添加 Fruit 和 Fruit 的子类；
     * 2） 不支持 get()；
     */
    public void addFruit() {

        List<? super Fruit> list = new ArrayList<>();

        // 可以 add()
        list.add(new Fruit());
        list.add(new Apple());
        list.add(new Orange());
        list.add(new Banana());

        // 不能 get()
        // Fruit f = list.get(0);
    }

    private List<Fruit> getFruits() {

        List<Fruit> list = new ArrayList<>();
        list.add(new Fruit());
        list.add(new Apple());
        list.add(new Orange());
        list.add(new Banana());

        return list;
    }

}

class Fruit {}

class Apple extends Fruit {}

class Orange extends Fruit {}

class Banana extends Fruit {}