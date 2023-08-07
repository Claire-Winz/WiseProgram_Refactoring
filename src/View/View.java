package View;

import java.util.Scanner;

public class View {

    private static View instance;

    private View() {

    }

    public static View getInstance() {
        if (instance == null) {
            instance = new View();
        }
        return instance;
    }

    Scanner sc = new Scanner(System.in);

    public String stringInput() {
        return  sc.nextLine();
    }

    public int intInput() {
        return sc.nextInt();
    }

    public void printOut(String out) {
        System.out.print(out);
   }

    public void printlnOut(String out) {
       System.out.println(out);
    }
}
