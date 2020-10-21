package ge.btu.lec;

public class main {

    public static void test(){
        try {
            throw new IllegalAccessException();
        } catch (IllegalAccessException e) {
            System.out.println("shecdoma");
        }
    }
    public static void main(String[] args) {
        test();
    }
}
