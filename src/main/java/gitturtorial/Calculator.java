package gitturtorial;

public class Calculator {

    public float by(float a, float b) {
        if (b == 0f) {
            throw new IllegalArgumentException("Division by 0!");
        }
        return a / b;
    }
}