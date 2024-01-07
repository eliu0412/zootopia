
/*
Author: Shaun A, Eric L, Arhum A, Logan C

Date: 01/21/2023

Class Savannah: To determine what happens if the biome Savannah is randomly selected among the 4 biome choices

Constructor: 
Savannah(String name)

Methods: 
public String toString()
public void Dehydration(Animal animal, Animal opp)

*/

import java.math.BigInteger;


public class Savannah extends Biome {

  //variables
  private int max = 4;
  private int min = 1;
  private BigInteger subtractVal = new BigInteger ("1750");
 
  //constructor
  public Savannah(String name){
    super(name);
    this.buffMultiplier = 3;
    this.nerfMultiplier = 1;
  }

  //dehydration method --> random
  /*
  Method Name: dehydration
  Method Description: Random method, used when the biome Savannah is selected
  Parameters: Animal animal, Animal opp
  Returns: nothing
  */
  public void Dehydration(Animal animal, Animal opp) {
    System.out.println("It's so dry! Don't waste all your energy already. ");
    int randomNum = (int) Math.floor(Math.random() * (max - min + 1) + min);
    if (randomNum == 1){
    System.out.println("It's way too dry outside! Both of your animals are very dehydrated!");
    animal.hp = animal.hp.subtract(subtractVal);
    opp.hp = opp.hp.subtract(subtractVal);
    }
  }

  /*
  Method Name: toString
  Method Description: overloading method
  Returns: nothing
  */
  @Override
  public String toString(){
    return super.toString();
  }
}