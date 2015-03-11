/**
 * Created by zh61 on 2015/2/5.
 */
class A {

    A(){

    }

    A(int ii,int jj){
        i=ii;
        j=jj;
    }

    int i;
    int j;

    void showij(){
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A{
    int k;

    B(){
        //super( )必须是在子类构造函数中的第一个执行语句。
        super(1,2);
        k=0;
    }

    void showk(){
        System.out.println("k: "+ k);
    }

    void sum(){
        System.out.println("i+j+k: " + (i+j+k));
    }
}