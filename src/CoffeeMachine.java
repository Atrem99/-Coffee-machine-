import java.util.Scanner;

class CoffeeMachine {
    static int numberWater = 400;
    static int numberMilk = 540;
    static int numberCoffeeBeans = 120;
    static int numberDisposableCups = 9;
    static int numberMoney = 550;
    static boolean flag = true;

    public static void main(String[] args) {

        String str;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            str = scanner.nextLine();
            switch (str) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    remaining();
                    break;
                case "exit":
                    exit();
            }
        }
    }

    public static void buy(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");


        String num = scanner1.nextLine();
        if ("back".equals(num)) {
            return;
        }

        switch (Integer.parseInt(num)){
            case 1:
                if(numberWater > 250 && numberDisposableCups > 1 && numberCoffeeBeans > 16){
                    numberWater -= 250;
                    numberDisposableCups -= 1;
                    numberCoffeeBeans -= 16;
                    numberMoney += 4;
                    System.out.println("I have enough resources, making you a coffee!");
                }else if (numberWater < 250) {
                    System.out.println("Sorry, not enough water!");
                }else if (numberDisposableCups < 1) {
                    System.out.println("Sorry, not enough disposableCups");
                }else if (numberCoffeeBeans < 16){
                    System.out.println("Sorry, not enough coffeeBeans");
                }
                break;

            case 2:
                if(numberWater > 350 && numberMilk > 75 && numberDisposableCups > 1 && numberCoffeeBeans > 20){
                    numberWater -= 350;
                    numberMilk -= 75;
                    numberDisposableCups -= 1;
                    numberCoffeeBeans -= 20;
                    numberMoney += 7;
                    System.out.println("I have enough resources, making you a coffee!");
                }else if(numberWater < 350) {
                    System.out.println("Sorry, not enough water!");
                }else if(numberMilk < 75) {
                    System.out.println("Sorry, not enough milk!");
                }else if(numberDisposableCups < 1) {
                    System.out.println("Sorry, not enough disposableCups!");
                }else if(numberCoffeeBeans < 20) {
                    System.out.println("Sorry, not enough coffeeBeans!");
                }
                break;

            case 3:
                if(numberWater > 200 && numberMilk > 100 && numberDisposableCups > 1 && numberCoffeeBeans > 12){
                    numberWater -= 200;
                    numberMilk -= 100;
                    numberDisposableCups -= 1;
                    numberCoffeeBeans -= 12;
                    numberMoney += 6;
                    System.out.println("I have enough resources, making you a coffee!");
                }else if (numberWater < 200) {
                    System.out.println("Sorry, not enough water!");
                }else if (numberMilk < 100) {
                    System.out.println("Sorry, not enough milk!");
                }else if (numberDisposableCups < 1){
                    System.out.println("Sorry, not enough disposableCups!");
                }else if (numberCoffeeBeans < 12){
                    System.out.println("Sorry, not enough coffeeBeans!");
                }
                break;
        }
    }

    public static void fill(){
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add: ");

        int moreWater = scanner2.nextInt();
        numberWater += moreWater;
        System.out.println("Write how many ml of milk you want to add: ");

        int moreMilk = scanner2.nextInt();
        numberMilk += moreMilk;
        System.out.println("Write how many grams of coffee beans you want to add: ");

        int moreCoffeeBeans = scanner2.nextInt();
        numberCoffeeBeans += moreCoffeeBeans;
        System.out.println("Write how many disposable cups of coffee you want to add: ");

        int mareDisposableCups = scanner2.nextInt();
        numberDisposableCups += mareDisposableCups;
    }

    public static void take(){
        System.out.printf("I gave you $%d %n", numberMoney);
        numberMoney -= numberMoney;
    }

    public static void remaining() {
        System.out.println("The coffee machine has:");
        System.out.printf("%d ml of water %n", numberWater);
        System.out.printf("%d ml of milk %n", numberMilk);
        System.out.printf("%d g of coffee beans %n", numberCoffeeBeans);
        System.out.printf("%d disposable cups%n %n", numberDisposableCups);
        System.out.printf("%d of money %n", numberMoney);
    }

    public static void exit() {
        flag = false;
    }
}
