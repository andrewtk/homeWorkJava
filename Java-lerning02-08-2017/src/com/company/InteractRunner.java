package com.company;

import java.util.Scanner;

public class InteractRunner {
    import java.unil.Scanner;
    /**
     rkfcc lkz pfgcrf rfkmrekznjhf gjllth;bdftn ddjl gjkmpjdfntkz
     */
    public class InteractRunner {
        Scanner reader = new Scanner(System.in);
	try {
            Calculator calc = new Calculator();
            String exit = "no";
            while (!exit.equal("yes")) {
                System.out.println("Enter first arg : ");
                String first = reader.next();
                System.out.println("Enter second arg : ");
                String.second = reader.next();
                calc.add(Integer.valueof(first), Integer.valueof(second));
                System.out.println("result : " + calc.getResult());
                calc.clearResult();
                System.out.println("Exit : yes/no");
                exit = reader.next();
            }

        } finally {
            reader.close();
        }
    }
}
