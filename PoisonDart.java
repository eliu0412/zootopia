/*

Author: Shaun A, Eric L, Arhum A, Logan C

Date: 01/21/2023

Class PoisonDart: To inherit from frog class, and then determine the information for the choice of PoisonDart

Constructors:
PoisonDart(String name, BigInteger hp, Biome biome)

Methods:
public void calculateOdds(Animal opp)
public String toString()
public void updateBiome(Biome biome)
public void poison(Animal opp)
*/

import java.math.BigInteger;

public class PoisonDart extends Frog{

  //variables
  private int min = 1;
  private int max = 2;

  //Frog constructor
  public PoisonDart(String name, BigInteger hp, Biome biome){
    super(name, hp, biome);
    this.type = "poison dart frog";
    
    //if the frog is in the swamp biome --> buff
    if (biome instanceof Swamp){
      this.dmgMultiplier = ((Swamp) biome).getBuffMultiplier();
    }
      
    //else if the frog is in the arctic biome --> nerf
    else if (biome instanceof Arctic){
      this.dmgMultiplier = ((Arctic) biome).getNerfMultiplier();
    }
      
      //every other biome frog multiplier --> 2
    else{
      this.dmgMultiplier = 2;
    }
  }
  
  /*
  Method Name: calculateOdds
  Method Description: [interface method] Calculating the odd's of every animal winning against the poison dart frog 
  Parameters: Animal opp
  Returns: Nothing
  */
  public void calculateOdds(Animal opp){

    //if crocodile
    if (opp instanceof Crocodile) {
      System.out.println("The Crocodile's chance of winning is 95%");
    }

    //else if frog
    else if (opp instanceof Frog) {
      System.out.println("The Frog's chance of winning is 11%");
    }

    //else if gorilla
    else if (opp instanceof Gorilla) {
      System.out.println("The Gorilla's chance of winning is 95%");
    }

    //else if lion
    else if (opp instanceof Lion) {
      System.out.println("The Lion's chance of winning is 90%");
    }

    //else if ape
    else if (opp instanceof Ape) {
      System.out.println("The Ape's chance of winning is 90%");
    }

    //else if polar bear
    else if (opp instanceof PolarBear) {
      System.out.println("The Polar Bear's chance of winning is 95%");
    }
  }
  
  /*
  Method Name: toString
  Method Description: overloading method
  Parameters: None
  Returns: String
  */
  @Override
  public String toString(){
    return ("Type: Poisonous! - " + super.toString());
  }

  /*
  Method Name: poison
  Method Description: Attack method for the poison dart frog
  Parameters: Animal opp
  Returns: Nothing
  */
  public void poison(Animal opp){
    //generating a random number 
    int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);

    //if the random attack is 1 then use the attack
    if (random_int == 1) {
       System.out.print(this.name + " used poison, " + opp.name + " is hurt!");
      
      BigInteger poison = new BigInteger("10000").multiply(new BigInteger(Integer.toString(dmgMultiplier)));
      
    opp.hp = opp.hp.subtract(poison);
   
  }
    //else
    else{
      System.out.println(this.name + " used poison but it did no damage this time!");
    }
  }
}
  