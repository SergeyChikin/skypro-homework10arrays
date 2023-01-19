public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();


    }
    int[] arrExpenses = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arrExpenses = new int[30];
        for (int i = 0; i < arrExpenses.length; i++) {
            arrExpenses[i] = random.nextInt(100_000) + 100_000;
        }
        return arrExpenses;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int amountOfExpenses = 0;
        for (int i = 0; i < generateRandomArray().length; i++) {
            amountOfExpenses = amountOfExpenses + generateRandomArray()[i];
        }
        System.out.println("Сумма трат за месяц составила " + amountOfExpenses + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int minExpenses = generateRandomArray()[0];
        int maxExpenses = generateRandomArray()[0];
        for (int i = 0; i < generateRandomArray().length; i++) {
            if (generateRandomArray()[i] < minExpenses) {
                minExpenses = generateRandomArray()[i];
            } else if (generateRandomArray()[i] > maxExpenses) {
                maxExpenses = generateRandomArray()[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpenses + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxExpenses + " рублей");
    }

    public static void task3() {
        System.out.println("Задача 3");
        float amountOfExpenses = 0;
        for (int i = 0; i < generateRandomArray().length; i++) {
            amountOfExpenses = amountOfExpenses + generateRandomArray()[i];
        }
        float averageExpenses = amountOfExpenses / generateRandomArray().length;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpenses + " рублей");
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }


}