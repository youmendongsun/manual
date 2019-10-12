package _01._05._01;

import java.util.Objects;

public class Demo_01_05_01 {

    private String name;
    private Integer age;

    public Demo_01_05_01(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Demo_01_05_01 that = (Demo_01_05_01) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(age, that.age);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }
}
