package org.example;

import java.util.Random;

public class Attendance
{
    public void attendance()
    {
        int perhour=20;
        int dayhour=8;
        Random obj = new Random();
        int check = obj.nextInt(2);
        if (check == 0)
        {
            System.out.println("Absent\nDay Wage is Zero");
        }
        else
        {
            System.out.println("Employee present\n"+"Employee Day Wage is:"+perhour*dayhour);
        }
    }
}
