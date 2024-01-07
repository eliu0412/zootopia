/*

Author: Shaun A, Eric L, Arhum A, Logan C

Date: 01/21/2023

Class Crocodile: To inherit the framework from the Animal class, and then determine the information for the choice of Crocodile

Constructors:
Crocodile(String name, BigInteger hp, Biome biome)

Methods:
public void calculateOdds(Animal opp)
public String toString()
public void updateBiome(Biome biome)
public void Bite(Animal opp)
public void DeathRoll(animal opp)
public void Drown(animal opp)
public void TailWhip(animal opp)
*/

import java.math.BigInteger;
import java.util.Random;

public class Crocodile extends Animal{

  //contructor
  public Crocodile(String name, BigInteger hp, Biome biome){
    super(name,hp,biome);
    this.type = "crocodile";

    //if the biome is swamp, then there is a buff
    if (biome instanceof Swamp){
      this.dmgMultiplier = ((Swamp) biome).getBuffMultiplier();
    }
    //else if the biome is arctic, then there is a nerf
    else if (biome instanceof Arctic) {
      this.dmgMultiplier = ((Arctic) biome).getNerfMultiplier();
    }
    //else
    else {
      this.dmgMultiplier = 2;
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
    return ("Type: Crocodile - " + super.toString());
  }

  /*
  Method Name: updateBiome
  Method Description: Updating the biome, and determining if there is a buff, nerf, etc
  Parameters: Biome biome
  Returns: Nothing
  */
  public void updateBiome(Biome biome){
    this.biome = biome;

    //if the biome is swamp, then there is a buff
    if (biome instanceof Swamp){
      this.dmgMultiplier = ((Swamp) biome).getBuffMultiplier();
    }

    //else if the biome is arctic, then there is a nerf
    else if (biome instanceof Arctic) {
      this.dmgMultiplier = ((Arctic) biome).getNerfMultiplier();
    }

    //else 
    else {
      this.dmgMultiplier = 2;
    }
  }

  //Interface method
  /*
  Method Name: calculateOdds
  Method Description: Calculating the odds of every animal against the crocodile
  Parameters: Animal opp
  Returns: Nothing
  */
  public void calculateOdds(Animal opp){

    //determining the odds depending on the animal the Crocodile is fighting

    //if ape output it's odds
    if (opp instanceof Ape) {
      System.out.println("The Ape's chance of winning is 40%");
    }

    //else if gorilla output it's odds
    else if (opp instanceof Gorilla) {
      System.out.println("The Gorilla's chance of winning is 45%");
    }

    //else if poison dart output it's odds
    else if (opp instanceof PoisonDart) {
      System.out.println("The Poison Dart Frog's chance of winning is 5%");
    }

    //else if frog output it's odds
    else if (opp instanceof Frog) {
      System.out.println("The Frog's chance of winning is 0% \n");
    }

    //else if lion output it's odds
    else if (opp instanceof Lion) {
      System.out.println("The Lion's chance of winning is 45%");
    }

    //else if polar bear output it's odds
    else if (opp instanceof PolarBear) {
      System.out.println("The Polar Bear chance of winning is 50%");
    }
  }

  /*
  Method Name: Bite
  Method Description: The first attack of the crocodile
  Parameters: Animal opp
  Returns: Nothing
  */
  public void Bite(Animal opp) {

    //calculating damage
    BigInteger Bite = new BigInteger("1350").multiply(new BigInteger(Integer.toString(dmgMultiplier)));

    //outputting 
    System.out.println(this.name + " used BITE and did " + Bite + " dmg to " + opp.name);
    
    opp.hp = opp.hp.subtract(Bite);
    
  }

  /*
  Method Name: DeathRoll
  Method Description: The second attack of the crocodile than can only be used in the swamp
  Parameters: Animal opp
  Returns: Nothing
  */
  public void DeathRoll(Animal opp) {

    //if the biome is swamp then this attack can be used
    if (biome instanceof Swamp) {
      
      //calculating damage
    BigInteger DeathRoll = new BigInteger("2500").multiply(new       BigInteger(Integer.toString(dmgMultiplier)));

    //outputting
    System.out.println(this.name + " used DEATH ROLL and did " + DeathRoll + " dmg to " + opp.name);
    opp.hp = opp.hp.subtract(DeathRoll);
    }
    //else
    else {
      System.out.println("This attack can't be used! There is no water.");
    }
  }

  /*
  Method Name: Drown
  Method Description: The third attack of the crocodile, can only be used in the swamp biome
  Parameters: Animal opp
  Returns: Nothing
  */
  public void Drown(Animal opp) {

    //if the biome is swamp then this attack can be used
    if (biome instanceof Swamp) {
      
    //calculating damage
    BigInteger Drown = new BigInteger("750").multiply(new BigInteger(Integer.toString(dmgMultiplier)));

    //outputting
    System.out.println(this.name + " used DROWN and did " + Drown + " dmg to " + opp.name);
    opp.hp = opp.hp.subtract(Drown); 
    }

    //else
    else {
      System.out.println("This attack can not be used");
    }
  }

  /*
  Method Name: TailWhip
  Method Description: The fourth attack of the crocodile
  Parameters: Animal opp
  Returns: Nothing
  */
  public void TailWhip (Animal opp) {

    BigInteger TailWhip = new BigInteger("1150").multiply(new BigInteger(Integer.toString(dmgMultiplier)));

    //outputting
    System.out.println(this.name + " used TAIL WHIP and did " + TailWhip + " dmg to " + opp.name);
    opp.hp = opp.hp.subtract(TailWhip);
  }
} 
