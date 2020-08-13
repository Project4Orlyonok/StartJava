import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstClass {
    //static метод - используется без создания экземпляра класса
    public static void main(String[] args) {
        int a = 1;
        long b = 20000;
        double c = 2.34;
        float d = 2.356F;
        boolean e = true;
        int[] arr = new int[20];

        //написать в консоль
        System.out.println("a = " + a + " b = "+ b);

        int g;
        g = (int)b + a;

        System.out.println("g = " + g);

        // == - опрератор сравнения, ! - оператор отрицания
        System.out.println(e);

        int h = 1;
        h += a + 2;
        // += - краткая запись h = h + a + 2;
        System.out.println("h = " + h);

        boolean l = true, k = false;

        System.out.println( l && !k);

        // условия
        int ii = 20;

        if (ii == 19) {
            System.out.println("ii = " + ii);
        }
        if (ii == 20){
            System.out.println("ii = " + ii);
        }
        else {
            System.out.println("ii is unknown");
        }

        //то же самое, но нагляднее
        int aa = 10;
        switch (aa){
            case 1:
                System.out.println("the first expression");
                break;
            case 10:
                System.out.println("the second expression");
                break;
            default:
                System.out.println("default");
                break;
        }

        // циклы
        // первый вариант записи цикла for
        System.out.println(' ');

        for(int jj = 0; jj < 5;){
            System.out.println("jj = " + jj);
            jj = jj + 1;
        }

        //Integer - обертка, т.е. - объект хранящий примитив типа int
        List<Integer> listI = Arrays.asList(0,1,2,3,4);

        //второй вариант записи for
        System.out.println(' ');
        for (Integer kk : listI) {
            System.out.println(kk);
        }

        //третий варинт записи цикла for
        System.out.println(' ');
        listI.forEach(element -> System.out.println(element));

        //Через while
        int hhh = 0;
        System.out.println(' ');
        while (hhh < 5){
            System.out.println(hhh++);
        }


        //Вызов метода из другого класса
        MyFirstObject.printX();

        //Создание объекта
        MyFirstObject myFirstObject = new MyFirstObject();

        //Сеттер
        myFirstObject.setI(30);
        //Геттер
        System.out.println(myFirstObject.getI());

        myFirstObject.incrementAndPrintI();

        //Пример Инкапсуляции
        //public
//        Human human = new Human();
//        human.Age = 10;
//        human.Height = 6.4;
//        human.Name = "Dylan";
//        human.printData();

        //private
//        Human human = new Human();
//        Human human1 = new Human();
//        human1.setAge(15);
//        human.setAge(10);
//        human1.setName("Josh");
//        human.setName("Dylan");
//        human.setHeight(6.4);
//        human1.setHeight(6.3);
//        human1.printData();

//        System.out.println(Age);

        Indian indian = new Indian();
        Arabic arabic = new Arabic();
        Human[] humans = {indian, arabic};

        for (Human s : humans){
            s.Age();
        }


//        indian.printData();
//        int i = 2;
//        indian.Gol(i);

//        Human aHuman = new Man1();
//        Human secondOne = new TumbaYoumba();
//
//        Man1 man = new Man1();
//        TumbaYoumba tumbaYoumba = new TumbaYoumba();
//
//        List<Human> menList = new ArrayList<>();
//        menList.add(man);
//        menList.add(aHuman);
//        menList.add(tumbaYoumba);
//
//        Human human = menList.get(0);
//        Man1 gotMan = (Man1) human;
//        gotMan.doSomething();
//
//        // ошибка при попытке приведения типов
//        Human shuman = menList.get(2);
//        Man1 sgotMan = (Man1) shuman;
//        sgotMan.doSomething();
//
//
//        aHuman.getName();
//        secondOne.getName();
    }
}
