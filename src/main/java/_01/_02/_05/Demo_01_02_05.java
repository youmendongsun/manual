package _01._02._05;

public class Demo_01_02_05 {

    public static void main(String[] args) {

        System.out.println(SeasonEnum.SUMMER);
        System.out.println(SeasonEnum.SUMMER.getClass());

        int season = SeasonEnum.AUTUMN.getSeq();
        System.out.println(season);

    }

}

enum SeasonEnum {

    SPRING(1), SUMMER(2), AUTUMN(3), WINTER(4);

    private int seq;

    SeasonEnum(int seq) {
        this.seq = seq;
    }

    public int getSeq() {
        return seq;
    }

}