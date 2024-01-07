/*
Author: Shaun A, Eric L, Arhum A, Logan C

Date: 01/21/2023

Class ArcticTester: To test the properties of arctic class

*/

import java.math.BigInteger;

class ArcticTester{

  public static void main (String [] args){

    //constructing biome
    Arctic biome = new Arctic("Arctic");

    //constructing the animals
    PolarBear bear = new PolarBear("logan", new BigInteger("8500"), biome);
    Lion lion = new Lion("shaun" , new BigInteger("10000"), biome);

    //outputting biome
    System.out.println(biome);

    //call multiples times for random method

    //testing the Ice method
    biome.Ice(bear, lion);
    System.out.println(bear);
    System.out.println(lion);

    //testing the Ice method
    biome.Ice(bear, lion);
    System.out.println(bear);
    System.out.println(lion);

    //testing the Ice method
    biome.Ice(bear, lion);
    System.out.println(bear);
    System.out.println(lion);

    //testing the Ice method
    biome.Ice(bear, lion);
    System.out.println(bear);
    System.out.println(lion);

    //testing the Ice method
    biome.Ice(bear, lion);
    System.out.println(bear);
    System.out.println(lion);

    //System.out.println(biome.name + biome.buffMultiplier + biome.nerfMultiplier); //doesnt work these are protected variables
  

    
  }
}