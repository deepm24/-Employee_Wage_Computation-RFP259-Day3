package org.example;

import java.util.Random;

public class Attendance {
    public void attendance() {
        Random obj = new Random();
        int check = obj.nextInt(2);
        if (check == 0)
        {
            System.out.println("Absent");
        }
        else
        {
            System.out.println("present");
        }
    }
}
