public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1(){
        System.out.println("Задание 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2(){
        System.out.println("Задание 2");
        var dog = 8.0 + 4;
        var cat = 3.6 + 4;
        var paper = 763789 + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task3(){
        System.out.println("Задание 3");
        var dog = 8.0 - 3.5;
        var cat = 3.6 - 1.6;
        var paper = 763789 - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4(){
        System.out.println("Задание 4");
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
    }
    public static void task5(){
        System.out.println("Задание 5");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
    }
    public static void task6(){
        System.out.println("Задание 6");
        var person1 = 78.2;
        var person2 = 82.7;
        var sum = person1 + person2;
        System.out.println(sum);
        var diff = person2 - person1;
        System.out.println(diff);
    }
    public static void task7(){
        System.out.println("Задание 7");
        var person1 = 78.2;
        var person2 = 82.7;
        var diff = person2 - person1;
        System.out.println(diff);
        diff = person2 % person1;
        System.out.println(diff);
    }
    public static void task8(){
        System.out.println("Задание 8");
        var hour = 640;
        var worker = hour / 8;
        System.out.println("Всего работников в компании - " + worker + " человек");
        worker += 94;
        hour = worker * 8;
        System.out.printf("Если в компании работает %d человек, то всего %d часов работы может быть поделено между " +
                "сотрудниками",worker ,hour);
    }
}