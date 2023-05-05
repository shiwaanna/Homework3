import java.util.Locale;

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
        long d = 55_789_993_766L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float x = 5.13579f;
        System.out.println("Значение переменной x с типом float равно " + x);
        double y = 5.789654057;
        System.out.println("Значение переменной y с типом double равно " + y);
    }

    public static void task2 () {
        float a = 27.12f;
        long b = 987_678_965_549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;

    }
    public static void task3 () {
        System.out.println("Задача 3");
        int studentsFirstTeacher = 23;
        int studentsSecondTeacher = 27;
        int studentsThirdTeacher = 30;
        int totalSheetsPaper = 480;

        int totalStudents = studentsFirstTeacher + studentsSecondTeacher + studentsThirdTeacher;
        int sheetsPaperForOneStudent = totalSheetsPaper/totalStudents;
        System.out.println("На каждого ученика расчитано " + sheetsPaperForOneStudent + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int bottles = 16;
        int minutes = 2;
        int bottlesPerMinute = bottles / minutes;
        int bottles20Minutes = bottlesPerMinute * 20;
        int bottlesPerHour = bottles20Minutes * 3;
        int bottlesPerDay = bottlesPerHour * 24;
        int bottlesPer3Days = bottlesPerDay * 3;
        int bottlesPerMonth = bottlesPerDay * 30;

        System.out.println("За 20 минут машина произвела " + bottles20Minutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesPerDay +  " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesPer3Days + " штук бутылок");
        System.out.println("За один месяц машина произвела " + bottlesPerMonth + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;
        int totalClasses = totalCans / (whiteCansPerClass + brownCansPerClass);
        int totalWhiteCans= totalClasses * whiteCansPerClass;
        int totalBrownCans = totalClasses * brownCansPerClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int bananasCount = 5;
        int milkCount = 2;
        int iceCreamCount = 2;
        int eggsCount = 4;
        int weightBananasUnit = 80;
        int weightMilkUnit = 105;
        int weightIceCreamUnit = 100;
        int weightEggsUnit = 70;
        int totalWeightInGrams = bananasCount *  weightBananasUnit + milkCount * weightMilkUnit + iceCreamCount * weightIceCreamUnit + eggsCount * weightEggsUnit;
        float totalWeightInKg = totalWeightInGrams / 1_000f;

        System.out.println("Вес спортзавтрака " + totalWeightInGrams + " грамм");
        System.out.println("Вес спортзавтрака " + totalWeightInKg + " килограмм");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int weightForLossInGrams = 7 * 1_000;
        int lossWeightPerDayMin = 250;
        int lossWeightPerDayMax = 500;
        double maxDaysCount = (double)weightForLossInGrams / lossWeightPerDayMin;
        double minDaysCount = (double)weightForLossInGrams / lossWeightPerDayMax;
        double lossWeightPerDayAverage = (lossWeightPerDayMin + lossWeightPerDayMax) / 2D;
        double averageDaysCount = weightForLossInGrams / lossWeightPerDayAverage;

        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то уйдет " + maxDaysCount + " дней, а если каждый день будет худеть на 500 грамм, то уйдет " + minDaysCount + " дней");
        System.out.println("В среднем на похудение может потребоваться " + averageDaysCount + " дней");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int salaryMasha = 67_760;
        int salaryDenis = 83_690;
        int salaryKristina = 76_230;

        double indexPercent = 1.1;

        double newMashaSalary = salaryMasha * indexPercent;
        double newDenisWillSalary = salaryDenis * indexPercent;
        double newKristinaSalary = salaryKristina * indexPercent;

        double annualMashaSalary = salaryMasha * 12;
        double newAnnualMashaSalary = newMashaSalary * 12;

        double annualDenisSalary = salaryDenis * 12;
        double newAnnualDenisSalary = newDenisWillSalary * 12;

        double annualKristinaSalary = salaryKristina * 12;
        double newAnnualKristinaSalary = newKristinaSalary * 12;

        System.out.printf(Locale.US, " Маша теперь получет %.2f рублей. Годовой доход вырос на %.2f рублей", newMashaSalary, newAnnualMashaSalary - annualMashaSalary);
        System.out.printf(Locale.US, " Денис теперь получет %.2f рублей. Годовой доход вырос на %.2f рублей", newDenisWillSalary, newAnnualDenisSalary - annualDenisSalary);
        System.out.printf(Locale.US, " Кристина теперь получет %.2f рублей. Годовой доход вырос на %.2f рублей", newKristinaSalary, newAnnualKristinaSalary - annualKristinaSalary);
    }
}