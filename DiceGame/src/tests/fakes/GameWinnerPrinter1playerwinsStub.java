package tests.fakes;

import service.GameWinnerPrinter;
import service.Player;

public class GameWinnerPrinter1playerwinsStub implements GameWinnerPrinter {
    Player winner;
    public void printWinner(Player winner) {
        this.winner = winner;
    }
    public String returnWinnerName(){
        return winner.getName();
    }
}
