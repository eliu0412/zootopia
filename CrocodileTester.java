/* 
Author: Shaun A, Eric L, Arhum A, Logan C

Date: 01/25/2023

Class CrocodileTester: Testing all the methods programmed in the Lion class

*/

import java.math.BigInteger;

class CrocodileTester{
  public static void main(String [] args){

    //Test 1 --> Crocodile attacks in Buff

    //constructing biome
    Biome biome = new Swamp("Swamp");
    System.out.println(biome);

    //constructing and outputting animals
    Crocodile croc = new Crocodile("Tester", new BigInteger("30000"), biome);
    System.out.println(croc);

    Gorilla eric = new Gorilla("eric", new BigInteger("30000"), biome, 10);
    System.out.println(eric);

    //testing the attacks
    croc.Bite(eric);
    croc.DeathRoll(eric);
    croc.Drown(eric);
    croc.TailWhip(eric);

    //outputting updated info
    System.out.println(eric);
    System.out.println("");

    //testing other methods
    System.out.println(croc.toString());
    System.out.println(croc.getName());
    System.out.println(croc.getHp());
    System.out.println(croc.toString());

    System.out.println(croc.getDmgMult());
    

    //Test 2 --> Neutral Biome
    System.out.println("----Test 2----");

    //constructing a new biome
    Biome biome2 = new Rainforest("RainForest");
    System.out.println(biome2);

    //constructing two new animals
    Crocodile croc2 = new Crocodile("Tester2", new BigInteger("10000"), biome2);
    System.out.println(croc2);

    Gorilla logan = new Gorilla("logan", new BigInteger("20000"), biome2, 10);
    System.out.println(logan);

    //testing all the attacks that can be used in the rain forest
    croc2.Bite(logan);

    croc2.TailWhip(logan);

    System.out.println(logan);
    System.out.println("");

    //Test 3 --> Neutral Biome
    System.out.println("----Test 3----");

    //constructing the third biome
    Biome biome3 = new Savannah("Savannah");
    System.out.println(biome3);

    //constructing two new animals
    Crocodile croc3 = new Crocodile("Tester3", new BigInteger("10000"), biome3);
    System.out.println(croc3);

    Gorilla arhum = new Gorilla("arhum", new BigInteger("20000"), biome3, 10);
    System.out.println(arhum);

    //testing the attacks that can be used in savannah
    croc3.Bite(arhum);
    croc3.TailWhip(arhum);

    //outputting updated info
    System.out.println(logan);
    System.out.println("");

    //Test 4 --> Weak Biome
    System.out.println("----Test 4----");

    //constructing another biome
    Biome biome4 = new Arctic("Arctic");
    System.out.println(biome4);

    //constructing two animals
    Crocodile croc4 = new Crocodile("Tester4", new BigInteger("10000"), biome3);
    System.out.println(croc4);

    Gorilla shaun = new Gorilla("shaun", new BigInteger("20000"), biome4, 10);
    System.out.println(shaun);

    //testing attacks that can be used in this biome
    croc4.Bite(shaun);
    croc4.TailWhip(shaun);

    //outputting 
    System.out.println(shaun);
    System.out.println(shaun.getType());

    System.out.println("");

    //testing the odds method
    System.out.println("---Odd's Tester---");

    //constructing animals
    Crocodile crocodile = new Crocodile("Crocodile", new BigInteger("30000"), biome);

    Ape Ape = new Ape("Ape", new BigInteger("30000"), biome);

    //testing calc odds interrface
    crocodile.calculateOdds(Ape);
    Ape.calculateOdds(crocodile);

    System.out.println("");

    //constructing frog
    Frog Frog = new Frog("Frog", new BigInteger("30000"), biome);

    //testing calc odds interrface
    crocodile.calculateOdds(Frog);
    Frog.calculateOdds(crocodile);

    System.out.println("");

    //constructing gorilla
    Gorilla Gorilla = new Gorilla("Gorilla", new BigInteger("30000"), biome, 5);

    //testing calc odds interrface
    crocodile.calculateOdds(Gorilla);
    Gorilla.calculateOdds(crocodile);

    System.out.println("");

    //constructing lion
    Lion Lion = new Lion("Lion", new BigInteger("30000"), biome);

    //testing calc odds interrface
    crocodile.calculateOdds(Lion);
    Lion.calculateOdds(crocodile);

    System.out.println("");

    //constructing poison dart
    PoisonDart PoisonDart = new PoisonDart("Poison Dart Frog", new BigInteger("30000"), biome);

    //testing calc odds interrface
    crocodile.calculateOdds(PoisonDart);
    PoisonDart.calculateOdds(crocodile);

    System.out.println("");

    //constructing polar bear
    PolarBear PolarBear = new PolarBear("Polar Bear", new BigInteger("30000"), biome);

    //testing calc odds interrface
    crocodile.calculateOdds(PolarBear);
    PolarBear.calculateOdds(crocodile);

    System.out.println("");

    //updated biome method tester
    System.out.println("---Updated Biome--- \n");

    //updated biome
    Biome Updatedbiome = new Arctic("Arctic");

    //testing the method
    crocodile.updateBiome(Updatedbiome);

    //outputting the new biome
    System.out.println("The updated biome is: " + Updatedbiome);

    //outputting the animal info
    System.out.println(crocodile);

    System.out.println("");

    //testing the attacks
    crocodile.Bite(eric);
    crocodile.DeathRoll(eric);
    crocodile.Drown(eric);
    crocodile.TailWhip(eric);
    //System.out.println("crocodile.biome + crocodile.name + crocodile.hp"); //dont work as these are protected variables

    
  }
}