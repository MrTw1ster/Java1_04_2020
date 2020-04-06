 public class Main {
        public static void main(String[] args) {
            doOne();
            System.out.println("a * (b + (c / d)) = " + doTwo(5,6,7,11));
            System.out.println(doThree(12, 13));
            doFour(-7);
            System.out.println(doFive(-7));
            doSix("Михаил");
            doSeven(2025);
        }

        // 2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        static void doOne() {
            System.out.println("Задание 1.");
            boolean b = false;
            byte bt = 0;
            char c = 'x';
            short s = 123;
            int i = 777;
            long l = 77777L;
            float f = 777.0f;
            double d = 777.777;
            System.out.println("Значение для типа boolean = " + b);
            System.out.println("Значение для типа byte = " + bt);
            System.out.println("Значение для типа char = [" + c + "]");
            System.out.println("Значение для типа short = " + s);
            System.out.println("Значение для типа int = " + i);
            System.out.println("Значение для типа long = " + l);
            System.out.println("Значение для типа float = " + f);
            System.out.println("Значение для типа double = " + d);
        }

        //3
        static double doTwo(double a, double b, double c, double d) {
            System.out.println("Задание 3.");
            return a * (b + (c / d));
        }

        //4
        static boolean doThree(int a, int b) {
            System.out.println("Задание 4.");
            int sum = a + b;
            if (sum > 10 && sum < 20) return true;
            else return false;
        }

        //5
        static void doFour(int a) {
            System.out.println("\nЗадание 5.");
            if (a >= 0) System.out.println("Число " + a + "положительное");
            else System.out.println("Число " + a + " отрицательное");
        }

        //6
        static boolean doFive(int a) {
            System.out.println("\nЗадание 6.");
            if (a < 0) return true;
            return false;
        }

        //7.
        static void doSix(String name) {
            System.out.println("\nЗадание 7.");
            System.out.println("Привет, " + name + "!");
        }

        //8.
        static void doSeven(int year) {
            System.out.println("\nЗадание 8.");
            if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " г. не високосный");
            else System.out.println(year + " г. високосный");
        }
    }
