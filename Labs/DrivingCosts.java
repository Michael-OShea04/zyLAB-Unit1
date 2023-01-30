import java.util.Scanner;

public class DrivingCosts {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double milesPerGallon;
        double dollarsPerGallon;
        double miles;
        double gallon;
        double price;
        milesPerGallon = scnr.nextDouble();
        dollarsPerGallon = scnr.nextDouble();

        miles = 20.0;
        gallon = miles / milesPerGallon;
        price = gallon * dollarsPerGallon;
        System.out.printf("%.2f", price);
        miles = 75.0;
        gallon = miles / milesPerGallon;
        price = gallon * dollarsPerGallon;
        System.out.printf(" %.2f", price);
        miles = 500.0;
        gallon = miles / milesPerGallon;
        price = gallon * dollarsPerGallon;
        System.out.printf(" %.2f\n", price);