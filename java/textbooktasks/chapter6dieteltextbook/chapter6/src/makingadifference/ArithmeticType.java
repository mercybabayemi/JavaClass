package makingadifference;

public enum ArithmeticType {
    Addition("+"), Subtraction("-"), Multiplication("*"), Division("/");

    private String symbol;

    ArithmeticType(String symbol) {
        this.symbol = symbol;
    }
}

