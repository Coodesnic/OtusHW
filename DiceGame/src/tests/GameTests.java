package tests;

import service.Dice;
import service.Game;
import tests.fakes.*;

import java.util.Objects;

   public class GameTests {



  // Game game1 = new Game(dicePlug1,printerFake);
  // Game game2 = new Game(dicePlug2,printerFake);
   PlayerFake player1 = new PlayerFake("Otus1");
   PlayerFake player2 = new PlayerFake("Otus2");

   final private Dice dicePlug1  = new DiceImplDummyTie();     //будет ли структурно правильно передвинуть эти объявления к самому тесту?
   final private GameWinnerPrinterTieSituationStub printerFake1 = new GameWinnerPrinterTieSituationStub();

   void gameTieTest(){
      String scenario = "gameTieTest";
      Game game1 = new Game(dicePlug1,printerFake1);
      game1.playGame(player1, player2);
      if (!printerFake1.isPrintWinnerCalled())
          System.out.println(scenario + ": passed");
      else
         System.err.println(scenario + ": printWinner is called in a tie situation");

    }

    final private Dice dicePlug2 = new DiceImplStub1playerwins();
    final private GameWinnerPrinter1playerwinsStub printerFake2 = new GameWinnerPrinter1playerwinsStub();
   void game1PlayerWins(){
      String scenario = "game1PlayerWins";
      Game game2 = new Game(dicePlug2,printerFake2);
      game2.playGame(player1, player2);
      if (Objects.equals(printerFake2.returnWinnerName(), "Otus1"))
         System.out.println(scenario + ": passed");
      else
         System.err.println(scenario + ": wrong player won");

   }

}
