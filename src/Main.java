public class Main {
    public static void main(String[] args) {
        Erdogan er=new Erdogan();
        System.out.println("selam dünya");
        int result=(12<10)? 1:0;
        System.out.println(result);
        System.out.println("sonuc yazdirildi");
        System.out.println("github deneme");
        System.out.println("denememeeeee123");
        er.newFunction("Ben erdogan");
        Erdogan.newFunction1("erdogan cihan statik");
        System.out.println(er.newFunctionwithStringReturn("ERDOGAN CIHAN"));
        Erdogan er1=new Erdogan("Erdogan","Cihan");
    }
}
