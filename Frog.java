/*

Author: 

Date: 01/21/2023

Class Frog: To inherit the framework from the Animal class, and then determine the information for the choice of Frog

Constructors:
Frog(String name, BigInteger hp, Biome biome)

Methods:
public void calculateOdds(Animal opp)
public String toString()
public void updateBiome(Biome biome)
public void suicide(Animal opp)
public string getType()
*/

import java.math.BigInteger;

public class Frog extends Animal{

  //variables
  private int min = 1;
  private int max = 4;

  // Frog constructor
  public Frog(String name, BigInteger hp, Biome biome) {
    super(name, hp, biome);

    this.type = "frog";

    // if the frog is in the swamp biome --> buff
    if (biome instanceof Swamp) {
      this.dmgMultiplier = ((Swamp) biome).getBuffMultiplier();
    }
    // if the frog is in the arctic biome --> nerf
    else if (biome instanceof Arctic) {
      this.dmgMultiplier = ((Arctic) biome).getNerfMultiplier();
    }
    // every other biome frog multiplier --> 1
    else {
      this.dmgMultiplier = 2;
    }
  }

  /*
  Method Name: updateBiome
  Method Description: If the biome is updated, then recalculate if there would be a buff, nerf, etc
  Parameters: Biome biome
  Returns: Nothing
  */
  public void updateBiome(Biome biome){
    this.biome = biome;
    if (biome instanceof Swamp){
      this.dmgMultiplier = ((Swamp) biome).getBuffMultiplier();
    }
    else if (biome instanceof Arctic) {
      this.dmgMultiplier = ((Arctic) biome).getNerfMultiplier();
    }
    else {
      this.dmgMultiplier = 2;
    }
  }

  /*
  Method Name: calculateOdds
  Method Description: [interface method] Calculating the odd's of every animal winning against the Frog
  Parameters: Animal opp
  Returns: Nothing
  */
  public void calculateOdds(Animal opp){

    //determining the odds depending on the animal the Crocodile is fighting

    //if crocodile
    if (opp instanceof Crocodile) {
      System.out.println("The Crocodile's chance of winning is 100%");
    }

    //else if gorilla
    else if (opp instanceof Gorilla) {
      System.out.println("The Gorilla's chance of winning is 100%");
    }

    //else if ape
    else if (opp instanceof Ape) {
      System.out.println("The Ape's chance of winning is 100% \n");
    }

    //else if lion
    else if (opp instanceof Lion) {
      System.out.println("The Lion's chance of winning is 100%");
    }

    //else if poison dart
    else if (opp instanceof PoisonDart) {
      System.out.println("The Poison Dart's Frog's chance of winning is 89%");
    }

    //else if polar bear
    else if (opp instanceof PolarBear) {
      System.out.println("The Polar Bear's chance of winning is 100%");
    }
  }

  /*
  Method Name: toString
  Method Description: Overloading method
  Parameters: None
  Returns: String
  */
  @Override
  public String toString() {
    return ("Type: Frog - " + super.toString());
  }

    /*
  Method Name: suicide
  Method Description: Attack method provides a random chance to end both of the animals, effectively causing a tie
  Parameters: Animal opp
  Returns: Nothing
  */
  public void suicide(Animal opp) {
    //generating random number
    int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);

    //if the number is equal to 1 then use the attack
    if (random_int == 1) {
      System.out.println(this.name + " used suicide and did " + opp.hp + " dmg to " + opp.name);
      opp.hp = new BigInteger("0");
      this.hp = new BigInteger("0");
    } 
    //else only the frog dies
    else {
      System.out.println(this.name + " used suicide and died!");
      this.hp = new BigInteger("0");
    }

  }

    /*
  Method Name: suicide
  Method Description: getting the type 
  Parameters: None
  Returns: String
  */
  public String getType(){
    return type;
  }

}