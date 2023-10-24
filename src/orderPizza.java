import java.util.Scanner;

public class orderPizza {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean hasOrder;
        boolean hasTopping;

        int pizzaPrice = 0;
        int toppingPrice = 0;
        int totalprice = 0;

        String selectedPizza = "None";
        String selectedToppings = "None";

        String[] PIZZANAME = {
                "calzone traditional",
                "pizza anders and",
                "vegetariana",
                "pizza roma",
                "pizza napoli",
                "pizza jamaica",
                "pizza pepperoni",
                "pizza prosciutto",
                "pizza kebab",
                "pizza meat lover"
        };

        String[] TOPPINGS = {
                "cheese",
                "mushroom",
                "onion",
                "bacon",
                "garlic",
                "chilli"
        };

        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";

        System.out.printf("%s%-30S%s%n", RED, "welcome to tommies pizzas!", RESET);
        System.out.printf("%s%-30S%s%n", YELLOW, "to order input your desired pizza number, then follow the onscreen instructions.", RESET);

        do {
            hasOrder = false;

            System.out.printf("%-3S%-25S%s%21S%n", "no", "- pizza name", "-", "price");
            System.out.printf("%s", GREEN);
            System.out.printf("%-3S%-25S%s%20s%n", "1", "- " + PIZZANAME[0], "-", "80,-");
            System.out.printf("%-3S%-25S%s%20s%n", "2", "- " + PIZZANAME[1], "-", "80,-");
            System.out.printf("%-3S%-25S%s%20s%n", "3", "- " + PIZZANAME[2], "-", "80,-");
            System.out.printf("%-3S%-25S%s%20s%n", "4", "- " + PIZZANAME[3], "-", "80,-");
            System.out.printf("%-3S%-25S%s%20s%n", "5", "- " + PIZZANAME[4], "-", "80,-");
            System.out.printf("%-3S%-25S%s%20s%n", "6", "- " + PIZZANAME[5], "-", "80,-");
            System.out.printf("%-3S%-25S%s%20s%n", "7", "- " + PIZZANAME[6], "-", "80,-");
            System.out.printf("%-3S%-25S%s%20s%n", "8", "- " + PIZZANAME[7], "-", "80,-");
            System.out.printf("%-3S%-25S%s%20s%n", "9", "- " + PIZZANAME[8], "-", "80,-");
            System.out.printf("%-3S%-25S%s%20s%n", "10", "- " + PIZZANAME[9], "-", "80,-");

            System.out.printf("%s%S%n%n", YELLOW, "prices shown are for a regular size pizza.");
            System.out.printf("%s", RESET);

            System.out.printf("%S%n", "Input number of desired pizza");
            int number = inPutInteger(input);

            while (number > 10 || number < 1) {
                System.out.printf("%s%S%n", RED, "Please input a number between 1-10");
                System.out.printf(RESET);
                number = inPutInteger(input);
            }

            switch (number) {
                case 1:
                    pizzaPrice = 80;
                    selectedPizza = "No 1 - " + PIZZANAME[0];
                    hasOrder = true;
                    break;
                case 2:
                    pizzaPrice = 80;
                    selectedPizza = "No 2 - " + PIZZANAME[1];
                    hasOrder = true;
                    break;
                case 3:
                    pizzaPrice = 80;
                    selectedPizza = "No 3 - " + PIZZANAME[2];
                    hasOrder = true;
                    break;
                case 4:
                    pizzaPrice = 80;
                    selectedPizza = "No 4 - " + PIZZANAME[3];
                    hasOrder = true;
                    break;
                case 5:
                    pizzaPrice = 80;
                    selectedPizza = "No 5 - " + PIZZANAME[4];
                    hasOrder = true;
                    break;
                case 6:
                    pizzaPrice = 80;
                    selectedPizza = "No 6 - " + PIZZANAME[5];
                    hasOrder = true;
                    break;
                case 7:
                    pizzaPrice = 80;
                    selectedPizza = "No 7 - " + PIZZANAME[6];
                    hasOrder = true;
                    break;
                case 8:
                    pizzaPrice = 80;
                    selectedPizza = "No 8 - " + PIZZANAME[7];
                    hasOrder = true;
                    break;
                case 9:
                    pizzaPrice = 80;
                    selectedPizza = "No 9 - " + PIZZANAME[8];
                    hasOrder = true;
                    break;
                case 10:
                    pizzaPrice = 80;
                    selectedPizza = "No 10 - " + PIZZANAME[9];
                    hasOrder = true;
                    break;
            }
        } while (!hasOrder);

        do {
            hasTopping = false;

            System.out.printf("%s%S%n%S%s%n", YELLOW, "want additional toppings for your pizza?", "select from the following list:", RESET);
            System.out.printf("%-3S%-25S%s%21S%n", "no", "- topping", "-", "price");
            System.out.printf("%s", GREEN);
            System.out.printf("%-3S%-25S%s%20s%n", "1", "-" + TOPPINGS[0], "-", "10,-");
            System.out.printf("%-3S%-25S%s%20s%n", "2", "-" + TOPPINGS[1], "-", "10,-");
            System.out.printf("%-3S%-25S%s%20s%n", "3", "-" + TOPPINGS[2], "-", "10,-");
            System.out.printf("%-3S%-25S%s%20s%n", "4", "-" + TOPPINGS[3], "-", "10,-");
            System.out.printf("%-3S%-25S%s%20s%n", "5", "-" + TOPPINGS[4], "-", "5,-");
            System.out.printf("%-3S%-25S%s%20s%n", "5", "-" + TOPPINGS[5], "-", "5,-");
            System.out.printf("%s%n", RESET);
            int number = inPutInteger(input);

            while (number > 2 || number < 1) {
                System.out.printf("%s%S%n", RED, "Please input a number between 1-10");
                System.out.printf(RESET);
                number = inPutInteger(input);
            }

            switch (number) {
                case 1:
                    pizzaPrice = 80;
                    selectedPizza = "No 1 - " + PIZZANAME[0];
                    hasOrder = true;
                    break;
                case 2:
                    pizzaPrice = 80;
                    selectedPizza = "No 2 - " + PIZZANAME[1];
                    hasOrder = true;
                    break;
            }
        } while (!hasTopping);


            System.out.printf("%S%n", selectedPizza);
            System.out.printf("%S%s%n", "current price: ", pizzaPrice);
    }
    /**
     *Find ud af om brugeren indtaster en interger.
     * @param input
     * @return number
     */
    public static int inPutInteger (Scanner input){
        String RED = "\u001B[31m";
        String RESET = "\u001B[0m";
        while (!input.hasNextInt()) {
            System.out.printf("%s%S%s", RED, "Invalid input. Please enter a number.", RESET);
            input.next();
        }
        int number = input.nextInt();
        input.nextLine();
        return number;
    }
}

       /*
        System.out.printf("%s%S%n%S%s%n", YELLOW, "want additional toppings for your pizza?", "select from the following list:", RESET);
        System.out.printf("%-3S%-25S%s%21S%n", "no", "- topping", "-", "price");
        System.out.printf("%s", GREEN);
        System.out.printf("%-3S%-25S%s%20s%n", "1", "- cheese", "-", "10,-");
        System.out.printf("%-3S%-25S%s%20s%n", "2", "- mushroom", "-", "10,-");
        System.out.printf("%-3S%-25S%s%20s%n", "3", "- onion", "-", "10,-");
        System.out.printf("%-3S%-25S%s%20s%n", "4", "- bacon", "-", "10,-");
        System.out.printf("%-3S%-25S%s%20s%n", "5", "- garlic", "-", "5,-");
        System.out.printf("%-3S%-25S%s%20s%n", "5", "- chilli", "-", "5,-");
        System.out.printf("%s%n", RESET);

        System.out.printf("%S%n%S%s%n", "the size of your pizza will reflect the price", "if you wish to change the size select from the following:", RESET);
        System.out.printf("%-3S%-25S%s%32S%n", "no", "- size", "-", "+/- regular price");
        System.out.printf("%s", GREEN);
        System.out.printf("%-3S%-25S%s%20s%n", "1", "- familie", "-", "+ 50%");
        System.out.printf("%-3S%-25S%s%20s%n", "2", "- child", "-", "- 10%");
        System.out.printf("%s%n", RESET);
        */


// int number1 = inPutInteger(input, "Enter the first number: ");