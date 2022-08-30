import java.util.Scanner;

public class Erdogan {
    public Erdogan() {
        helloWorld();
        sayialRun();
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
}
