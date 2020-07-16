package Introduction;

public class Main {

    // 1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
    public static void main(String[] args) {

        // 2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        int i = 1;
        short sh = 2;
        long l = 3;
        double d = 12.3d;
        float fl = 45678.9f;
        String str = "abc";
        char ch = 'x';
        boolean b = false;

        int val = task3(4, 5, 12, 3);
        System.out.println(val);

        boolean val1 = task4(17, 3);
        System.out.println(val1);

        task5(10);

        boolean val2 = task6(-5);
        System.out.println(val2);

        task7("Jesus");

        checkIsLeap(1900);

    }

    // 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
    public static int task3 (int a, int b, int c, int d){
        return a * (b + (c / d));
    }

    // 4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
    //если да – вернуть true, в противном случае – false;
    public static boolean task4 (int x, int y){
        return 10 <= x + y && x + y <= 20;
    }

    // 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль
    // положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
    public static void task5 (int a){
        System.out.println(a < 0 ? "Отрицательное" : "Положительное");
    }

    // 6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
    public static boolean task6 (int a){
        return a < 0;
    }

    // 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    // метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    public static void task7 (String name){
        System.out.println("Привет " + name);
    }

    // 8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void checkIsLeap (int year) {
        if (year % 100 != 0 && year % 4 == 0) {
            System.out.println("Високосный");
        } else if (year % 400 == 0) {
            System.out.println("Високосный");
        } else {
            System.out.println("Невисокосный");
        }
    }
}

