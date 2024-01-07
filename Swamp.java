
/*
Author: Shaun A, Eric L, Arhum A, Logan C

Date: 01/21/2023

Class Swamp: To determine what happens if the biome Swamp is randomly selected among the 4 biome choices

Constructor: 
Swamp(String name)

Methods: 
public String toString() 
public void muddy(Animal animal, Animal opp)
*/

import java.math.BigInteger;

public class Swamp extends Biome {

  //variables
  private BigInteger dmgVal = new BigInteger("1000");
  private int max = 4;
  private int min = 3;
  
  //constructor
  public Swamp(String name) {
    super(name);
    this.buffMultiplier = 4;
    this.nerfMultiplier = 1;
  }
  
  @Override
  /*
  Method Name: toString
  Method Description: Overloading method
  Parameters: None
  Returns: String
  */
  public String toString() {
    return (super.toString());
  }

  /*
  Method Name: muddy
  Method Description: Random method, which is used when the Swamp biome is selected
  Parameters: Animal animal, Animal opp
  Returns: nothing
  */
  public void muddy(Animal animal, Animal opp){
    System.out.println("Your animals got stuck in the mud!!");
    int randomNum = (int) Math.floor(Math.random() * (max - min + 1) + min);
    if (randomNum == 4){
      System.out.println("Oh No! The leeches are biting both of your animals!! They're both taking damage!");
      animal.hp = animal.hp.subtract(dmgVal);
      opp.hp = opp.hp.subtract(dmgVal);
    }
  }


}