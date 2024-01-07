/*

Author: Shaun A, Eric L, Arhum A, Logan C

Date: 01/21/2023

Class Ape: To inherit the framework from the Animal class, and then determine the information for the choice of Ape

Constructors:
Ape(String name, BigInteger hp, Biome biome)

Methods:
public void calculateOdds(Animal opp)
public String toString()
public void updateBiome(Biome biome)
public void screach(Animal opp)
public void climb(Animal opp)
public void punch(Animal opp)
*/

import java.math.BigInteger;

public class Ape extends Animal{

  //constructor
  public Ape(String name, BigInteger hp, Biome biome){
    super(name, hp, biome);
    this.type = "ape";

    //determining the damage multiplier depending on the biome randomly chosen

    //if rainforest then the ape gets a buff
    if (biome instanceof Rainforest){
      this.dmgMultiplier = ((Rainforest) biome).getBuffMultiplier();
    }
    //else if swamp, then the sape gets a nerf
    else if (biome instanceof Swamp) {
      this.dmgMultiplier = ((Swamp) biome).getNerfMultiplier();
    }
    //else 
    else {
      this.dmgMultiplier = 2;
    }
  }

  //interface method
  /*
  Method Name: calculateOdds
  Method Description: Outputting the chances of every animal winning against the Ape
  Parameters: Animal opp
  Returns: Nothing
  */
  public void calculateOdds(Animal opp){

    //determining the odds depending on the animal the Ape is fighting

    //if crocodile output it's odds
    if (opp instanceof Crocodile) {
      System.out.println("The Crocodile's chance of winning is 60%");
    }

    //else if gorilla output it's odds
    else if (opp instanceof Gorilla) {
      System.out.println("The Gorilla's chance of winning is 55%");
    }

    //else if poison dart output it's odds
    else if (opp instanceof PoisonDart) {
      System.out.println("The Poison Dart Frog's chance of winning is 10%");
    }

    //else if frog output it's odds
    else if (opp instanceof Frog) {
      System.out.println("The Frog's chance of winning is 0%");
    }

    //else if lion output it's odds
    else if (opp instanceof Lion) {
      System.out.println("The Lion's chance of winning is 75%");
    }

    //else if polar bear output it's odds
    else if (opp instanceof PolarBear) {
      System.out.println("The Polar Bear chance of winning is 55%");
    }
  }

  //toString method
  /*
  Method Name: toString
  Method Description: Overloading method
  Parameters: None
  Returns: String
  */
  public String toString(){
    return "Type: Ape - " + super.toString();
  }

   /*
  Method Name: updateBiome
  Method Description: Updating the biome, then determining if there is a nerf, boost, etc
  Parameters: Biome biome
  Returns: Nothing
  */
  public void updateBiome(Biome biome){

    //when the biome updates, then determine the new damage multiplier
    this.biome = biome;

    //if the biome is rainforest then return a buff
    if (biome instanceof Rainforest){
      this.dmgMultiplier = ((Rainforest) biome).getBuffMultiplier();
    }
    //else if the biome is swamp then return a nerf
    else if (biome instanceof Swamp) {
      this.dmgMultiplier = ((Swamp) biome).getNerfMultiplier();
    }
    //else 
    else {
      this.dmgMultiplier = 2;
    }
  }

  //attack methods
  /*
  Method Name: screach
  Method Description: The first attack of the Ape, does damage
  Parameters: Animal opp
  Returns: Nothing
  */
  public void screach(Animal opp){
    
    //Calculating the damage for the first attack with the multiplier 
    BigInteger screachDmg = new BigInteger("2500").multiply(new BigInteger(Integer.toString(dmgMultiplier)));

    //Outputting the attack's result
    System.out.println(this.name + " used SCREACH and did " + screachDmg + " damage to " + opp.name + "\nHowever " + opp.name + "'s ears are BLEEDING and " + opp.name + " is so ANGRY so they do more damage!\n");
    
    opp.dmgMultiplier = 3;
  }

  /*
  Method Name: climb
  Method Description: the second attack of the Ape, but this does no damage
  Parameters: Animal opp
  Returns: Nothing
  */
  public void climb(Animal opp){

    //Outputting the attack's result
    System.out.println(this.name + " used CLIMB, you gained energy from resting so you do more DAMAGE, but " + opp.name + " is enraged and does more damage ALSO! \n");
    this.dmgMultiplier = 3;
    opp.dmgMultiplier  = 3;
    }

  /*
  Method Name: punch
  Method Description: Third attack of the Ape, does damage
  Parameters: Animal opp
  Returns: Nothing
  */
  public void punch(Animal opp){

    //Calculating the damage for the third attack with the multiplier
    BigInteger punchDmg = new BigInteger("1750").multiply(new BigInteger(Integer.toString(dmgMultiplier)));
    opp.hp = opp.hp.subtract(punchDmg);

    //Outputting the attack's result
    System.out.println(this.name + " PUNCHED " + opp.name + " IN THE JAW and did " + punchDmg + " damage!\n");


  }


}
