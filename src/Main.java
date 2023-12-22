public class Main {
    public static void main(String[] args) {
        System.out.println("---------------");
        System.out.println("Task 1");
        System.out.println("---------------");
        System.out.println(sum1NRecursion(5));

        System.out.println("---------------");
        System.out.println("Task 2");
        System.out.println("---------------");
        System.out.println(multipRecursion(6, 5));

        System.out.println("---------------");
        System.out.println("Task 3");
        System.out.println("---------------");
        System.out.println(factorRecursion(5));

        System.out.println("---------------");
        System.out.println("Task 4");
        System.out.println("---------------");
        print1ToN(4);

        System.out.println("---------------");
        System.out.println("Task 5");
        System.out.println("---------------");
        printNTo1(4);
    }

    //-----------------------------
    //task 1
//-----------------------------
//    1. Напишите рекурсивный метод для вычисления суммы чисел от 1 до n.
//    n надо получить через аргументы.
    public static int sum1NRecursion(int n) {
        if (n == 1) return 1;
        return n + sum1NRecursion(n - 1);
    }

    //-----------------------------
    //task 2
//-----------------------------
//    2. Реализуйте метод, который умножает два числа с использованием рекурсии
    public static int multipRecursion(int a, int b) {
        if (b == 1) return a;
        return a + multipRecursion(a, b - 1);
    }

    //-----------------------------
    //task 3
//-----------------------------
//    3.  Напишите рекурсивный метод для вычисления факториала числа.
    public static int factorRecursion(int n) {
        if (n < 0) return -1;
        if (n == 0) return 1;
        return n * factorRecursion(n - 1);
    }

//-----------------------------
    //task 4
//-----------------------------
//    4.   Напишите рекурсивный метод для печати чисел от 1 до n.
//    n надо получить через аргументы.
    public static void print1ToN(int n) {
        if (n != 0) {
            print1ToN(n - 1);
            System.out.println(n);
        }
    }
//-----------------------------
    //task 5
//-----------------------------
//     5.   Напишите рекурсивный метод для печати чисел от n до 1. n
//     надо получить через аргументы.
public static void printNTo1(int n) {
    if (n != 0) {
        System.out.println(n);
        printNTo1(n - 1);
    }
}
}


