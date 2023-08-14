package tests;

import org.junit.jupiter.api.Assertions;
import service.GameWinnerConsolePrinter;
import tests.fakes.PlayerFake;

import java.io.ByteArrayInputStream;


public class GameWinnerConsolePrinterTests {
    GameWinnerConsolePrinter winnerPrinter = new GameWinnerConsolePrinter();

    public void winnerOutputTest() {
        String scenario = "Тест вывода строки";
        //WinnerPlug winnerPlug = new WinnerPlug("output string");
        //winnerPrinter.printWinner(winnerPlug);
          try {
            String expected = "Победитель: output string";
            ByteArrayInputStream inputStream = new ByteArrayInputStream(expected.getBytes());
            PlayerFake playerPlug = new PlayerFake("output string");
            winnerPrinter.printWinner(playerPlug);

            String actual = inputStream.toString();
            Assertions.assertEquals(expected + System.getProperty("line.separator"), actual);
            System.out.println(scenario + " passed");

        } catch (Exception e) {
            System.err.println("Output isnt working properly");
        }

    }

}
