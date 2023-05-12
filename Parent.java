package class20;

public class Parent {
    void getMarry(){
        System.out.println("Marry Tony");
    }
    private void accessBank(){
        System.out.println("Accessing bank");
    }
    static void printNumber(){
        System.out.println(10);
    }
}
class Suzy extends Parent{
    @Override
    public void getMarry(){
        System.out.println("I want to marry Ryan");
    }
}
