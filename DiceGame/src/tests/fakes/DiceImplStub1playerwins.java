package tests.fakes;

import service.Dice;
import service.DiceImpl;

public class DiceImplStub1playerwins extends DiceImpl implements Dice {

    boolean DiceImplPlugIsCalled = false;

    public int roll() {
        if (!DiceImplPlugIsCalled) {
            DiceImplPlugIsCalled = true;
            return 2;
        }
        else
            return 1;
    }

}
