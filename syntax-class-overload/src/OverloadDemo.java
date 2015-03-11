/**
 * Created by zh61 on 2015/2/3.
 * this is test demo
 */
public class OverloadDemo {
    public void test() {
        System.out.println("no parameters");
    }

    public void test(int a) {
        System.out.println("a:" + a);
    }

    public void test(int a, int b) {
        System.out.println("a:" + a + " b:" + b);
    }

    public int test(String s){
        return 12;
    }
}
