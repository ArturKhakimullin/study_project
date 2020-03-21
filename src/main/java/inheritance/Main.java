package inheritance;

public class Main {
    public static void main(String[] args) {
        A aParent = new A ();
        B bChild = new B ();
        System.out.println(bChild.b);
        bChild.printVarB();
        bChild.printVarA();
        A bSecondChild = new B();
        bSecondChild = new C ();
    }
}
