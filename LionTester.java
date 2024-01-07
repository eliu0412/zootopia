/* 
Author: Shaun A, Eric L, Arhum A, Logan C

Date: 01/25/2023

Purpose: Testing all the methods programmed in the Lion class

*/

import java.math.BigInteger;

class LionTester{
  public static void main(String[] args){

    
    //Test 1 --> Lion buff
    System.out.println("----Test 1----");

    //constructing biome
    Biome biome = new Savannah("Savannah");

    //outputting biome
    System.out.println(biome);

    System.out.println("");

    //constructing animals and outputting
    Lion lion = new Lion("Tester1", new BigInteger("10000"), biome );
    System.out.println(lion);
    System.out.println("");

    Frog arhum = new Frog("arhum", new BigInteger("10000"), biome);
    System.out.println(arhum);
    System.out.println("");

    //testing attacks 
    lion.chomp(arhum);
    lion.roar(arhum);
    lion.pounce(arhum);

    //outputting updated info 
    System.out.println(arhum);
    System.out.println("");

    System.out.println("---Other Method Testing--- \n");

    //testing other methods
    System.out.println(lion.toString());
    System.out.println(lion.getName());
    System.out.println(lion.getHp());
    System.out.println(lion.toString());

    System.out.println("");

    //Test 2 --> Lion Neutral
    System.out.println("----Test 2----");

    //constructing another biome
    Biome biome2 = new Rainforest("Rain Forest");
    System.out.println(biome2);

    //constructing animals and outputting 
    Lion lion2 = new Lion("Tester2", new BigInteger("10000"), biome2 );
    System.out.println(lion2);
    System.out.println("");

    Frog eric = new Frog("eric", new BigInteger("10000"), biome2);
    System.out.println(eric);
    System.out.println("");

    //testing the attacks
    lion2.chomp(eric);
    lion2.roar(eric);
    lion2.pounce(eric);

    //outputting the updated info
    System.out.println(eric);
    System.out.println("");

    //Test 3 --> Lion Neutral
    System.out.println("----Test 3----");

    //constructing the biome
    Biome biome3 = new Swamp("Swamp");
    System.out.println(biome3);

    //constructing the 2 animals and outputting 
    Lion lion3 = new Lion("Tester3", new BigInteger("10000"), biome3 );
    System.out.println(lion3);
    System.out.println("");

    Frog shaun = new Frog("shaun", new BigInteger("10000"), biome3);
    System.out.println(shaun);
    System.out.println("");

    //testing the attacks
    lion3.chomp(shaun);
    lion3.roar(shaun);
    lion3.pounce(shaun);

    //outputting the updated info
    System.out.println(shaun);
    System.out.println("");

    //Test 4 --> Lion Nerf
    System.out.println("----Test 4----");

    //constructing the biome
    Biome biome4 = new Arctic("Arctic");
    System.out.println(biome4);

    //constructing 2 animals and outputting
    Lion lion4 = new Lion("Tester4", new BigInteger("10000"), biome4 );
    System.out.println(lion4);
    System.out.println("");

    Frog logan = new Frog("logan", new BigInteger("10000"), biome4);
    System.out.println(logan);
    System.out.println("");

    //testing the attacks
    lion4.chomp(logan);
    lion4.roar(logan);
    lion4.pounce(logan);

    //outputting updated info
    System.out.println(logan);
    System.out.println("");  

    //testing method
    System.out.println(lion4.getType());

    System.out.println("");

    //testing the odd's
    System.out.println("---Odd's Tester---");

    //constructing animals
    Lion Lion = new Lion("Lion", new BigInteger("30000"), biome);

    PolarBear PolarBear = new PolarBear("Polar Bear", new BigInteger("30000"), biome);


    //calc odds testing interface
    Lion.calculateOdds(PolarBear);
    PolarBear.calculateOdds(Lion);

    System.out.println("");

    //constructing the frog
    Frog Frog = new Frog("Frog", new BigInteger("30000"), biome);

    //calculating odds
    Lion.calculateOdds(Frog);
    Frog.calculateOdds(Lion);

    System.out.println("");

    //constructing the gorilla 
    Gorilla Gorilla = new Gorilla("Gorilla", new BigInteger("30000"), biome, 5);

    //calculating odds
    Lion.calculateOdds(Gorilla);
    Gorilla.calculateOdds(Lion);

    System.out.println("");

    //constructing the poison dart frog
    PoisonDart PoisonDart = new PoisonDart("Poison Dart Frog", new BigInteger("30000"), biome);

    //calculating the odds
    Lion.calculateOdds(PoisonDart);
    PoisonDart.calculateOdds(Lion);

    System.out.println("");

    //constructing crocodile
    Crocodile Croc = new Crocodile("Croc", new BigInteger("30000"), biome);

    //calculating odds
    Lion.calculateOdds(Croc);
    Croc.calculateOdds(Lion);

    System.out.println("");

    //constructing ape
    Ape Ape = new Ape("Ape", new BigInteger("30000"), biome);

    //calculating the odds
    Lion.calculateOdds(Ape);
    Ape.calculateOdds(Lion);

    System.out.println("");

    //testing the method for update biome
    System.out.println("---Updated Biome--- \n");

    //making the update biome
    Biome Updatedbiome = new Arctic("Arctic");

    Lion.updateBiome(Updatedbiome);

    //outputting the updated biome
    System.out.println("The updated biome is: " + Updatedbiome);

    System.out.println("");

    //testing the attacks again with the updated biome
    Lion.chomp(arhum);
    Lion.roar(arhum);
    Lion.pounce(arhum);
    //System.out.println("Lion.biome + Lion.name + Lion.hp"); //dont work as these are protected variables
  }
}