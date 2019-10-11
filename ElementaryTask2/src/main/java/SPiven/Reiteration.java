package SPiven;

import java.util.Scanner;

public class Reiteration {
    Check check = new Check();

    public static void replay(Envelope envelope1,Envelope envelope2) {

        String selection = "Y";
        while (selection.equals("Y") || selection.equals("y") || selection.equals("YES") || selection.equals("yes")) {
            Check.check(envelope1,envelope2);
            System.out.println("\nDo you want continue? ");
            Scanner scanner = new Scanner(System.in);
            selection = scanner.nextLine();

        }
    }
}