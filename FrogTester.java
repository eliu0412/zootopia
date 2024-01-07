/* 
Author: Shaun A, Eric L, Arhum A, Logan C

Date: 01/25/2023

Class FrogTester: Testing all the methods programmed in the Frog class

*/

import java.math.BigInteger;

class FrogTester{
  public static void main(String[] args){

    //testing all the attacks in a weak, neutral, and buffed biome 
    
    //Test 1 --> Frog buff
    System.out.println("----Test 1----");

    //constructing biome
    Biome biome = new Swamp("Swamp");

    //outputting
    System.out.println(biome);

    //constructing frog and outputting
    Frog frog = new Frog("Tester1", new BigInteger("10000"), biome );
    System.out.println(frog);
    System.out.println("");

    //constructing gorilla for testing and outputting
    Gorilla Eric = new Gorilla("Eric", new BigInteger("10000"), biome, 19);
    System.out.println(Eric);
    System.out.println("");

    //testing attack 
    frog.suicide(Eric);

    System.out.println("Eric");
    System.out.println("");

    //testing other methods 
    System.out.println(frog.getName());
    System.out.println(frog.getHp());
    System.out.println(frog.toString());

    System.out.println(frog.getDmgMult());

    //Test 2 --> Frog Neutral 
    System.out.println("----Test 2----");
    //constructing another biome and outputting
    Biome biome2 = new Rainforest("Rain Forest");
    System.out.println(biome2);

    //constructing more animals for testing
    Frog frog2 = new Frog("Tester2", new BigInteger("10000"), biome2 );
    System.out.println(frog2);
    System.out.println("");

    Lion Shaun = new Lion("Shaun", new BigInteger("10000"), biome2);
    System.out.println(Shaun);
    System.out.println("");

    //testing attack
    frog2.suicide(Shaun);

    System.out.println("Shaun");
    System.out.println("");

    //Test 3 --> Frog Neutral
    System.out.println("----Test 3----");

    //constructing biome
    Biome biome3 = new Savannah("Savannah");
    System.out.println(biome3);

    //constructing animals for more testing
    Frog frog3 = new Frog("Tester3", new BigInteger("10000"), biome3);
    System.out.println(frog3);
    System.out.println("");

    Crocodile arhum = new Crocodile("arhum", new BigInteger("10000"), biome3);
    System.out.println(arhum);
    System.out.println("");

    //testing attack
    frog3.suicide(arhum);
    
    System.out.println("arhum");
    System.out.println("");


    //Test 4 --> Frog Nerf
    System.out.println("----Test 4----");

    //constructing last biome
    Biome biome4 = new Arctic("Arctic");
    System.out.println(biome4);

    //constructing 2 last animals for testing
    Frog frog4 = new Frog("Tester4", new BigInteger("10000"), biome4);
    System.out.println(frog4);
    System.out.println("");

    PolarBear Shaun1 = new PolarBear("Shaun", new BigInteger("10000"), biome4);
    System.out.println(Shaun1);
    System.out.println("");

    //testing attack
    frog4.suicide(Shaun1);

    System.out.print("Shaun");
    System.out.println("");

    System.out.println("---Odd's Tester---");

    //constructing polar bear
    PolarBear PolarBear = new PolarBear("Polar Bear", new BigInteger("30000"), biome);

    //testing the calc odds interface
    frog.calculateOdds(PolarBear);
    PolarBear.calculateOdds(frog);

    System.out.println("");

    //constructing gorilla
    Gorilla Gorilla = new Gorilla("Gorilla", new BigInteger("30000"), biome, 5);

    //testing the calc odds interface
    frog.calculateOdds(Gorilla);
    Gorilla.calculateOdds(frog);

    System.out.println("");

    //constructing lion
    Lion Lion = new Lion("Lion", new BigInteger("30000"), biome);

    //testing the calc odds interface
    frog.calculateOdds(Lion);
    Lion.calculateOdds(frog);

    System.out.println("");

    //construct poison dart
    PoisonDart PoisonDart = new PoisonDart("Poison Dart Frog", new BigInteger("30000"), biome);

    //testing the calc odds interface
    frog.calculateOdds(PoisonDart);
    PoisonDart.calculateOdds(frog);

    System.out.println("");

    //construct ape
    Ape Ape = new Ape("Ape", new BigInteger("30000"), biome);

    //testing the calc odds interface
    frog.calculateOdds(Ape);
    Ape.calculateOdds(frog);

    System.out.println("");

    //construct crocodile
    Crocodile Croc = new Crocodile("Croc", new BigInteger("30000"), biome);

    //testing the calc odds interface
    frog.calculateOdds(Croc);
    Croc.calculateOdds(frog);

    System.out.println("");

    System.out.println("---Updated Biome--- \n");

    //constructing updated biome
    Biome Updatedbiome = new Arctic("Arctic");

    //testing the updateBiome method
    frog.updateBiome(Updatedbiome);

    //outputting updated biome
    System.out.println("The updated biome is: " + Updatedbiome);

    System.out.println("");

    //testing attack
    frog.suicide(Eric);
    //System.out.println("frog.biome + frog.name + frog.hp"); //dont work as these are protected variables
  }
}