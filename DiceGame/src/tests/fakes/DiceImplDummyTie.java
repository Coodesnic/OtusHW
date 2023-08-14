package tests.fakes;

import service.Dice;
import service.DiceImpl;

public class DiceImplDummyTie extends DiceImpl implements Dice {

    public int roll(){
        return 3;
    }
}
