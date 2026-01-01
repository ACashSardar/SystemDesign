package LLD.SOLID;

public class Child implements Parent {
    @Override
    public void solve(String s) {
        System.out.println("Solved " + s);
    }
}
