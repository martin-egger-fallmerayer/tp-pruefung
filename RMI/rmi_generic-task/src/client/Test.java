package variableClass.client;

import variableClass.Task;

public class Test implements Task {
    public double a;
    public int b;

    public Test(double a, int b) {
        this.a = a;
        this.b = b;
    }

    public Object run(){
        return Math.pow(a, b);
    }
}
