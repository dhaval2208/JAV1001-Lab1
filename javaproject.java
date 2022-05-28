
// Student id :- #A00255187
// Student Name :- Bhimani Dhavalkumar Zaverbhai
// JAV-1001 - 50733 - App Development for Android - 202205 - 001




import java.util.Scanner;

public class javaproject {
    private static final String ENTER_THE_VALID_OPTION = "enter the valid option";

    public static void main(String[] args) {
        System.out.println("whould you like to convert different forms select one number and enter value:");

        System.out.println("1. Kilometer to Mile"); // Convert to Kilometer to Mile
        System.out.println("2. Mile to Kilometer"); // Convert to Mile to Kilometer
        System.out.println("3. Centimeter to Inch"); // Convert to Centimeter to Inch
        System.out.println("4. Inch to Centimeter"); // Convert to Inch to Centimeter
        System.out.println("5. Gram to Ounce"); // Convert to Gram to Ounce
        System.out.println("6. Ounce. to Gram"); // Convert to Ounce. to Gram
        System.out.println("7. Celsius to Fahrenheit"); // Convert to Celsius to Fahrenheit
        System.out.println("8. Celsius to Kelvin"); // Convert to Celsius to Kelvin
        System.out.println("9. Fahrenheit to Celsius"); // Convert to Fahrenheit to Celsius
        System.out.println("10. Fahrenheit to Kelvin"); // Convert to Fahrenheit to Kelvin
        System.out.println("11. Liter to CUPS"); // Convert to Liter to CUPS
        System.out.println("12. CUPS to Liter"); // Convert to CUPS to Liter
        System.out.println("13. Kilogram to Pound"); // Convert to Kilogram to Pound
        System.out.println("14. Pound to Kilogram"); // Convert to Pound to Kilogram

        Scanner number = new Scanner(System.in); // User input a preffered option
        System.out.print("Please enter preffered option  =  ");
        int option = number.nextInt();

        if (option > 14) {
            System.out.println(ENTER_THE_VALID_OPTION);
        } else {

            Scanner value = new Scanner(System.in); // User input a value to convert
            System.out.print("Please enter a value =  ");
            double Convertvalue = value.nextDouble();

            switch (option) {
                case 1:
                    System.out.print(Convertvalue + " kilometer is equle to " + Convertvalue / 1.609 + " mile");
                    break;

                case 2:
                    System.out.print(Convertvalue + " mile is equle to " + Convertvalue * 1.609 + " kilometer");
                    break;

                case 3:
                    System.out.print(Convertvalue + " centimeter is equle to " + Convertvalue / 2.54 + " inches");
                    break;

                case 4:
                    System.out.print(Convertvalue + " inches is equle to " + Convertvalue * 2.54 + " centimeter");
                    break;

                case 5:
                    System.out.print(Convertvalue + " Gram is equle to " + Convertvalue / 28.35 + " Ounce");
                    break;

                case 6:
                    System.out.print(Convertvalue + " Ounce is equle to " + Convertvalue * 28.35 + " Gram");
                    break;

                case 7:
                    System.out.print(
                            Convertvalue + " Celsius is equle to " + ((Convertvalue * 9 / 5) + 32) + " Fahreheit");
                    break;

                case 8:
                    System.out.print(Convertvalue + " Celsius is equle to " + (Convertvalue + 273.15) + " Kelvin");
                    break;

                case 9:
                    System.out.print(
                            Convertvalue + " Fahreheit is equle to " + ((Convertvalue - 32) * 5 / 9) + " Celsius");
                    break;

                case 10:
                    System.out.print(Convertvalue + " Fahreheit is equle to " + ((Convertvalue - 32) * 5 / 9 + 273.15)
                            + " Kelvin");
                    break;

                case 11:
                    System.out.print(Convertvalue + " Liter is equle to " + Convertvalue * 4.227 + " Cups");
                    break;

                case 12:
                    System.out.print(Convertvalue + " Cups is equle to " + Convertvalue / 4.227 + " Liter");
                    break;

                case 13:
                    System.out.print(Convertvalue + " Kilogram  is equle to " + Convertvalue * 2.205 + " Pound");
                    break;

                case 14:
                    System.out.print(Convertvalue + " Pound is equle to " + Convertvalue / 2.205 + " Kilogram");
                    break;

            }
        }

    }
}


