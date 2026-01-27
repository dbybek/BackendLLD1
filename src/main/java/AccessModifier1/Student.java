package AccessModifier1;

public class Student {
    private String name;
    int batchId;
    protected double psp;
    public String uniName;

    public void printSomething(){
        System.out.println(name);
        System.out.println(batchId);
        System.out.println(psp);
        System.out.println(uniName);
    }
}
