package SPiven;

import java.util.Scanner;

public class Declaration {


    public static void declaration(Envelope envelope1,Envelope envelope2) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the Envolore1 value height");
        envelope1.setHeight(scanner.nextDouble());

        System.out.println("Enter the Envolore1 value width");
        envelope1.setWidth(scanner.nextDouble());

        System.out.println("Enter the Envolore2 value height");
        envelope2.setHeight(scanner.nextDouble());

        System.out.println("Enter the Envolore2 value width");
        envelope2.setWidth(scanner.nextDouble());
    }
}