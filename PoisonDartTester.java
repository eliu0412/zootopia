/*

Author: Shaun A, Eric L, Arhum A, Logan C

Date: 01/21/2023

Class PoisonDartTester: To test the properties of PoisonDart class
*/

import java.math.BigInteger;

class PoisonDartTester{

  public static void main(String[] args){

    //Test 1 --> PoisonDart Frog buff
    System.out.println("----Test 1----");

    //constructing biome
    Biome biome = new Swamp("Swamp");
    System.out.println(biome);

    //constructing the animals
    PoisonDart poisondart = new PoisonDart("Tester1", new BigInteger("10000"), biome );
    System.out.println(poisondart);
    System.out.println("");

    Gorilla Eric = new Gorilla("Eric", new BigInteger("10000"), biome, 19);
    System.out.println(Eric);
    System.out.println("");

    //testing the attack method
    poisondart.poison(Eric);

    System.out.println("Eric");
    System.out.println("");

    System.out.println("---Other Method Testing--- \n");

    //testing other methods
    System.out.println(poisondart.toString());
    System.out.println(poisondart.getName());
    System.out.println(poisondart.getHp());
    System.out.println(poisondart.toString());

    System.out.println("");

    //Test 2 --> Frog Neutral 
    System.out.println("----Test 2----");

    //constructing a new biome
    Biome biome2 = new Rainforest("Rain Forest");
    System.out.println(biome2);

    //constructing 2 new animals
    PoisonDart poisondart2 = new PoisonDart("Tester2", new BigInteger("10000"), biome2 );
    System.out.println(poisondart2);
    System.out.println("");

    Lion Shaun = new Lion("Shaun", new BigInteger("10000"), biome2);
    System.out.println(Shaun);
    System.out.println("");

    //testing the attack method again
    poisondart2.poison(Shaun);

    System.out.println("Shaun");
    System.out.println("");

    //Test 3 --> Frog Neutral
    System.out.println("----Test 3----");

    //constructing a third biome
    Biome biome3 = new Savannah("Savannah");
    System.out.println(biome3);

    //constructing another pair of animals
    PoisonDart poisondart3 = new PoisonDart("Tester3", new BigInteger("10000"), biome3);
    System.out.println(poisondart3);
    System.out.println("");

    Crocodile arhum = new Crocodile("arhum", new BigInteger("10000"), biome3);
    System.out.println(arhum);
    System.out.println("");

    //testing the attack method
    poisondart3.poison(arhum);
    
    System.out.println("arhum");
    System.out.println("");


    //Test 4 --> Frog Nerf
    System.out.println("----Test 4----");

    //constructing another biome
    Biome biome4 = new Arctic("Arctic");
    System.out.println(biome4);

    //constructing more animals
    PoisonDart poisondart4 = new PoisonDart("Tester4", new BigInteger("10000"), biome4);
    System.out.println(poisondart4);
    System.out.println("");
    System.out.println(poisondart4.getType());

    PolarBear Shaun1 = new PolarBear("Shaun1", new BigInteger("10000"), biome4);
    System.out.println(Shaun1);
    System.out.println("");

    //testing the attack method
    poisondart4.poison(Shaun1);

    System.out.print("Shaun1");
    System.out.println("\n");

    System.out.println("---Odd's Tester---");

    //constructing 2 new animals
    PoisonDart PoisonDart = new PoisonDart("PoisonDart", new BigInteger("30000"), biome);

    PolarBear PolarBear = new PolarBear("Polar Bear", new BigInteger("30000"), biome);

    //testing odds calc interface
    PoisonDart.calculateOdds(PolarBear);
    PolarBear.calculateOdds(PoisonDart);

    System.out.println("");

    //constructing new animal to test the interface 
    Frog Frog = new Frog("Frog", new BigInteger("30000"), biome);

    //testing odds calc interface
    PoisonDart.calculateOdds(Frog);
    Frog.calculateOdds(PoisonDart);

    System.out.println("");

    //constructing new animal to test the interface 
    Lion Lion = new Lion("Lion", new BigInteger("30000"), biome);

    //testing odds calc interface
    PoisonDart.calculateOdds(Lion);
    Lion.calculateOdds(PoisonDart);

    System.out.println("");

     //constructing new animal to test the interface 
    Gorilla Gorilla = new Gorilla("Poison Dart Frog", new BigInteger("30000"), biome, 5);

    //testing odds calc interface
    PoisonDart.calculateOdds(Gorilla);
    Gorilla.calculateOdds(PoisonDart);

    System.out.println("");

     //constructing new animal to test the interface 
    Crocodile Croc = new Crocodile("Croc", new BigInteger("30000"), biome);

    //testing odds calc interface
    PoisonDart.calculateOdds(Croc);
    Croc.calculateOdds(PoisonDart);

    System.out.println("");

     //constructing new animal to test the interface 
    Ape Ape = new Ape("Ape", new BigInteger("30000"), biome);

    //testing odds calc interface
    PoisonDart.calculateOdds(Ape);
    Ape.calculateOdds(PoisonDart);

    System.out.println("");

    //testing the method for update biome
    System.out.println("---Updated Biome--- \n");

    //making the update biome
    Biome Updatedbiome = new Arctic("Arctic");

    Lion.updateBiome(Updatedbiome);

    System.out.println("The updated biome is: " + Updatedbiome);

    System.out.println("");

    poisondart.suicide(Ape);
    //System.out.println("PoisonDart.biome + PoisonDart.name + PoisonDart.hp"); //dont work as these are protected variables
     //System.out.println(PoisonDart.min + PoisonDart.max);
    // min/max are private
    
  }

    
}
