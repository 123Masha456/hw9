public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] money = generateRandomArray();
        int total = 0;
        for (int element : money) {
            total += element;
        }
        System.out.println("Сумма трат за месяц составила " + total);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] money = generateRandomArray();
        int maxPay = money[0];
        int minPay = money[0];
        for (int i = 0; i < money.length; i++) {
            if (money[i] > maxPay) {
                maxPay = money[i];
            }
            if (money[i] < minPay) {
                minPay = money[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxPay);
        System.out.println("Минимальная сумма трат за день составила " + minPay);
    }


    public static void task3() {
        System.out.println("Задача 3");
        int[] money = generateRandomArray();
        int total = 0;
        for (int i = 0; i < money.length; i++) {
            total += money[i];
        }
        double middlePay = (double) total / money.length;
        System.out.println("Средняя сумма трат за день составила " + middlePay);
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}




