//public class Indian extends Human{
//
//    @Override
//    public void printData() {
//        System.out.println("\nIt`s so Good");
//        super.printData();//Вызывает метод родителя
//    }
//
//    public void Gol(String gol, int i){
//        System.out.println(gol + i);
//    }
//
//    public void Gol(int gol){
//        System.out.println(gol);
//    }
//}




public class Indian implements Human {

    @Override
    public int Age() {
        System.out.println("Indian");
        return 0;
    }

    @Override
    public double Height() {
        return 0;
    }

    @Override
    public String Name() {
        return null;
    }
}
