package crapgame;

import java.security.SecureRandom;

public class Craps {
    private static final SecureRandom rand = new SecureRandom();

    private enum Status{CONTINUE,WON,LOST};

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        int myPoint = 0;
        Status gameStatus;

        int sumOfDice = rollDice();

        switch (sumOfDice) {
            case SEVEN:
                case YO_LEVEN:
                    gameStatus = Status.WON;
                    break;
                    case SNAKE_EYES:
                        case TREY:
                            case BOX_CARS:
                                gameStatus = Status.LOST;
        }

        
    }

    private static int rollDice() {
    }
}
