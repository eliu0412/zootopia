/*
Author: Shaun A, Eric L, Arhum A, Logan C

Date: 01/21/2023

Class SwampTester: To test the properties of swamp class

*/

import java.math.BigInteger;

class SwampTester {
  
  public static void main(String [] args) {

    //constructing the biome
    Swamp biome = new Swamp("Mushy land");

    //constructing animals
    Crocodile Croc = new Crocodile("Arhum", new BigInteger ("10000"), biome);
    Ape testDummy = new Ape("Arhum2", new BigInteger("10000"), biome);

    System.out.println("");

    System.out.println("---Biome Tester--- \n");

    // we call it multiple times as its random
    biome.muddy(Croc, testDummy);

    System.out.println("");

    //testing the toString
    System.out.println(Croc.toString());
    System.out.println(testDummy.toString());

    System.out.println("");
    
    //testing muddy method
    biome.muddy(Croc, testDummy);

    System.out.println("");

    //testing the toString
    System.out.println(Croc.toString());
    System.out.println(testDummy.toString());

    System.out.println("");

    //testing the muddy method
    biome.muddy(Croc, testDummy);

    System.out.println("");
    
    //testing the toString
    System.out.println(Croc.toString());
    System.out.println(testDummy.toString());

    System.out.println("");

    //testing the muddy method
    biome.muddy(Croc, testDummy);

    System.out.println("");

    //testing the toString method
    System.out.println(Croc.toString());
    System.out.println(testDummy.toString());

    //testing the muddy method
    biome.muddy(Croc, testDummy);

    System.out.println("");

    //testing the toString method
    System.out.println(Croc.toString());
    System.out.println(testDummy.toString());
    //System.out.println(biome.name + biome.buffMultiplier + biome.nerfMultiplier); //doesnt work these are protected variables
  }
}

