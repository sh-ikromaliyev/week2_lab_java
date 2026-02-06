import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        // Problem 1
        Scanner input = new Scanner(System.in);
//        System.out.print("cappuccinos: ");
//        int cap = input.nextInt();
//        System.out.print("muffins: ");
//        int muf = input.nextInt();
//        double total_p = cap * 4.50 + muf * 3.0;
//        total_p = total_p + total_p * 0.08;
//        total_p += 5;
//        System.out.printf("%.2f", total_p);

        // Problem 2
//        double dis = input.nextDouble();
//        double consume = 8.5;
//        double price = 12500;
//        double f_need = dis / 100 * 8.5;
//        double pay = price * f_need;
//        System.out.printf("Distance: %.0f%nFuel Needed: %.2f%nTotal Cost: %,.0f",dis,f_need,pay);

        // Problem 3
//        int seconds = input.nextInt();
//        int hours = seconds / 3600;
//        seconds -= hours * 3600;
//        int minuts = seconds / 60;
//        seconds -= minuts * 60;
//        System.out.printf("%d hours, %d minutes, %d seconds",hours,minuts,seconds);


        // Problem 4
//        int age = input.nextInt();
//        if (age > 0 && age <=12){
//            System.out.print("7$");
//        }
//        if (age >=13 && age <=17){
//            System.out.print("10$");
//        }
//        if(age >= 18 && age <= 64){
//            System.out.print("15$");
//        }
//        if (age >= 65){
//            System.out.print("10$");
//        }
        // Problem 5

//        int year = input.nextInt();
//        boolean leap = false;
//        if ((year % 4 ==0 && year % 100 != 0) || (year % 400 == 0)){
//            System.out.print("Leap year");
//
//        } else {
//            System.out.print("Not leap year");
//        }
        // Problem 6
//        double kg = input.nextDouble();
//        double cost = 0;
//        if (kg <= 2){
//            cost = 5;
//        }
//        if (kg > 2 && kg <=10){
//            cost = 10;
//        }
//        if (kg > 10){
//            cost = 10 + (kg - 10) * 2;
//        }
//        System.out.print("Cost is " + cost);

        //Problem 7

//        String spin = "0011";
//        boolean locked = false;
//        for(int i = 0; i < 3; i++){
//            System.out.print("Enter the pin: ");
//            String pin = input.nextLine();
//            if (pin.equals(spin)){
//                System.out.println("Access Granted");
//                locked = true;
//                break;
//            } else {
//                System.out.println("Incorrect!");
//            }
//        }
//        if(!locked){
//            System.out.println("Locked!");
//        }

        // Problem 8
//        int population = input.nextInt();
//        double pl = population;
//        int years = 0;
//        while(2 * population >= pl){
//            pl = pl + pl * 0.05;
//            years ++;
//        }
//        System.out.println("It takes " + years + " years");

        // Problem 9
//        for (int i = 1; i < 51; i++){
//            if (i % 3 == 0 && i % 5 == 0){
//                System.out.print("FizzBuzz ");
//            } else if (i % 3 == 0) {
//                System.out.print("Fizz ");
//            } else if (i % 5 == 0){
//                System.out.print("Buzz ");
//            }
//            else {
//                System.out.print(i + " ");
//            }
//        }

        // Problem 10

//        double deposit = input.nextDouble();
//        int y = input.nextInt();
//        for(int i = 1; i < y +1; i++){
//            System.out.println(i +" year: " + (deposit + deposit * 0.05));
//            deposit += deposit * 0.05;
//        }

        input.close();
    }
}