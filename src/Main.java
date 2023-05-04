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
    public static void task1 () {
        System.out.println("Задача 1");
        int a = 2_123_333;
        System.out.println("Значение переменной a с типом int равно " + a);
        byte b = 106;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short k = 12988;
        System.out.println("Значение переменной k с типом short равно " + k);
        long d = 1_789_993_766L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float x = 5.13579f;
        System.out.println("Значение переменной x с типом float равно " + x);
        double y = 5.789654057;
        System.out.println("Значение переменной y с типом double равно " + y);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        float a = 27.12f;
        System.out.println(a);
        long b = 987_678_965_549L;
        System.out.println(b);
        float c = 2.786f;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        short f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte studentsFirstTeacher = 23;
        byte studentsSecondTeacher = 27;
        byte studentsThirdTeacher = 30;
        short totalSheetsPaper = 480;
        int totalStudents = studentsFirstTeacher + studentsSecondTeacher + studentsThirdTeacher;
        int sheetsPaperForOneStudent = totalSheetsPaper/totalStudents;
        System.out.println("На каждого ученика расчитано " + sheetsPaperForOneStudent + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte productionOneMinute = 16 /  2;
        int production20Minutes = productionOneMinute * 20;
        System.out.println("За 20 минут машина произвела " + production20Minutes + " штук бутылок");
        int productionOneHour = production20Minutes * 3;
        int productionOneDay = productionOneHour * 24;
        System.out.println("За сутки машина произвела " + productionOneDay +  " штук бутылок");
        int productionIn3Days = productionOneDay * 3;
        System.out.println("За 3 дня машина произвела " + productionIn3Days + " штук бутылок");
        int productionsOneMonth1 = productionOneDay * 30;
        System.out.println("За один месяц (30 дней) машина произвела " + productionsOneMonth1 + " штук бутылок");
        int productionsOneMonth2 = productionOneDay * 31;
        System.out.println("За один месяц (31 день) машина произвела " + productionsOneMonth2 + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte totalCansOfPaint = 120;
        byte cansWhitePaintForOneClassNeed = 2;
        byte cansBrownPaintForOneClassNeed = 4;
        byte totalCansOfPaintForOneClassNeed = 2 + 4;
        int totalClasses = totalCansOfPaint / totalCansOfPaintForOneClassNeed;
        int totalWhitePaintNeed = totalClasses * cansWhitePaintForOneClassNeed;
        int totalBrownPaintNeed = totalClasses * cansBrownPaintForOneClassNeed;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaintNeed + " банок белой краски и " + totalBrownPaintNeed + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        short totalGramsOfBananas = 5 * 80;
        short totalGramsOfMilk = 105 * 2;
        short totalGramsIceCream = 100 * 2;
        short totalGramsRawEggs = 70 *  4;
        int weightBreakfastInGrams = totalGramsOfBananas + totalGramsOfMilk + totalGramsIceCream + totalGramsRawEggs;
        System.out.println("Вес спортзавтрака " + weightBreakfastInGrams + " грамм");
        float weightBreakfastInKilograms = weightBreakfastInGrams / 1000f;
        System.out.println("Вес спортзавтрака " + weightBreakfastInKilograms + " килограмм");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        short needToLoseWeightInGrams = 7 * 1000;
        int daysWillGoAwayWithWeightLossOf250Grams = needToLoseWeightInGrams / 250;
        int daysWillGoAwayWithWeightLossOf500Grams = needToLoseWeightInGrams / 500;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то уйдет " + daysWillGoAwayWithWeightLossOf250Grams + " дней, а если каждый день будет худеть на 500 грамм, то уйдет " + daysWillGoAwayWithWeightLossOf500Grams + " дней");
        int daysOnAverageRequired = (daysWillGoAwayWithWeightLossOf250Grams + daysWillGoAwayWithWeightLossOf500Grams) / 2;
        System.out.println("В среднем на похудение может потребоваться " + daysOnAverageRequired + " день");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        int mashaWillReceive = salaryMasha * 110 /  100;
        int denisWillReceive = salaryDenis * 110 /  100;
        int kristinaWillReceive = salaryKristina * 110 / 100;
        int wasTheAnnualIncomeMasha = salaryMasha * 12;
        int wasTheAnnualIncomeDenis = salaryDenis * 12;
        int wasTheAnnualIncomeKristina = salaryKristina * 12;
        int thereWillBeAnAnnualIncomeMasha = mashaWillReceive * 12;
        int thereWillBeAnAnnualIncomeDenis = denisWillReceive * 12;
        int thereWillBeAnAnnualKristina = kristinaWillReceive * 12;
        int differenceBetweenAnnualIncomeMasha = thereWillBeAnAnnualIncomeMasha - wasTheAnnualIncomeMasha;
        int differenceBetweenAnnualIncomeDenis = thereWillBeAnAnnualIncomeDenis - wasTheAnnualIncomeDenis;
        int differenceBetweenAnnualIncomeKristina = thereWillBeAnAnnualKristina - wasTheAnnualIncomeKristina;
        System.out.println("Маша теперь получет " + mashaWillReceive + " рублей. Годовой доход вырос на " + differenceBetweenAnnualIncomeMasha + " рублей");
        System.out.println("Денис теперь получет " + denisWillReceive + " рублей. Годовой доход вырос на " + differenceBetweenAnnualIncomeDenis + " рублей");
        System.out.println("Кристина теперь получет " + kristinaWillReceive + " рублей. Годовой доход вырос на " + differenceBetweenAnnualIncomeKristina + " рублей");
    }
}