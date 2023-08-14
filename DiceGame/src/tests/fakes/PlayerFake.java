package tests.fakes;

import service.Player;

public class PlayerFake extends Player {
    String name;
    public PlayerFake(String name) {
        super(name);
    }
}
