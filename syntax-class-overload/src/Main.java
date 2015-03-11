/**
 * Created by zh61 on 2015/2/3.
 */
public class Main {
    public static void main(String[] args) {
        OverloadDemo od = new OverloadDemo();
        od.test();
        od.test(100);
        od.test(100,200);
        System.out.println(od.test("aaa"));
    }
}
