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
        task9();
    }
    private static void task1() {
        System.out.println("Задание 1");
        int salary = 15000;
        int total = 0;
        int savings = 2459000;
        for (int month = 0; total <= savings; month++) {
            total += total / 100;
            total += salary;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + total + " рублей");


        }

    }

    private static void task2() {
        System.out.println("Задание 2");
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
        System.out.println("Задание 3");
//        В стране Y население равно 12 миллионам человек.
//        Рождаемость составляет 17 человек на 1000 человек,
//        смертность - 8 человек. Рассчитайте, какая численность населения будет через 10 лет,
//        принимая во внимание, что показатели рождаемости и смертности постоянны.
//        В консоль выведите результат операции на каждый год в формате “Год …, численность населения составляет … ”
        System.out.println();
        int population, birthRate, deathRate, allPeopleRate;
        population = 12000000;
        for (int year = 1; year <= 10; year++) {
            birthRate = population / 1000 * 17;
            deathRate = population / 1000 * 8; // было замечание что смертность и рождаемость постоянны поэтому вынести за цикл
            // но ведь население каждый год меняется
            allPeopleRate = birthRate - deathRate;
            population += allPeopleRate;
            System.out.println(" Год " + year + ", численность населения составляет " + population);

        }
    }

    private static void task4() {
        System.out.println("Задание 4");
        long savings = 15000;
        long total = 0;
        long totalSavings = 12_000_000;
        int mounth = 1;
        for (; savings <= totalSavings; mounth++) {
            total += savings / 100 * 7;
            savings += total;

            System.out.println("Месяц " + mounth + " , сумма накоплений равна " + savings + " рублей");
        }
    }

    private static void task5() {
        System.out.println("Задание 5");
        long savings = 15000;
        long total = 0;
        long totalSavings = 12_000_000;
        int mounth= 1;
        for (; savings <= totalSavings; mounth++) {
            total += savings / 100 * 7;
            savings += total;
            if (mounth % 6 == 0) {
                System.out.println("Месяц " + mounth + " , сумма накоплений равна " + savings + " рублей");
            }

        }
    }

    private static void task6() {
        System.out.println("Задание 6");
        long savings = 15000;
        long total = 0;
        int month = 1;
        int year = 9;
        int monthYear = 12;
        int totalMonth = year * monthYear;
        for (; month <= totalMonth; month++) {
            total += savings / 100 * 7;
            savings += total;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " , сумма накоплений равна " + savings + " рублей");
            }

        }
    }

    private static void task7() {
        System.out.println("Задание 7");
        int friday = 1;
        int dayMonth = 31;
        int dayWeek = 7;
        for (; friday < dayMonth; friday += dayWeek) {
            System.out.println("Сегодня пятница, " + friday + " число. Необходимо сдать отчет.");
        }
    }

    private static void task8() {
        System.out.println("Задание 8");
        int zeroYear, periodCycle, thisYear, lastTimeCycle, futureTimeCycle, beginCountDown,endCountDown;
        zeroYear = 0;
        periodCycle = 79;
        thisYear = 2022;
        lastTimeCycle = 200;
        futureTimeCycle = 100;
        beginCountDown = thisYear - lastTimeCycle;
        endCountDown = thisYear + futureTimeCycle;
        for (; zeroYear <= endCountDown; zeroYear += periodCycle) {
            if (zeroYear >= beginCountDown && zeroYear <= endCountDown){
                System.out.println(zeroYear);
            }

        }
    }
    private static void task9() {
        System.out.println("Задание 9");
        int a, b , multiplication;
        a = 1;
        b = 2;
        for (; a <= 10 ; a++) {
            multiplication = a * b;
            System.out.println(multiplication);
        }
    }
}



