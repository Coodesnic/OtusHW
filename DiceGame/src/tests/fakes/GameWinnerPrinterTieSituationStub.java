package tests.fakes;

import service.GameWinnerPrinter;
import service.Player;

public class GameWinnerPrinterTieSituationStub implements GameWinnerPrinter {
    private boolean printWinnerIsCalled = false;

    @Override
    public void printWinner(Player winner) {
        printWinnerIsCalled = true;
    }
    public boolean isPrintWinnerCalled() {
        return printWinnerIsCalled;
    }
}
