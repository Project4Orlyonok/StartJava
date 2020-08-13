//public class Human {
////    public int Age;
////    public String Name;
////    public double Height;
//    private int Age;
//    private String Name;
//    private double Height;
//
//
//    public void printData(){
//        System.out.println("\nName: " + Name + "\nAge: " + Age + "\nHeight: " + Height);
//    }
//
//
//    public int getAge() {
//        return Age;
//    }
//
//    public void setAge(int age) {
//        Age = age;
//    }
//
//    public String getName() {
//        return Name;
//    }
//
//    public void setName(String name) {
//        Name = name;
//    }
//
//    public double getHeight() {
//        return Height;
//    }
//
//    public void setHeight(double height) {
//        Height = height;
//    }
//}


public interface Human{

    int Age();
    double Height();
    String Name();

}