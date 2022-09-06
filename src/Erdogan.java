import javax.naming.InterruptedNamingException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Erdogan {
    public Erdogan() throws IOException {
        // helloWorld();
        // sayialRun();
        // learnIO();
        // formatOutput();
        // loopJob();
        // loopJob2();
        // dataTypes();
        eof();
        // intToString();
        //getWeekDay(8, 5, 2015);
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

    private void loopJob2() {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        if (t >= 0 && t <= 500) {
            for (int i = 0; i < t; i++) {
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                for (int j = 0; j <= n - 1; j++) {
                    int result = 0;
                    int power = 0;
                    for (int k = 0; k <= j; k++) {
                        power = (k == 0) ? 1 : power * 2;
                        result = result + (b * power);
                    }
                    result = result + a;
                    System.out.print(result + " ");
                }
                System.out.println("");

            }
        }
    }

    private void dataTypes() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long x;

            try {
                x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -Math.pow(2, 7) && x <= Math.pow(2, 7) - 1) {
                    System.out.println("* byte");
                }
                if (x >= -Math.pow(2, 15) && x <= Math.pow(2, 15) - 1) {
                    System.out.println("* short");
                }
                if (x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1) {
                    System.out.println("* int");
                }
                if (x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere");
            }
            t--;
        }
    }

    private void eof() throws IOException {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        do {
            String s = sc.nextLine();
            System.out.println(i + " " + s);
            i++;
        } while (sc.hasNext());
        sc.close();
    }

    private void intToString() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if (n >= -100 && n <= 100) {

            String s = String.valueOf(n);
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }

    private void getWeekDay(int month, int day, int year) {
        //05.08.2015 Wednesday
        if (year > 2000 && year < 3000) {
            Calendar calendar = Calendar.getInstance();
            Locale locale = Locale.getDefault();

            calendar.set(year, month, day);

            String dayName = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, locale);

            dayName = dayName.toUpperCase();

            System.out.println(dayName);
            //System.out.println(calendar.toString());
        }

    }
}

