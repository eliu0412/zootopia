/*
Author: Shaun A, Eric L, Arhum A, Logan C

Date: 01/21/2023

Class ApeTester: To test the properties of Ape class

*/
import java.util.*;
import java.math.BigInteger;

//this is trash
class ApeTester{
  public static void main(String[] args){
    
    //constructing biomes
    Rainforest strongBiome = new Rainforest("rainyfor");
    Savannah neutralBiome = new Savannah("sav");
    Swamp weakBiome = new Swamp("muddyLagoon");

    //constructing animals
    Ape ape1 = new Ape("shaun", new BigInteger("100000"), neutralBiome);
    Ape testDummy = new Ape("tester", new BigInteger("1000000"), neutralBiome);
    
    // testing toString and getters and those stuff
    System.out.println("***Test 1 in a neutral Biome");
    System.out.println(ape1.toString());
    System.out.println(ape1.getName());
    System.out.println(ape1.getHp());
    System.out.println(ape1.toString());
    
    //testing attacks in a neutral zone
    ape1.screach(testDummy);
    ape1.punch(testDummy);
    System.out.println(ape1.getDmgMult()); //should be 2
    ape1.climb(testDummy);
    System.out.println(ape1.getDmgMult()); //should be 3
    System.out.println(testDummy.getDmgMult()); //should be 3
    System.out.println(testDummy.toString());
    System.out.println("\n");

    //tests in weak zone
    System.out.println("***Test 2 in a weak Biome");
    ape1.updateBiome(weakBiome);
    testDummy.updateBiome(weakBiome);
    ape1.getBiome();
    // these should do less damage now
    ape1.screach(testDummy);
    ape1.punch(testDummy);
    System.out.println(ape1.getDmgMult()); //should be 1
    ape1.climb(testDummy);
    System.out.println(ape1.getDmgMult()); //should be 3
    System.out.println(testDummy.getDmgMult()); //should be 3
    System.out.println(testDummy.toString());
    System.out.println("\n");

    //tests in weak zone
    System.out.println("***Test 3 in a strong Biome");
    ape1.updateBiome(strongBiome);
    testDummy.updateBiome(strongBiome);
    ape1.getBiome();
    // these should do more damage now
    ape1.screach(testDummy);
    ape1.punch(testDummy);
    System.out.println(ape1.getDmgMult()); //should be 3
    ape1.climb(testDummy);
    System.out.println(ape1.getDmgMult()); //should be 3
    System.out.println(testDummy.getDmgMult()); //should be 3
    System.out.println(testDummy.toString());
    System.out.println("\n");
    System.out.println(ape1.getType());

    System.out.println("");

    System.out.println("---Odd's Tester---");

    //constructing animals
    Ape ape2 = new Ape("shaun", new BigInteger("100000"), neutralBiome);
  
    Crocodile Croc = new Crocodile("Croc", new BigInteger("100000"), neutralBiome);

    //testing the calc odds interface method
    ape2.calculateOdds(Croc);
    Croc.calculateOdds(ape2);

    System.out.println("");

    //constructing frog
    Frog Frog = new Frog("Frog", new BigInteger("100000"), neutralBiome);

    //testing calculateOdds method
    ape2.calculateOdds(Frog);
    Frog.calculateOdds(ape2);

    System.out.println("");

    //constructing gorilla
    Gorilla Gorilla = new Gorilla("Gorilla", new BigInteger("100000"), neutralBiome, 5);

    //testing calculateOdds method
    ape2.calculateOdds(Gorilla);
    Gorilla.calculateOdds(ape2);

    System.out.println("");

    //constructing lion 
    Lion Lion = new Lion("Lion", new BigInteger("100000"), neutralBiome);

    //testing calculateOdds method
    ape2.calculateOdds(Lion);
    Lion.calculateOdds(ape2);

    System.out.println("");

    //constructing poison dart frog
    PoisonDart Poison = new PoisonDart("Poison Dart", new BigInteger("100000"), neutralBiome);

    //testing calculateOdds method
    ape2.calculateOdds(Poison);
    Poison.calculateOdds(ape2);

    System.out.println("");

    //constructing polar bear
    PolarBear PolarBear = new PolarBear("Polar Bear", new BigInteger("100000"), neutralBiome);

    //testing calculateOdds method
    ape2.calculateOdds(PolarBear);
    PolarBear.calculateOdds(ape2);

    
    //System.out.println("ape2.biome + ape2.name + ape2.hp"); //dont work as these are protected variables

    //testing compareTo sorting (for general Animal class)
    Animal[] animals = new Animal[5];
    animals[0] = new Ape("Joey", new BigInteger("5"), neutralBiome); // should be 5th
    animals[1] = new Lion("Zoe", new BigInteger("3"), neutralBiome); //4th
    animals[2] = new Crocodile("Andy", new BigInteger("3"), neutralBiome); //3rrd (andy is hgiher alphabettically)
    animals[3] = new Frog("Bro", new BigInteger("1"), neutralBiome); //1st
    animals[4] = new Frog("Shaun", new BigInteger("2"), neutralBiome); //2nd

    Arrays.sort(animals);
    for(int i = 0; i<= 4; i++){
      System.out.println(animals[i].getName());
    }
  }
}