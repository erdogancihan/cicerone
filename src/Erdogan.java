import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Erdogan {
    public Erdogan() throws IOException {
        // helloWorld();
        // sayialRun();
        // learnIO();
        // formatOutput();

        loopJob();

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
        System.out.println("Int " + i);
    }

    private void formatOutput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================");

        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();

            while (s1.length() < 15) {
                s1 = s1 + " ";
            }
            System.out.print(s1);
            String xs;
            xs = x < 10 ? "00" + x : (x < 100 ? "0" + x : "" + x);
            System.out.println(xs);
        }
        System.out.println("=================");
    }

    private void loopJob() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
        if (N <= 20 || N >= 2) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(N + " x " + i + " = " + N * i);
            }
        }
    }
}
