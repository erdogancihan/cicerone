private class Erdogan {


    public Erdogan() {
    }

    public Erdogan(String name, String surname) {
        System.out.println(name+surname);
    }

    public void newFunction(String name){
        System.out.println(name);
    }
    public static void newFunction1(String name){
        System.out.println(name);
    }
    public String newFunctionwithStringReturn(String name){
        return name.concat(" ismi eklendi");
    }
}
