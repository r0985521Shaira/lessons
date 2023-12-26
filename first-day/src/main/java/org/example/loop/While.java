package org.example.loop;

public class While {
    public static void main(String[] args) {
        int teller = 0;

        while (teller <= 3) {
            System.out.println("the current teller is " + teller);
            teller++;
        }

        System.out.println("-----------------------------------");

        for (int i = 0; i <= 3; i++) {
            System.out.println("the current teller is " + i);
        }
    }
}
