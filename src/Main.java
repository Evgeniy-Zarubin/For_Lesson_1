public class Main {
    public static void main(String[] args) {
        //Задача 1
        for (int i = 1; i <= 10; i++) {
            System.out.println("Значение:" + i);
        }

        //Задача 2
        for (int s = 10; s >= 1; s--) {
            System.out.println("Убывание:" + s);
        }
        //Задача 3
        for (int l = 0; l <= 17; l = l + 2) {
            System.out.println("Четные:" + l);
        }

        //Задача 4
        for (int w = 10; w >= -10; w--) {
            System.out.println("(10 и -10):" + w);
        }

        //Задача 5
        for (int y = 1904; y <= 2096; y = y + 4) {
            System.out.println(y + " год является  високосным");
        }

        //Задача 6
        for (int n = 7; n <= 98; n = n + 7) {
            System.out.println("Счёт +7:" + n);
        }

        //Задача 7
        for (int n2 = 1; n2 <= 512; n2 = n2 * 2) {
            System.out.println("Умножение на 2:" + n2);
        }

        //Задача 8
        int deposit = 29000;
        int sumDeposit = 0;
        for (int i = 1; i <= 12; i++) {
            sumDeposit = sumDeposit + deposit;
            System.out.println("Месяц " + i + " Сумма накоплений равна " + sumDeposit);
        }

        //Задача 9
        int investment = 29000;
        int sumInvestment = 0;
        for (int i = 1; i <= 12; i++) {
            sumInvestment = sumInvestment + investment / 100;
            sumInvestment = sumInvestment + investment;
            System.out.println("Месяц " + i + " Сумма накоплений равна " + sumInvestment);
        }

        //Задача 10
        int number = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "*" + i + " = " + number * i);
        }

    }
}