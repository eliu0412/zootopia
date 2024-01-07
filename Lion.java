/*
Author: Shaun A, Eric L, Arhum A, Logan C

Date: 01/21/2023

Class Lion: To inherit the framework from the Animal class, and then determine the information for the choice of Lion

Constructors:
Lion(String name, BigInteger hp, Biome biome)

Methods:
public void calculateOdds(Animal opp)
public String toString()
public void updateBiome(Biome biome)
public void chomp(Animal opp)
public void roar(Animal opp)
public void pounce(Animal opp)
*/

import java.math.BigInteger;

public class Lion extends Animal{

  //Lion constructor
  public Lion(String name, BigInteger hp, Biome biome){
    super(name, hp, biome);
    this.type = "lion";

    //if the biome is savannah then the damage has a buff
    if (biome instanceof Savannah){
      this.dmgMultiplier = ((Savannah) biome).getBuffMultiplier();
    }

    //else if the biome is arctic then the damage has a nerf
    else if (biome instanceof Arctic) {
      this.dmgMultiplier = ((Arctic) biome).getNerfMultiplier();
    }

    //else 
    else {
      this.dmgMultiplier = 2;
    }
  }

  /*
  Method Name: updateBiome
  Method Description: When the biome is updated, then determine if there is a buff, nerf, etc
  Parameters: Biome biome
  Returns: Nothing
  */
  public void updateBiome(Biome biome){
    this.biome = biome;

    //if the biome is savannah then there is a buff in the damage
    if (biome instanceof Savannah){
      this.dmgMultiplier = ((Savannah) biome).getBuffMultiplier();
    }

    //else if the biome is arctic then there is a nerf in the damage
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
  Method Description: Overloading method
  Parameters: None
  Returns: String
  */
  @Override
  public String toString(){
    return ("Type: Lion - " + super.toString());
  }
  
   /*
  Method Name: calculateOdds
  Method Description: [interface method] Calculating the odd's of every animal winning against the lion
  Parameters: Animal opp
  Returns: Nothing
  */
  public void calculateOdds(Animal opp){
    
    //determining the odds depending on the animal the Crocodile is fighting

    //if crocodile output odds
    if (opp instanceof Crocodile) {
      System.out.println("The Crocodile's chance of winning is 55%");
    }

    //else if gorilla output odds
    else if (opp instanceof Gorilla) {
      System.out.println("The Gorilla's chance of winning is 45%");
    }

    //else if ape output odds
    else if (opp instanceof Ape) {
      System.out.println("The Ape's chance of winning is 25%");
    }

    //else if poison dart output odds
    else if (opp instanceof PoisonDart) {
      System.out.println("The Poison Dart Frog's chance of winning is 10%");
    }

    //else if frog output odds
    else if (opp instanceof Frog) {
      System.out.println("The Frog chance of winning 0%");
    }

    //else if polar bear output odds
    else if (opp instanceof PolarBear) {
      System.out.println("The Polar Bear chance of winning is 50%");
    }
  }


  /*
  Method Name: chomp
  Method Description: First attack of the lion
  Parameters: Animal opp
  Returns: Nothing
  */
  public void chomp(Animal opp){
    BigInteger chomp = new BigInteger ("1300").multiply(new BigInteger(Integer.toString(dmgMultiplier)));
    
    System.out.println(this.name + " used CHOMP and did " + chomp + " dmg to " + opp.name);
    opp.hp = opp.hp.subtract(chomp);
    
  }

  /*
  Method Name: roar
  Method Description: 2nd attack for the lion
  Parameters: Animal opp
  Returns: Nothing
  */
  public void roar(Animal opp){
    System.out.println(this.name + " used ROAR to " + opp.name +". How scary!");
  }

  /*
  Method Name: pounce
  Method Description: 3rd attack for the lion
  Parameters: Animal opp
  Returns: Nothing
  */
  public void pounce(Animal opp){
    BigInteger pounce = new BigInteger("850").multiply(new BigInteger(Integer.toString(dmgMultiplier)));
        System.out.println(this.name + " used POUNCE and did " + pounce + " damage to " + opp.name);
        opp.hp = opp.hp.subtract(pounce);
  }


}