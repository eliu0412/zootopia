/*

Author: 

Date: 01/21/2023

Class Gorilla: To inherit from the ape class, and then determine the information for the choice of Gorilla

Constructors:
Gorilla(String name, BigInteger hp, Biome biome)

Methods:
public void calculateOdds(Animal opp)
public String toString()
public void updateBiome(Biome biome)
public void BananaToss(Animal opp)
public void chestThump(Animal opp)
*/

import java.math.BigInteger;

public class Gorilla extends Ape {
  
  private int bananas;

  //contructor
  public Gorilla(String name, BigInteger hp, Biome biome, int bananas){
    super(name, hp, biome);
    this.bananas = bananas;
    this.type = "gorilla";
  }

  /*
  Method Name: toString
  Method Description: Overloading method
  Parameters: None
  Returns: String
  */
  public String toString(){
    return "Type: Gorilla from " + super.toString();
  }

  /*
  Method Name: calculateOdds
  Method Description: [interface method] Calculating the odd's of every animal winning against the Gorilla
  Parameters: Animal opp
  Returns: Nothing
  */
  public void calculateOdds(Animal opp){

    //determining the odds depending on the animal the Crocodile is fighting

    //if crocodile output odds
    if (opp instanceof Crocodile) {
      System.out.println("The Crocodile's chance of winning is 60%");
    }

    //else if ape output odds
    else if (opp instanceof Ape) {
      System.out.println("The Ape's chance of winning is 45%");
    }

    //else if poison dart output odds
    else if (opp instanceof PoisonDart) {
      System.out.println("The Poison Dart Frog's chance of winning is 5%");
    }

    //else if frog output odds
    else if (opp instanceof Frog) {
      System.out.println("The Frog's chance of winning is 0%");
    }

    //else if lion output odds
    else if (opp instanceof Lion) {
      System.out.println("The Lion's chance of winning is 55%");
    }

    //else if polar bear output odds
    else if (opp instanceof PolarBear) {
      System.out.println("The Polar Bear's chance of winning is 55%");
    }
  }

    /*
  Method Name: bananaToss
  Method Description: Gorilla attack, if there are no banana's then the gorrila can't use the attack
  Parameters: Animal opp
  Returns: Nothing
  */
  public void bananaToss(Animal opp){
    BigInteger bananaDmg = new BigInteger("1500").multiply(new BigInteger(Integer.toString(dmgMultiplier)));

    //if there are more than 0 bananas use the attack
    if(bananas > 0){
      bananas -= 1;
      opp.hp = opp.hp.subtract(bananaDmg);
      System.out.println("Banana THROWN at " + opp.name + " and did " + bananaDmg + " damage!");
      
    }

    //else
    else{
      System.out.println("No bananas left");
    }
    
  }

    /*
  Method Name: chestThump
  Method Description: Reduces the attack the opponent does to the gorilla
  Parameters: Animal opp
  Returns: Nothing
  */
  public void chestThump(Animal opp){
    opp.dmgMultiplier = 1;
    System.out.println(this.name + " used CHEST THUMP, " + opp.name + " is TERRIFIED and does less damage.");
  }

}