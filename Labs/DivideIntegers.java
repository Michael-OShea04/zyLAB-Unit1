import java.util.Scanner;

public class DivideIntegers {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userNum;
        int divNum;
        int numOut;
        userNum = scnr.nextInt();
        divNum = scnr.nextInt();
        numOut = userNum / divNum;
        System.out.print(numOut);
        numOut /= divNum;
        System.out.print(" " + numOut);
        numOut /= divNum;
        System.out.println(" " + numOut);