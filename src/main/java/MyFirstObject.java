import java.util.ArrayList;
import java.util.List;

public class MyFirstObject {
    private int i = 20;
    private List<Integer> list = new ArrayList<>();
    private static int x = 20;

    // public - модифактор доступа - кто угдодно может использовать метод
    public int getI(){
        return i;
    }

    public void setI(int i){
        if (i >= 20){
            System.out.println("Недопустимый параметр");
        }
        else {
            this.i = i;
        }
    }

    public void incrementAndPrintI(){
        i++;
        System.out.println("print "+ i);
    }

    public int sumI(int b){
        return (i + b);
    }

//    public MyFirstObject(int i){
//        this.i = i;
//    }

    public static void printX(){
        System.out.println("X = " + 20);
    }
}
