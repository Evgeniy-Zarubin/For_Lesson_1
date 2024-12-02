public class Main {
    public static void main(String[] args) {
        //Задача 1
        int copital = 0;
        int bank = 15000;
        int month = 1;
        while (copital <= 2459000) {
            System.out.println("Месяц " + month + ", сумма накоплений равна " + copital + " рублей");
            month++;
            copital = copital + bank;
        }

        //Задача 2

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int l = 10; l >= 1; l--) {
            System.out.print(l + " ");
        }
        System.out.println();

        //Задача 3
        int y = 12000000;
        int year = 1;
        int born;
        int death;
        while (year <= 10) {
            System.out.println("Год " + year + ", численность насиления составляет " + y);
            year++;
            born = y / 1000 * 17;
            death = y / 1000 * 8;
            y = y + born - death;
        }

        //Задача 4
        double fond = 15000;
        int month2 = 1;
        while (fond <= 12000000) {
            System.out.println("Месяц " + month2 + ", сумма накоплений равна " + fond);
            fond = fond + (fond * 7 / 100);
            month2++;
        }

        //Задача 5
        double fond2 = 15000;
        int month3 = 1;
        while (fond2 <= 12000000) {
            if (month3 % 6 == 0) {
                System.out.println("Месяц " + month3 + ", сумма накоплений равна " + fond2);
            }
            fond2 = fond2 + (fond2 * 7 / 100);
            month3++;
        }
        //Задача 6
        double fond3 = 15000;
        int month4 = 1;
        int nineYears = 108;
        while (month4 <= nineYears){
            if (month4 % 6 == 0) {
                System.out.println("Месяц " + month4 + ", сумма накоплений равна " + fond3);
            }
            fond3 = fond3 + (fond3 * 7 / 100);
            month4++;
        }

        //Задача 7
        int friday = 3;
        do {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчёт.");
            friday = friday + 7;
        } while (friday <=31);

        //Задача 8
        int currentYear = 2023;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;
        int cometPeriod = 79;

        for (int year2 = startYear; year2 <= endYear; year2++) {
            if (year2 % cometPeriod == 0) {
                System.out.println(year2);
            }
        }

    }
}