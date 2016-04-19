/**
 * Created by LENOVO-QH on 2030/4/18.
 */
public class Hello {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = a + b;
        System.out.println("HelloWorld:a + b=" + c);
        Hello day = new Hello();
        day.happyDay(9);
    }
    public void happyDay(int a){
        int b = a;
        System.out.println(b+"月是个高兴的月份");
    }
}