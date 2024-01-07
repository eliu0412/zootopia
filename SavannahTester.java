/*
Author: Shaun A, Eric L, Arhum A, Logan C

Date: 01/21/2023

Class SavannahTester: To test the properties of savannah class

*/
import java.math.BigInteger;

class SavannahTester{
  public static void main(String [] args){

    //constructing the biome
    Savannah biome = new Savannah("dry land");

    //constructing the animals
    Ape ape1 = new Ape("shaun", new BigInteger("100000"), biome);
    Ape testDummy = new Ape("tester", new BigInteger("1000000"), biome);

    System.out.println(biome.toString());

    //Calling these methods multiple times because it is random

    //testing the methods
    biome.Dehydration(ape1, testDummy);
    System.out.println(ape1.toString());
    System.out.println(testDummy.toString());

    //testing the methods
    biome.Dehydration(ape1, testDummy);
    System.out.println(ape1.toString());
    System.out.println(testDummy.toString());

    //testing the methods
    biome.Dehydration(ape1, testDummy);
    System.out.println(ape1.toString());
    System.out.println(testDummy.toString());

    //testing the methods
    biome.Dehydration(ape1, testDummy);
    System.out.println(ape1.toString());
    System.out.println(testDummy.toString());

    //testing the methods
    biome.Dehydration(ape1, testDummy);
    System.out.println(ape1.toString());
    System.out.println(testDummy.toString());
    //System.out.println(biome.name + biome.buffMultiplier + biome.nerfMultiplier) + biome.subtractVal; //doesnt work these are protected variables
  }
}