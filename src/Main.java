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

    public static void task1() {
        System.out.println("Задача 1");
        byte oranges = 3;
        System.out.println("Значение переменной Апельсины с типом byte равно "+oranges);
        short beads = 15000;
        System.out.println("Значение переменной Бисер с типом short равно "+beads);
        int populationOfRussia = 146980061;
        System.out.println("Значение переменной Население России с типом int равно "+populationOfRussia);
        long populationOfTheEarth = 8046949318L;
        System.out.println("Значение переменной Население Земли с типом long равно "+populationOfTheEarth);
        float tripDuration = 2.5f;
        System.out.println("Значение переменной Длительность поездки с типом float равно "+tripDuration+" часа.");
        double intestinalMicroorganisms = 500000000;
        System.out.println("Значение переменной Микроорганизмы кишечника с типом double равно "+intestinalMicroorganisms);
    }
    public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12f;
        System.out.println("Значение " +a+" переменной a относится к типу float");
        long b = 987678965549L;
        System.out.println("Значение " +b+" переменной b относится к типу long");
        float c = 2.786f;
        System.out.println("Значение " +c+" переменной c относится к типу float");
        short d = 569;
        System.out.println("Значение " +d+" переменной d относится к типу short");
        short e = -159;
        System.out.println("Значение " +e+" переменной e относится к типу short");
        short f = 27897;
        System.out.println("Значение " +f+" переменной f относится к типу short");
        byte g = 67;
        System.out.println("Значение " +g+" переменной g относится к типу byte");
    }
    public static void task3() {
        System.out.println("Задача 3");
        byte studentsOfLyudmilaPavlovna = 23;
        byte studentsOfAnnaSergeyevna = 27;
        byte studentsOfEkaterinaAndreevna = 30;
        short papers = 480;
        int totalNumberOfStudents = studentsOfLyudmilaPavlovna+studentsOfAnnaSergeyevna+studentsOfEkaterinaAndreevna;
        int sheetsForEach = (short) (papers/totalNumberOfStudents);
        System.out.println("На каждого ученика рассчитано "+sheetsForEach+ " листов бумаги.");
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte hours = 24;
        byte minutes = 60;
        byte days =30;
        byte productivityIn2minutes = 16;
        byte productivityIn1minutes = (byte) (productivityIn2minutes/2);
        short productivityIn20minutes = (short) (productivityIn1minutes*20);
        System.out.println("За 20 минут машина произвела "+productivityIn20minutes+" бутылок.");
        short productivityPerDay = (short) (minutes*hours*productivityIn1minutes);
        System.out.println("За сутки машина произвела "+productivityPerDay+" бутылок.");
        int productivityIn3Days = (productivityPerDay*3);
        System.out.println("За 3 дня машина произвела "+productivityIn3Days+" бутылок.");
        int performancePerMonth = (productivityPerDay*days);
        System.out.println("За месяц машина произвела "+performancePerMonth+" бутылок.");
    }
    public static void task5() {
        System.out.println("Задача 5");
        byte cansOfPaint = 120;
        byte paintForOne = 2+4;
        byte totalRooms = (byte) (cansOfPaint/paintForOne);
        byte whitePaint = (byte) (2*totalRooms);
        byte brownPaint = (byte) (4*totalRooms);
        System.out.println("В школе, где " +totalRooms+" классов, нужно "+whitePaint+" банок белой краски и "+brownPaint+" банок коричневой краски.");
    }
    public static void task6() {
        System.out.println("Задача 6");
        byte banana1 = 80;
        byte milk1 = 105;
        byte iceCream1 = 100;
        byte egg1 = 70;
        short totalBananas = (short) (5*banana1);
        short totalMilk = (short) (2*milk1);
        short totalIceCream = (short) (2*iceCream1);
        short totalEggs = (short) (4*egg1);
        short weightOfBreakfast = (short) (totalBananas+totalEggs+totalIceCream+totalMilk);
        float weightKg = (float) (weightOfBreakfast*0.001);
        System.out.println("Вес завтрака спортсмена составляет "+weightOfBreakfast+" грамм или "+weightKg+" килограмм.");
    }
    public static void task7() {
        System.out.println("Задача 7");
        byte excessWeightKg = 7;
        short excessWeightG = (short) (1000*excessWeightKg);
        short weightLoss1 = 250;
        short weightLoss2 = 500;
        short days1 = (short) (excessWeightG/weightLoss1);
        short days2 = (short) (excessWeightG/weightLoss2);
        System.out.println("Если спортсмен будет худеть на 250 грамм в день, то вес уйдет за "+days1+" дней, а в случае потери 500 грамм вдень, вес уйдет всего за "+days2+" дней.");
    }
    public static void task8() {
        System.out.println("Задача 8");
        int salaryMashaMonth1 = 67760;
        int salaryDenisMonth1 = 83690;
        int salaryKristinaMonth1 = 76230;
        int salaryMashaYear1 = 12*salaryMashaMonth1;
        int salaryDenisYear1 = 12*salaryDenisMonth1;
        int salaryKristinaYear1 = 12*salaryKristinaMonth1;
        float salaryMashaMonth2 = (float) (salaryMashaMonth1*1.1);
        float salaryDenisMonth2 = (float) (salaryDenisMonth1*1.1);
        float salaryKristinaMonth2 = (float) (salaryKristinaMonth1*1.1);
        float salaryMashaYear2 = (float) (salaryMashaMonth2*12);
        float salaryDenisYear2 = (float) (salaryDenisMonth2*12);
        float salaryKristinaYear2 = (float) (salaryKristinaMonth2*12);
        float differencePerYearMasha = (float) (salaryMashaYear2-salaryMashaYear1);
        float differencePerYearDenis = (float) (salaryDenisYear2-salaryDenisYear1);
        float differencePerYearKristina = (float) (salaryKristinaYear2-salaryKristinaYear1);
        System.out.println("Маша теперь получает "+salaryMashaMonth2+" рублей. Годовой доход вырос на "+differencePerYearMasha+" рублей");
        System.out.println("Денис теперь получает "+salaryDenisMonth2+" рублей. Годовой доход вырос на "+differencePerYearDenis+" рублей");
        System.out.println("Кристина теперь получает "+salaryKristinaMonth2+" рублей. Годовой доход вырос на "+differencePerYearKristina+" рублей");
    }
}