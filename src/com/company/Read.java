package com.company;

import java.util.Scanner;

public class Read {

    public String[] read()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the course: ");
        String course=scan.next();
        System.out.println("Enter the number of students to be registered in"+course);
        int size=scan.nextInt();
        String[] firstName=new String[size];
        String[] lastName=new String[size];
        String[] name=new String[size];

        for(int array1=0;array1<size;array1++)
        {
            System.out.println("Enter first name:");
            firstName[array1] = scan.next();
            System.out.println("Enter last name:");
            lastName[array1] = scan.next();
            StringBuilder builder=new StringBuilder();
            builder.append(firstName[array1]).append(" ").append(lastName[array1]);
            name[array1]=builder.toString();

        }
        return name;

    }
}
