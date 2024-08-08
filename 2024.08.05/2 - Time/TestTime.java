public class TestTime {
    public static void main(String[] args) {
        Time T1 = new Time();
        System.out.println(T1);

        Time T2 = new Time(59, 59, 0);
        System.out.println( T2.nextSecond());

    }
}
