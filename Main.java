package com.company;

public class Main {

    public static void main(String[] args) {


        int salary = 2500;

        int bills = 100;
        int rent = 1000;
        int commuting = 200;
        int food = 200;
        int clothing = 100;
        boolean inDebt;



        footballMatch(2000, 450, 700, 150, 250, 150, false);
        footballMatch(10000, 350, 1100, 350, 450, 350, false);
        footballMatch(3000, 150, 700, 150, 250, 150, false);
        footballMatch(1000000, 150, 700, 150, 250, 150, true);
        footballMatch(1000, 250, 500, 150, 250, 150, false);

        System.out.println(" ---- ");
        System.out.println(" ---- ");
        System.out.println(" ---- ");

        vacation(2000, 450, 700, 150, 250, 150, false);
        vacation(10000, 350, 1100, 350, 450, 350, false);
        vacation(3000, 150, 700, 150, 250, 150, false);
        vacation(1000000, 150, 700, 150, 250, 150, true);
        vacation(1000, 250, 500, 150, 250, 150, false);


    }
    public static void footballMatch (int salary, int bills, int rent,
                                      int commuting, int food, int clothing,
                                      boolean inDebt) {
        double savings = salary*0.1;
        double spareMoney = (salary - savings - bills - rent - commuting - food - clothing);

        if ((inDebt) || (spareMoney < 0)) {
            System.out.println("You are in debt and pay it off first!");
        } else if ((spareMoney <= 100) && (spareMoney >50)) {
            System.out.println("You can watch just one football game");
        } else if ((spareMoney < 50) && (spareMoney >= 0)) {
            System.out.println("Your total spare money is less than 50. Stay home.");
        }else {
            System.out.println("You can watch more than one football game.");

        }

    }

    public static void vacation (int salary, int bills, int rent,
                                 int commuting, int food, int clothing,
                                 boolean inDebt) {

        double savings = salary*0.1;
        double spareMoney = (salary - savings - bills - rent - commuting - food - clothing);

        if (inDebt) {
            System.out.println("You are in debt and pay it off first!");
        } else if (spareMoney < 300) {
            System.out.println("Your total money is less than 300. You can not go vacation");
        } else if ((spareMoney >= 300) && (spareMoney < 1000)) {
            System.out.println("Your spare money is enough to go Europa!");
        } else {
            System.out.println("you can go anywhere you want");
        }


    }


}

