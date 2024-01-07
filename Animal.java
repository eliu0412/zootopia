/*

Author: Shaun A, Eric L, Arhum A, Logan C

Date: 01/22/2023

Class Animal: an abstract parent class that provides the framework for child classes

Constructors:
Animal(String name, BigInteger hp, Biome biome)

Methods:
public String toString()
public int compareTo(Animal other)
public Biome getBiome()
public String getName()
public BigInt getHp()
public int getDmgMult()
public String getType()
*/

import java.math.BigInteger;

public abstract class Animal implements Odds, Comparable<Animal>{

  // instance variables
  protected String type;
  protected BigInteger hp;
  protected String name;
  protected Biome biome;

  protected int dmgMultiplier = 2;

  // parent constructor
  public Animal(String name, BigInteger hp, Biome biome) {
    this.hp = hp;
    this.name = name;
    this.biome = biome;
  }


  // toString method
  /*
  Method Name: toString
  Method Description: Overloading method
  Parameters: None
  Returns: String
  */
  public String toString() {
    return ("Name: " + getName() + ", HP: " + getHp() + "");
  }

  //compare To method uses compare interface
  /*
  Method Name: compareTo
  Method Description: checks the names to make sure whoever comes up first alphabetically first goes first
  Parameters: Animal other
  Returns: int
  */
  public int compareTo(Animal other) {
      //checks health, lower health animal first 
      int result = (this.hp.compareTo(other.hp));
      if(result != 0){ //if not equal we just return the result
        return result;
      }
      else{ //otherwise we check the animal name if animals have the same hp, alphabetically higher first
        result = (this.getName()).compareTo(other.getName());
        return result;
      }
  }
  
  public abstract void updateBiome(Biome biome);

  // getters
  /*
  Method Name: getBiome
  Method Description: getting the biome
  Parameters: None
  Returns: Biome
  */
  public Biome getBiome(){
    return this.biome;
  }

  //return hp
  /*
  Method Name: getHp
  Method Description: getting the the hp
  Parameters: None
  Returns: BigInteger
  */
  public BigInteger getHp() {
    int hpcheck = this.hp.compareTo(new BigInteger("0"));
    if(hpcheck <= 0){
      this.hp = new BigInteger("0");
    }
    return this.hp;
  }

  //get name
  /*
  Method Name: getName
  Method Description: getting the name
  Parameters: None
  Returns: String
  */
  public String getName() {
    return this.name;
  }

  //get Dmg mult
  /*
  Method Name: getDmgMult
  Method Description: getting the damage multiplier 
  Parameters: None
  Returns: int
  */
  public int getDmgMult(){
    return this.dmgMultiplier;
  }

  //get type 
  /*
  Method Name: getType
  Method Description: getting the type
  Parameters: None
  Returns: String
  */
  public String getType(){
    return this.type;
  }

}