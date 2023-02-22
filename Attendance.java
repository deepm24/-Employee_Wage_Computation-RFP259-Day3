package org.example;
import java.util.Random;
public class Attendance
{
    public void attendance()
    {
        int perhour = 20;
        int fulldayhour = 8;
        int halfdayhour = 4;
        Random obj = new Random();
        int wage = 0;
        int day = 0;
        int count = 0;
        int absent = 0;
        int monthlyWage = 0;
        while (day != 20 && count != 30) {
             int check = obj.nextInt(3);

            switch (check)
            {
                case 0:
                    absent++;
                    count++;
                    break;
                case 1:
                    wage = halfdayhour * perhour;
                    monthlyWage = wage + monthlyWage;
                    count++;
                    day++;
                    break;
                case 2:
                    wage = fulldayhour * perhour;
                    monthlyWage = wage + monthlyWage;
                    count++;
                    day++;
                    break;
            }
        }
        System.out.println("monthly wage:" + monthlyWage);
        System.out.println("present day:" + day);
        System.out.println("Total day in month :" + count);
        System.out.println("Total absent in a month:" + absent);
    }
}