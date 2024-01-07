/*
Author: Shaun A, Eric L, Arhum A, Logan C

Date: 01/21/2023

Class Arctic: To determine what happens if the biome Arctic is randomly selected among the 4 biome choices

Constructor:
Arctic(String name)

Methods: 
toString()
Ice(Animal animal, Animal opp)

*/

import java.math.BigInteger;

public class Arctic extends Biome {

  //variables
  private int max = 4;
  private int min = 1;
  private BigInteger subtractVal = new BigInteger("1550");
  
  //constructor
  public Arctic(String name) {
    super(name);
    this.buffMultiplier = 3;
    this.nerfMultiplier = 1;
  }

  //ice method --> random
  /*
  Method Name: Ice
  Method Description: Random method that occurs when the biome arctic is chosen
  Parameters: Animal animal, Animal opp
  Returns: Nothing
  */
  public void Ice(Animal animal, Animal opp) {
    
    //different effect based on animal, polarbears will be ok
    System.out.println("It's incredibly cold, you could freeze to death!");
    int randomNum = (int) Math.floor(Math.random() * (max - min + 1) + min);
    if (randomNum == 2){

      //depending on the animal there would be different effects
      if (animal instanceof PolarBear && opp instanceof PolarBear) {
        System.out.println("The polar bear loves it!!");
      }
      //else if one player has the polar bear and the other one does not then return the message
      else if (animal instanceof PolarBear && !(opp instanceof PolarBear)){
        System.out.println("The polar bear loves it!! but the other animal is freezing...");
        animal.hp = animal.hp;
        
        opp.hp = opp.hp.subtract(subtractVal);
      }
      //else if the other player has the polar bear and the other does not then return the message
      else if (opp instanceof PolarBear && !(animal instanceof PolarBear)){
        System.out.println("The polar bear loves it!! but the other animal is freezing...");
        opp.hp = opp.hp;
        
        animal.hp = animal.hp.subtract(subtractVal);
      }
      //else 
      else{
        System.out.println("Brr!!! Both animals are freezing and taking damage!!");

        animal.hp = animal.hp.subtract(subtractVal);
        opp.hp = opp.hp.subtract(subtractVal);
      }
    }
  }
  
  @Override
  //toString method
  /*
  Method Name: toString
  Method Description: overloading method
  Parameters: None
  Returns: String
  */
  public String toString() {
    return (super.toString());
  }
}