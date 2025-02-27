package ex1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int lung, latim;
        System.out.print("lungime: ");
        lung= scanner.nextInt();
        System.out.println("latime: ");
        latim= scanner.nextInt();

        int perim=(2*lung)+(2*latim);
        int arie=lung*latim;

        System.out.println("perimetru: " + perim);
        System.out.println("arie: " + arie);

    }

}
