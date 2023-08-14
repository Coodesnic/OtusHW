package tests;

public class AllTests {
    public static void main(String[] args) {

      DiceImplTests diceImplTest = new DiceImplTests();
      diceImplTest.testOfAppropriateValues();

      GameWinnerConsolePrinterTests gameWinnerConsolePrinterTest = new GameWinnerConsolePrinterTests();
      //gameWinnerConsolePrinterTest.winnerOutputTest();

      GameTests gameTest = new GameTests();
      gameTest.game1PlayerWins();
      gameTest.gameTieTest();
    }
}
