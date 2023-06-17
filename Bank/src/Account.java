import java.util.Objects;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
public class Account {
    int accountID;
    int amountOfMoney;
    String holdersName;

    public Account(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public Account(int accountID, int amountOfMoney, String holdersName) {
        this.accountID = accountID;
        this.amountOfMoney = amountOfMoney;
        this.holdersName = holdersName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return amountOfMoney == account.amountOfMoney;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountOfMoney);
    }




}
