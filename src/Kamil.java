import java.util.Scanner;
public class Kamil {
    //constructer
    public Kamil() {
        //helloWorld();
        //loop2();
       //endoffile();
    }
    private void loop2(){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        if(t>=0&&t<=500){
            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                if(a>=0&&a<=50&&b>=0&&b<=50&&n>=1&&n<=15){
                    for(int j=0;j<=n-1;j++){
                        int result=0;
                        int power=0;
                        for(int k=0;k<=j;k++){
                            power=(k==0)?1:power*2;
                            result=result+(power*b);
                        }
                        result=result+a;
                        System.out.print(result+ " ");
                    }
                    System.out.println("");
                }
            }
        }
        in.close();
    }
private void endoffile(){
    Scanner scan=new Scanner(System.in);
    int i=1;
    do {
        String st=scan.nextLine();
        System.out.println(i+" "+st);
        i++;
    }
    while (scan.hasNext());
    scan.close();
}
    private void helloWorld() {
        System.out.println("Hello Kamil");
    }
}
