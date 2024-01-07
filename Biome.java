/*
Author: Shaun A, Eric L, Arhum A, Logan C

Date: 01/25/2023

Class Biome: an abstract parent class that determines the framework for the biome

Constructors:
Biome(String name)

Methods:
public String toString()
public String getName()
public int getBuffMultiplier()
public int getNerfMultiplier()
*/

public abstract class Biome{

  //variables
  protected String name;
  protected int buffMultiplier;
  protected int nerfMultiplier;

  //constructor
  public Biome(String name){
    this.name = name;
  }

  /*
  Method Name: toString
  Method Description: overloading method
  Parameters: None
  Returns: String
  */
  public String toString(){
    return ("Currently in: " + getName());
  }

  /*
  Method Name: getName
  Method Description: getting the name 
  Parameters: None
  Returns: String
  */
  public String getName(){
    return this.name;
  }
  
  /*
  Method Name: getBuffMultiplier
  Method Description: getting the damage multiplier 
  Parameters: None
  Returns: int
  */
  public int getBuffMultiplier() {
    return this.buffMultiplier;
  }

  /*
  Method Name: getNerfMultiplier
  Method Description: getting the damage nerf
  Parameters: None
  Returns: int
  */
  public int getNerfMultiplier() {
    return this.nerfMultiplier;
  }
}