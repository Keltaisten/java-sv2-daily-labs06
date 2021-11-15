package day01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PositiveNumberContainer pos = new PositiveNumberContainer();
        Scanner scanner = new Scanner(System.in);
        boolean bool = true;
        double number;
        while(bool){
            System.out.println("Kérem adjon meg egy számot");
            number  = scanner.nextDouble();
            if(number > 0){
                pos.addNumbersToList(number);
            }else{
                bool = false;
            }
        }
        System.out.println(pos.getPositiveNumberList());
    }
}
