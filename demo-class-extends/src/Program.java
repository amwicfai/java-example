/**
 * Created by zh61 on 2015/2/5.
 */
public class Program {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.i = 10;
        a.j=20;

        a.showij();

        b.i=7;
        b.j=8;
        b.k=9;

        b.showij();
        b.showk();

        b.sum();
    }
}
