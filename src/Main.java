public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
//        task5();
//        task6();
//        task7();
//        task8();
    }

    private static void task1() {
        int salary = 15000;
        int total = 0;
        for (int i = 0; total <= 2459000; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей");


        }

    }

    private static void task2() {
        int i = 0;
        while (i < 10) {
            i += 1;
            System.out.print(i + " ");

        }
        System.out.println();
        for (int j = 10; j >= 1; j--) {

            System.out.print(j + " ");

        }

    }

    private static void task3() {
        System.out.println();
        int population, birthRate, deathRate, allPeopleRate;
        population = 12000000;
        for (int year = 1; year <= 10; year++) {
            birthRate = population / 1000 * 17;
            deathRate = population / 1000 * 8;
            allPeopleRate = birthRate - deathRate;
            population += allPeopleRate;
            System.out.println(" Год " + year + ", численность населения составляет " + population);

        }
    }

    private static void task4() {
        int savings = 15000;
        int total = 0;
        int i = 1;
        for (; i <= 108; i++) {
            total += savings / 100 * 7;
            savings += total;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " , сумма накоплений равна " + savings + " рублей");
            }

        }
    }
}


