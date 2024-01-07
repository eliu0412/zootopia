/*
Author: Shaun A, Eric L, Arhum A, Logan C

Date: 01/21/2023

Class Rainforest: To determine what happens if the biome Rainforest is randomly selected among the 4 biome choices

Constructor: 
Rainforest(String name)

Methods: 
public String toString()
public void Rain(Animal animal, Animal opp)

*/

import java.math.BigInteger;

public class Rainforest extends Biome {

  //variables
  private int max = 4;
  private int min = 1;
  private BigInteger healVal = new BigInteger ("500");
  
  //constructor
  public Rainforest(String name){
    super(name);
    this.buffMultiplier = 3;
    this.nerfMultiplier = 1;
  }

  /*
  Method Name: toString
  Method Description: Overloading method
  Parameters: None
  Returns: String
  */
  @Override
  public String toString(){
    return super.toString();
  }

  /*
  Method Name: Rain
  Method Description: Random method, used when the biome Rainforest is selected
  Parameters: Animal animal, Animal opp
  Returns: nothing
  */
  public void Rain(Animal animal, Animal opp){
    System.out.println("It started raining! It's so slippery outside!");
    
    int randomNum = (int) Math.floor(Math.random() * (max - min + 1) + min);
    if (randomNum == 3){
    System.out.println("There's an abundance of water outside! Your animals drank the water and gained a bit of health!");
    animal.hp = animal.hp.add(healVal);
    opp.hp = opp.hp.add(healVal);
    }
  }
}