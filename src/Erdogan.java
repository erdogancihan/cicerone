import java.util.Scanner;

public class Erdogan {
    public Erdogan() {
        //helloWorld();
        // sayialRun();
        learnIO();
    }

    private void helloWorld() {
        System.out.println("Hello World Erdogan");
    }

    private void sayial() {
        System.out.println("1 ile 100 arasinda bir sayi girin.");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        try {
            int i = Integer.parseInt(s);
            if (i >= 1 && i <= 100) {
                if (i % 2 == 1) {
                    System.out.println("weird");
                } else {
                    if (i >= 2 && i <= 5) {
                        System.out.println("not weird");
                    } else if (i >= 6 && i <= 20) {
                        System.out.println("weird");
                    } else if (i > 20) {
                        System.out.println("not weird");
                    }
                }
            } else {
                System.out.println("1 ile 100 arasinda bir sayi girin!");
            }
        } catch (Exception e) {
            System.out.println("Lütfen bir sayi girin!");
        }
    }

    private void sayialRun() {
        while (true) {
            sayial();
        }
    }

    private void learnIO() {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        //When I scan direct double input its size is very limited. Parsing is the right solution.
        String sd = scan.next();
        double d = 0; // I need to initialize the variable.
        try {
            d = Double.parseDouble(sd);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        String s = scan.nextLine(); //without nextLine() it does not recognise space chars at the beginning.
//checks if there are chars after space chars.Without these check it saves the string value until the first space char.
        if (scan.hasNext()) {
            s = s + scan.nextLine();
        }
        scan.close();
        // Write your code here.
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

}
