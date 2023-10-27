public class Main {
    public static void main (String[] args){
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
        System.out.println("Задача 1");
        byte a = 121;
        short b = 12321;
        int c = 1234554321;
        long d = 12345677654321L;
        float e = 0.1234567f;
        double g = 0.123456789;
        System.out.println("Значение переменной a, с типом byte равно: " + a);
        System.out.println("Значение переменной b, с типом short равно: " + b);
        System.out.println("Значение переменной c, с типом int равно: " + c);
        System.out.println("Значение переменной d, с типом long равно: " + d);
        System.out.println("Значение переменной e, с типом float равно: " + e);
        System.out.println("Значение переменной g, с типом double равно: " + g);
    }

    public static void task2(){
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        float c =2.786f;
        short d = 569;
        short e = -159;
        short g = 27897;
        byte f = 67;
        System.out.println("Значение: " + a + " имеет тип переменной float.");
        System.out.println("Значение: " + b + " имеет тип переменной long.");
        System.out.println("Значение: " + c + " имеет тип переменной float.");
        System.out.println("Значение: " + d + " имеет тип переменной short.");
        System.out.println("Значение: " + e + " имеет тип переменной short.");
        System.out.println("Значение: " + g + " имеет тип переменной short.");
        System.out.println("Значение: " + f + " имеет тип переменной byte.");
    }

    public static void task3(){
        System.out.println("Задача 3");
        byte studentsLyudmilaPavlovna = 23;
        byte studentsAnnaSergeevna = 27;
        byte studentsEcatherineAndreyevna = 30;
        short paper = 480;
        byte students = (byte) (studentsLyudmilaPavlovna + studentsAnnaSergeevna + studentsEcatherineAndreyevna);
        short result = (short) (paper / students);
        System.out.println("На каждого ученика рассчитано " + result + " листов бумаги.");
    }

    public static void task4(){
        System.out.println("Задача 4");
        byte bottles = 16;
        byte time = 2;
        byte oneBottlesMin = (byte) (bottles / time);
        short bottlesTwentyMin = (short)(oneBottlesMin * 20);
        System.out.println("За 20 минут, машина произвела " + bottlesTwentyMin + " штук бутылок.");
        short dayMin = 1440;
        short bottlesDay = (short) (oneBottlesMin * dayMin);
        System.out.println("За сутки, машина произвела " + bottlesDay + " штук бутылок.");
        int bottlesThreeDay = bottlesDay * 3;
        System.out.println("За 3 дня, машина произвела " + bottlesThreeDay + " штук бутылок.");
        int bottlesMonth = bottlesDay * 30;
        System.out.println("За 1 месяц, машина произвела " + bottlesMonth + " штук бутылок.");
    }

    public static void task5(){
        System.out.println("Задача 5");
        byte allBanks = 120;
        byte twoWhiteBanks = 2;
        byte fourBrownBanks = 4;
        byte banksOneOffice = (byte) (twoWhiteBanks + fourBrownBanks);
        byte office = (byte) (allBanks / banksOneOffice);
        byte allWhiteBanks = (byte) (office * twoWhiteBanks);
        byte allBrownBanks = (byte) (office * fourBrownBanks);
        System.out.println("В школе, где " + office + " классов, нужно " + allWhiteBanks + " банок белой краски и " + allBrownBanks + " банок коричневой краски.");
    }

    public static void task6(){
        System.out.println("Задача 6");
        byte oneBanana = 80;
        byte hundredMilk = 105;
        byte oneIceCreamBriquette = 100;
        byte oneEgg = 70;
        byte bannana = 5;
        byte milk = 2;
        byte iceCreamBriquette = 2;
        byte egg = 4;
        short allBanana = (short) (oneBanana * bannana);
        short allMilk = (short) (hundredMilk * milk);
        short allIceCreamBriquette = (short) (oneIceCreamBriquette * iceCreamBriquette);
        short allEgg = (short) (oneEgg * egg);
        short mix = (short) (allBanana + allMilk + allIceCreamBriquette + allEgg);
        float mixKg = (float)(mix) / 1000;
        System.out.println("В утреннем спорт завтраке " + mix + " грамм или " + mixKg + " килограмм.");
    }

    public static void task7(){
        System.out.println("Задача 7");
        byte loseWeightKg = 7;
        short minLoseWeight = 250;
        short maxLoseWeight = 500;
        short LoseWeightGr = (short) (loseWeightKg * 1000);
        short minDays = (short) (LoseWeightGr / minLoseWeight);
        short maxDays = (short) (LoseWeightGr / maxLoseWeight);
        short averageDays = (short) ((minDays + maxDays) / 2);
        System.out.println("Если  каждый день терять по " + minLoseWeight + " грамм. Надо худеть " + minDays + " дней. Чтобы оставаться в своей весовой категории.");
        System.out.println("Если  каждый день терять по " + maxLoseWeight + " грамм. Надо худеть " + maxDays + " дней. Чтобы оставаться в своей весовой категории.");
        System.out.println("В среднем потребуется " + averageDays + " дней. Чтобы добиться результата похудения. ");
    }

    public static void task8(){
        System.out.println("Задача 8");
        int zpMasha = 67760;
        int zpDenis = 83690;
        int zpChristina = 76230;
        float levelUpMasha = zpMasha * 0.1f;
        float levelUpDenis = zpDenis * 0.1f;
        float levelUpChristina = zpChristina * 0.1f;
        float levelUpZpMasha = zpMasha + levelUpMasha;
        float levelUpZpDenis = zpDenis + levelUpDenis;
        float levelUpZpChristina = zpChristina + levelUpChristina;
        float differenceYearMasha = (levelUpZpMasha - zpMasha) * 12;
        float differenceYearDenis = (levelUpZpDenis - zpDenis) * 12;
        float differenceYearChristina = (levelUpZpChristina - zpChristina) * 12;
        System.out.println("Маша теперь получает " + levelUpZpMasha + " рублей. Годовой доход вырос на " + differenceYearMasha + " рублей.");
        System.out.println("Денис теперь получает " + levelUpZpDenis + " рублей. Годовой доход вырос на " + differenceYearDenis + " рублей.");
        System.out.println("Кристина теперь получает " + levelUpZpChristina + " рублей. Годовой доход вырос на " + differenceYearChristina + " рублей.");
    }
}