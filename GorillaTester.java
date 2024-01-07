/* 
Author: Shaun A, Eric L, Arhum A, Logan C

Date: 01/25/2023

Class GorillaTester: Testing all the methods programmed in the Lion class

*/

import java.math.BigInteger;

class GorillaTester{
  public static void main(String[] args){

    //constructing biomes
    Rainforest strongBiome = new Rainforest("rainyfor");
    Savannah neutralBiome = new Savannah("sav");
    Swamp weakBiome = new Swamp("muddyLagoon");

    // test attacks in neutral biome
    Gorilla gor1 = new Gorilla("arhum", new BigInteger("100000"), neutralBiome,10);
    Gorilla testDummy = new Gorilla("tester", new BigInteger("1000000"), neutralBiome,0);

    System.out.println("***Test 1 in a neutral Biome");

    //testing methods 
    System.out.println(gor1.toString());
    System.out.println(gor1.getName());
    System.out.println(gor1.getHp());
    System.out.println(gor1.toString());

    //screach, climb, punch are inherited methods
    gor1.screach(testDummy);
    gor1.punch(testDummy);
    gor1.bananaToss(testDummy);
    System.out.println(gor1.getDmgMult()); //should be 2
    gor1.climb(testDummy);
    System.out.println(gor1.getDmgMult()); //should be 3
    System.out.println(testDummy.getDmgMult()); //should be 3
    gor1.chestThump(testDummy);
    System.out.println(testDummy.getDmgMult()); //should be 1
    System.out.println(testDummy.toString());
    testDummy.bananaToss(gor1); //wont work no bananas
    System.out.println("\n");

    //tests in weak zone
    System.out.println("***Test 2 in a weak Biome");
    gor1.updateBiome(weakBiome); //update buome is inherited also
    testDummy.updateBiome(weakBiome);
    gor1.getBiome();
    //weak zone so should do less damage
    gor1.screach(testDummy);
    gor1.punch(testDummy);
    gor1.bananaToss(testDummy);
    System.out.println(gor1.getDmgMult()); //should be 1
    gor1.climb(testDummy);
    System.out.println(gor1.getDmgMult()); //should be 3
    System.out.println(testDummy.getDmgMult()); //should be 3
    gor1.chestThump(testDummy);
    System.out.println(testDummy.getDmgMult()); //should be 1
    System.out.println(testDummy.toString());
    System.out.println("\n");

    //tests in strong zone
    System.out.println("***Test 3 in a strong Biome");
    gor1.updateBiome(strongBiome);
    testDummy.updateBiome(strongBiome);
    gor1.getBiome();
    // these should do more damage now
    gor1.screach(testDummy);
    gor1.punch(testDummy);
    System.out.println(gor1.getDmgMult()); //should be 3
    gor1.climb(testDummy);
    System.out.println(gor1.getDmgMult()); //should be 3
    System.out.println(testDummy.getDmgMult()); //should be 3
    System.out.println(testDummy.toString());
    System.out.println("\n");
    System.out.println(gor1.getType());

    System.out.println("");
    
    //Testing the odd's method in the gorilla class
    System.out.println("---Odd's Tester---");

    //constructing two animals
    Gorilla Gorilla = new Gorilla("Gorilla", new BigInteger("30000"), neutralBiome, 5);

    PolarBear PolarBear = new PolarBear("Polar Bear", new BigInteger("30000"), neutralBiome);

    //tesitng calc odds interface
    Gorilla.calculateOdds(PolarBear);
    PolarBear.calculateOdds(Gorilla);

    System.out.println("");

    //constructing frog
    Frog Frog = new Frog("Frog", new BigInteger("30000"), neutralBiome);

    //testing calc odds interface
    Gorilla.calculateOdds(Frog);
    Frog.calculateOdds(Gorilla);

    System.out.println("");

    //constructing lion
    Lion Lion = new Lion("Lion", new BigInteger("30000"), neutralBiome);

    //testing calc odds interface
    Gorilla.calculateOdds(Lion);
    Lion.calculateOdds(Gorilla);

    System.out.println("");

    //constructing poison dart
    PoisonDart PoisonDart = new PoisonDart("Poison Dart Frog", new BigInteger("30000"), neutralBiome);

    //testing calc odds interface
    Gorilla.calculateOdds(PoisonDart);
    PoisonDart.calculateOdds(Gorilla);

    System.out.println("");

    //constructing crocodile 
    Crocodile Croc = new Crocodile("Croc", new BigInteger("30000"), neutralBiome);

    //testing calc odds interface
    Gorilla.calculateOdds(Croc);
    Croc.calculateOdds(Gorilla);

    System.out.println("");

    //constructing ape
    Ape Ape = new Ape("Ape", new BigInteger("30000"), neutralBiome);

    //testing calc odds interface
    Gorilla.calculateOdds(Ape);
    Ape.calculateOdds(Gorilla);

    System.out.println("");

    //testing the updated biome method
    System.out.println("---Updated Biome--- \n");

    //constructing the updated biome
    Biome Updatedbiome = new Arctic("Arctic");

    //testing the method
    Gorilla.updateBiome(Updatedbiome);

    //outputting the updated biome
    System.out.println("The updated biome is: " + Updatedbiome);

    System.out.println("");

    //testing the attacks
    Gorilla.screach(testDummy);
    Gorilla.punch(testDummy);
    Gorilla.bananaToss(testDummy);

    //System.out.println(gor1.bananas); doesnt worrk cause bananas is a private variable
    //System.out.println("gor1.biome + gor1.name + gor1.hp"); //dont work as these are protected variables
    
  }
}