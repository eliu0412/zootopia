/*
Author: Shaun A, Eric L, Arhum A, Logan C

Date: 01/21/2023

Class RainforestTester: To test the properties of rainforest class

*/

import java.math.BigInteger;

class RainforestTester{
 public static void main(String [] args){

   //constructing the biome
   Rainforest biome = new Rainforest("Rain Forest");

   //constructing the animals
   Ape ape = new Ape("eric" , new BigInteger("9000"), biome);
   Lion lion = new Lion("arhum" , new BigInteger("16000"), biome);
   
   System.out.println(biome);

   //call multiple times for random method

   //testing methods 
   biome.Rain(ape,lion);
   System.out.println(ape);
   System.out.println(lion);

   //testing methods
   biome.Rain(ape,lion);
   System.out.println(ape);
   System.out.println(lion);

   //testing methods
   biome.Rain(ape,lion);
   System.out.println(ape);
   System.out.println(lion);

   //testing methods
   biome.Rain(ape,lion);
   System.out.println(ape);
   System.out.println(lion);

   //testing methods
   biome.Rain(ape,lion);
   System.out.println(ape);
   System.out.println(lion);
   //System.out.println(biome.name + biome.buffMultiplier + biome.nerfMultiplier); //doesnt work these are protected variables
  }
}