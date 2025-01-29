package ru.job4j.loop;

public class Savings {

        public static int years(double goal, double annualDeposit, double percent) {
            int years = 0;
            double total = 0;
            percent = percent / 100 + 1;
            do {
                total = ((total * percent) + annualDeposit);
                years++;
            }
            while (total <= goal);
            return years;
        }
    }