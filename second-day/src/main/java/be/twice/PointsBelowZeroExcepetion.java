package be.twice;

public class PointsBelowZeroExcepetion extends Exception {
    @Override
    public String getMessage() {
        return "Points may not be below 0.";
    }
}
