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
        int[] randomArray = generateRandomArray();
        int amountOfExpenses = 0;
        for (int i = 0; i < randomArray.length; i++) {
            amountOfExpenses = amountOfExpenses + randomArray[i];
        }
        System.out.println("Сумма трат за месяц составила " + amountOfExpenses + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] randomArray = generateRandomArray();
        int minExpenses = randomArray[0];
        int maxExpenses = randomArray[0];
        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] < minExpenses) {
                minExpenses = randomArray[i];
            } else if (randomArray[i] > maxExpenses) {
                maxExpenses = randomArray[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpenses + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxExpenses + " рублей");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] randomArray = generateRandomArray();
        float amountOfExpenses = 0;
        for (int i = 0; i < randomArray.length; i++) {
            amountOfExpenses = amountOfExpenses + randomArray[i];
        }
        float averageExpenses = amountOfExpenses / randomArray.length;
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