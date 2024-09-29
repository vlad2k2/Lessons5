package app;

import java.util.Scanner;

public class Homework5Program {

    static double userInCome; // the change is entered by the user

    // сума за шкалою оподаткування
    static int minSum = 10000;
    static int avgSum = 25000;

    static double minRate = 2.5 / 100; // ставкою 2,5%
    static  double avgRate = 4.3 / 100; // ставкою 4,3%
    static double maxRate = 6.7 / 100;  //  ставкою 6,7%

    static double calculation;


    static public void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть Ваш дохід:");
        userInCome = scanner.nextDouble();

        if (userInCome <= minSum) {
            calculation = userInCome * minRate;
        } else if (userInCome <= avgSum) {
            calculation = userInCome * avgRate;
        } else {
            calculation = userInCome * maxRate;
        }

        System.out.printf("Сума податку для доходу %.2f складає: %.2f%n", userInCome, calculation);


    }



}
