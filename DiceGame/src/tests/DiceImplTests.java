package tests;
import service.DiceImpl;

public class DiceImplTests   {
      DiceImpl diceImpl = new DiceImpl();

     public void testOfAppropriateValues(){
          String scenario = "DiceImplTestOfAppropriateValues";
          int roll = diceImpl.roll();
          // roll = 6;
          try {
              if((roll>=1)&&(roll<=6))
                  System.out.println(scenario + "  passed");
              else
                  throw new IllegalArgumentException("value of roll is unrealistic: " + roll);

          }
          catch (Exception e){
              System.err.println(scenario +": " +e.getMessage());
          }

    }
}
