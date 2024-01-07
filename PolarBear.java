/*

Author: Shaun A, Eric L, Arhum A, Logan C

Date: 01/21/2023

Class PolarBear: To inherit the framework from the Animal class, and then determine the information for the choice of Polar Bear

Constructors:
PolarBearString name, BigInteger hp, Biome biome)

Methods:
public void calculateOdds(Animal opp)
public String toString()
public void updateBiome(Biome biome)
public void munch(Animal opp)
public void hug(Animal opp)
public void claw(Animal opp)
*/

import java.math.BigInteger;

public class PolarBear extends Animal{
  
  //Polarbear constructor
  public PolarBear(String name, BigInteger hp, Biome biome){
    super(name,hp, biome);
    this.type = "polarbear";

    //if the biome is arctic, then there is a buff
    if (biome instanceof Arctic){
      this.dmgMultiplier = ((Arctic) biome).getBuffMultiplier();
    }
    //if the biome is savannah, then there is nerf
    else if (biome instanceof Savannah) {
      this.dmgMultiplier = ((Savannah) biome).getNerfMultiplier();
    }
    //else 
    else {
      this.dmgMultiplier = 2;
    }
  }

  /*
  Method Name: updateBiome
  Method Description: Determining the updated damage multiplier depending on the updated biome  
  Parameters: Biome biome
  Returns: Nothing
  */
  public void updateBiome(Biome biome){
    this.biome = biome;

    //if the biome is artic then result in a buff for the damage
    if (biome instanceof Arctic){
      this.dmgMultiplier = ((Arctic) biome).getBuffMultiplier();
    }

    //else if the biome is savannah tthen result in a nerf for the damage
    else if (biome instanceof Savannah) {
      this.dmgMultiplier = ((Savannah) biome).getNerfMultiplier();
    }

    //else
    else {
      this.dmgMultiplier = 2;
    }
  }

  /*
  Method Name: toString
  Method Description: Overloading method
  Parameters: None
  Returns: String
  */
  @Override
  public String toString(){
    return ("Type: Polar Bear - " + super.toString());
  }

  /*
  Method Name: calculateOdds
  Method Description: [interface method] Calculating the odd's of every animal winning against the polar bear
  Parameters: Animal opp
  Returns: nothing
  */
  public void calculateOdds(Animal opp){

    //determining the odds of winning for the other animals vsing the polar bear

    //if crocodile output odds
    if (opp instanceof Crocodile) {
      System.out.println("The Crocodile's chance of winning is 50%");
    } 
    //else if gorilla output odds
    else if (opp instanceof Gorilla) {
      System.out.println("The Gorilla's chance of winning is 45%");
    }
    //else if ape output odds
    else if (opp instanceof Ape) {
      System.out.println("The Ape's chance of winning is 45%");
    }
    //else if poisondart output odds
    else if (opp instanceof PoisonDart) {
      System.out.println("The Poison Dart Frog's chance of winning is 5%");
    }
    //else if frog output odds
    else if (opp instanceof Frog) {
      System.out.println("The Frog's chance of winning is 0%");
    }
    //else if lion output odds
    else if (opp instanceof Lion) {
      System.out.println("The Lion's chance of winning is 50%");
    }
  }
  
  /*
  Method Name: munch
  Method Description: The first attack the polar bear can do
  Parameters: Animal opp
  Returns: Nothing
  */
  public void munch(Animal opp){
    BigInteger munch = new BigInteger ("1250").multiply(new BigInteger(Integer.toString(dmgMultiplier)));
    
    System.out.println(this.name + " used MUNCH and did " + munch + " dmg to " + opp.name);
    opp.hp = opp.hp.subtract(munch);
    
  }
    
  /*
  Method Name: munch
  Method Description: Overloaded method of the first attack
  Parameters: Frog opp
  Returns: Nothing
  */
  public void munch(Frog opp){
    System.out.println(this.name + " used MUNCH against " + opp.name + " and did CRITICAL DAMAGE! The frog DIES INSTANTLY!!");
    opp.hp = opp.hp.subtract(opp.hp);
    
  }
  
  /*
  Method Name: hug
  Method Description: 2nd attack of the bear, but does no damage
  Parameters: Animal opp
  Returns: Nothing
  */
  public void hug(Animal opp){
    System.out.println(this.name + " used HUG to " + opp.name +". Aw! How friendly!");
  }
  
  /*
  Method Name: claw
  Method Description: 3rd attack of the bear
  Parameters: Animal opp
  Returns: Nothing
  */
  public void claw(Animal opp){
    BigInteger claw = new BigInteger("1100").multiply(new BigInteger(Integer.toString(dmgMultiplier)));
        System.out.println(this.name + " used CLAW and did " + claw + " damage to " + opp.name);
        opp.hp = opp.hp.subtract(claw);
  }
}
