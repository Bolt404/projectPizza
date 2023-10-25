import java.util.Scanner;

public class orderPizza {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean hasPizzaOrder;
        boolean hasTopping;
        boolean hasSize;

        int pizzaPrice = 0;
        int toppingPrice = 0;
        double totalprice = 0;
        double sizePrice = 0;

        String selectedPizza = "None";
        String selectedTopping = "None";
        String selectedSize = "None";

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

        String[] PIZZASIZE = {
                "familie",
                "regular",
                "kids"
        };

        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";

        System.out.printf("%s%-30S%s%n", RED, "welcome to tommies pizzas!", RESET);
        System.out.printf("%s%-30S%s%n", YELLOW, "to order input your desired pizza number, then follow the onscreen instructions.", RESET);

        // loop til at finde bestilt Pizza
        do {
            hasPizzaOrder = false;

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
                    hasPizzaOrder = true;
                    break;
                case 2:
                    pizzaPrice = 80;
                    selectedPizza = "No 2 - " + PIZZANAME[1];
                    hasPizzaOrder = true;
                    break;
                case 3:
                    pizzaPrice = 80;
                    selectedPizza = "No 3 - " + PIZZANAME[2];
                    hasPizzaOrder = true;
                    break;
                case 4:
                    pizzaPrice = 80;
                    selectedPizza = "No 4 - " + PIZZANAME[3];
                    hasPizzaOrder = true;
                    break;
                case 5:
                    pizzaPrice = 80;
                    selectedPizza = "No 5 - " + PIZZANAME[4];
                    hasPizzaOrder = true;
                    break;
                case 6:
                    pizzaPrice = 80;
                    selectedPizza = "No 6 - " + PIZZANAME[5];
                    hasPizzaOrder = true;
                    break;
                case 7:
                    pizzaPrice = 80;
                    selectedPizza = "No 7 - " + PIZZANAME[6];
                    hasPizzaOrder = true;
                    break;
                case 8:
                    pizzaPrice = 80;
                    selectedPizza = "No 8 - " + PIZZANAME[7];
                    hasPizzaOrder = true;
                    break;
                case 9:
                    pizzaPrice = 80;
                    selectedPizza = "No 9 - " + PIZZANAME[8];
                    hasPizzaOrder = true;
                    break;
                case 10:
                    pizzaPrice = 80;
                    selectedPizza = "No 10 - " + PIZZANAME[9];
                    hasPizzaOrder = true;
                    break;
            }
        } while (!hasPizzaOrder);

        totalprice += pizzaPrice;

        //Loop til Toppings.... Mangler - Gem til array? For at vide navn på toppings?
        do {
            totalprice += toppingPrice;
            hasTopping = false;

            System.out.printf("%s%S%n%S%s%n", YELLOW, "want additional toppings for your pizza?", "select from the following list:", RESET);
            System.out.printf("%-3S%-25S%s%21S%n", "no", "- topping", "-", "price");
            System.out.printf("%s", GREEN);
            System.out.printf("%-3S%-25S%s%20s%n", "1", "-" + TOPPINGS[0], "-", "10,-");
            System.out.printf("%-3S%-25S%s%20s%n", "2", "-" + TOPPINGS[1], "-", "10,-");
            System.out.printf("%-3S%-25S%s%20s%n", "3", "-" + TOPPINGS[2], "-", "10,-");
            System.out.printf("%-3S%-25S%s%20s%n", "4", "-" + TOPPINGS[3], "-", "10,-");
            System.out.printf("%-3S%-25S%s%20s%n", "5", "-" + TOPPINGS[4], "-", "5,-");
            System.out.printf("%-3S%-25S%s%20s%n", "6", "-" + TOPPINGS[5], "-", "5,-");
            System.out.printf("%s%n", RESET);

            System.out.printf("%S%n", "Input number of desired topping. or press 0 to continue");
            int number = inPutInteger(input);

            while (number > 6 || number < 0) {
                System.out.printf("%s%S%n%S%n", RED, "Please input a number between 1-10", "or press 0 to continue.");
                System.out.printf(RESET);
                number = inPutInteger(input);
            }

            switch (number) {
                case 1:
                    toppingPrice = 10;
                    selectedTopping = TOPPINGS[0];
                    break;
                case 2:
                    toppingPrice = 10;
                    selectedTopping = TOPPINGS[1];
                    break;
                case 3:
                    toppingPrice = 10;
                    selectedTopping = TOPPINGS[2];
                    break;
                case 4:
                    toppingPrice = 10;
                    selectedTopping = TOPPINGS[3];
                    break;
                case 5:
                    toppingPrice = 5;
                    selectedTopping = TOPPINGS[4];
                    break;
                case 6:
                    toppingPrice = 5;
                    selectedTopping = TOPPINGS[5];
                    break;
                default:
                    hasTopping = true;
            }
        } while (!hasTopping);

        //Loop til size.
        do{
            hasSize = false;

            System.out.printf("%S%n%S%s%n", "the size of your pizza will reflect the price", "if you wish to change the size select from the following:", RESET);
            System.out.printf("%-3S%-25S%s%32S%n", "no", "- size", "-", "+/- regular price");
            System.out.printf("%s", GREEN);
            System.out.printf("%-3S%-25S%s%20s%n", "1", "- familie", "-", "+ 50%");
            System.out.printf("%-3S%-25S%s%20s%n", "2", "- regular", "-", "   0%");
            System.out.printf("%-3S%-25S%s%20s%n", "3", "- child", "-", "- 10%");
            System.out.printf("%s%n", RESET);

            int number = inPutInteger(input);

            while (number > 6 || number < 0) {
                System.out.printf("%s%S%n", RED, "Please input a number between 1-3");
                System.out.printf(RESET);
                number = inPutInteger(input);
            }

            switch (number) {
                case 1:
                    hasSize = true;
                    sizePrice = 1.5;
                    selectedSize = PIZZASIZE[0];
                    break;
                case 2:
                    hasSize = true;
                    selectedSize = PIZZASIZE[1];
                    break;
                case 3:
                    hasSize = true;
                    sizePrice = 0.75;
                    selectedSize = PIZZASIZE[2];
                    break;
            }

            totalprice = totalprice*sizePrice;

        } while (!hasSize);



        System.out.printf("%S%n", selectedSize);
        System.out.printf("%S%n", selectedTopping);
        System.out.printf("%S%n", selectedPizza);
        System.out.printf("%S%s%n", "current price: ", totalprice);
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
// int number1 = inPutInteger(input, "Enter the first number: ");