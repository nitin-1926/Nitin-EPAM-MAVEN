package org.example;

import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter name of children");
        String name=sc.next();
        System.out.println("Enter age of children");
        int age=sc.nextInt();
        Child child1=new Child(name,age);
        System.out.println("Enter name of children");
        name=sc.next();
        System.out.println("Enter age of children");
        age=sc.nextInt();
        Child child2=new Child(name,age);

        System.out.println("Enter name of chocolate");
        String chocolatename=sc.next();
        System.out.println("Enter weight of chocolate");
        int chocolateweight=sc.nextInt();
        System.out.println("Enter calories in chocolate");
        int chocolatecalories=sc.nextInt();
        System.out.println("Enter price of chocolate");
        int chocolaterate=sc.nextInt();
        Sweets choco1=new Choco(chocolatename,chocolateweight,chocolatecalories,chocolaterate);

        System.out.println("Enter name of chocolate");
        chocolatename=sc.next();
        System.out.println("Enter weight of chocolate");
        chocolateweight=sc.nextInt();
        System.out.println("Enter calories in chocolate");
        chocolatecalories=sc.nextInt();
        System.out.println("Enter price of chocolate");
        chocolaterate=sc.nextInt();
        Sweets choco2=new Choco(chocolatename,chocolateweight,chocolatecalories,chocolaterate);

        System.out.println("Enter name of cake");
        String cakename=sc.next();
        System.out.println("Enter weight of cake");
        int cakeweight=sc.nextInt();
        System.out.println("Enter calories in cake");
        int cakecalories=sc.nextInt();
        System.out.println("Enter price of cake");
        int cakerate=sc.nextInt();
        Sweets cake=new Cake(cakename,cakeweight,cakecalories,cakerate);

        System.out.println("Enter name of cake");
        cakename=sc.next();
        System.out.println("Enter weight of cake");
        cakeweight=sc.nextInt();
        System.out.println("Enter calories in cake");
        cakecalories=sc.nextInt();
        System.out.println("Enter price of cake");
        cakerate=sc.nextInt();
        Sweets cake1=new Cake(cakename,cakeweight,cakecalories,cakerate);

        System.out.println("Enter name of candy");
        String candyname=sc.next();
        System.out.println("Enter weight of candy");
        int candyweight=sc.nextInt();
        System.out.println("Enter calories in candy");
        int candycalories=sc.nextInt();
        System.out.println("Enter price of candy");
        int candyrate=sc.nextInt();
        Sweets candy=new Candy(candyname,candyweight,candycalories,candyrate);

        System.out.println("Enter name of candy");
        candyname=sc.next();
        System.out.println("Enter weight of candy");
        candyweight=sc.nextInt();
        System.out.println("Enter calories in candy");
        candycalories=sc.nextInt();
        System.out.println("Enter price of candy");
        candyrate=sc.nextInt();
        Sweets candy1=new Candy(candyname,candyweight,candycalories,candyrate);


        Vector<Sweets> sweet1=new Vector<Sweets>();
        sweet1.add(choco1);
        sweet1.add(cake);
        sweet1.add(candy);
        Vector<Sweets> sweet2=new Vector<Sweets>();
        sweet2.add(choco2);
        sweet2.add(cake1);
        sweet2.add(candy1);
        Gift gift1=new Gift(sweet1,"Happy New Year");
        Gift gift2=new Gift(sweet2,"Lots Of Wishes");
        child1.give(gift1,child1);
        child2.give(gift2,child2);
        child1.show();
        child2.show();
    }
}