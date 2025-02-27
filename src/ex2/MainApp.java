package ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner=new Scanner(new File("src/ex2/in.txt"));

        int min=10000, max=0, count=0;
        int x;
        float medie=0, suma=0;
        PrintStream flux=new PrintStream("src/ex2/out.txt");
        while(scanner.hasNext()){
            x= scanner.nextInt();
            flux.println(x);
            if(x<min){
                min=x;
            }
            if(x>max){
                max=x;
            }
            suma=suma+x;
            count++;
        }

        medie=suma/count;
        System.out.println("max: "+ max);
        System.out.println("min: " + min);
        System.out.println("suma: "+ suma);
        System.out.println("medie: "+ medie);
    }
}
