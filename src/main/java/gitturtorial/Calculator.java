package gitturtorial;

public class Calculator {

    public int raise(int a, int b) {
        int result = a;
        for (int i = 1; i < b; i++){
            result*=a;
        }
        return result;

    }
}