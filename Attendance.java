package org.example;
import java.util.Random;
public class Attendance
{
    public void attendance()
    {
        int perhour=20;
        int fulldayhour=8;
        int halfdayhour=4;
        Random obj = new Random();
        int check = obj.nextInt(3);

        switch (check )
        {
            case 0:
            System.out.println("Absent\nDay Wage is Zero");
            break;
            case 1:
            System.out.println("Employee present for half day\n"+"Employee half Day Wage is:"+perhour*halfdayhour);
            break;
            case 2:
            System.out.println("Employee present\n"+"Employee Day Wage is:"+perhour*fulldayhour);
            break;
        }
    }
}
