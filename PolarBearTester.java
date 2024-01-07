/*
Author: Shaun A, Eric L, Arhum A, Logan C

Date: 01/25/2023

Class PolarBearTester: To test the properties of PolarBear class
*/

import java.math.BigInteger;

class PolarBearTester {
  
  public static void main(String[] args) {

    //First Test --> Buff
    System.out.println("------------------Test 1------------------ \n");

    //constructing biome
    Biome biome = new Arctic("Arctic");
    System.out.println(biome);
    
    System.out.println("");

    System.out.println("---Animal Info--- \n");

    //constructing animal 
    PolarBear Bear = new PolarBear("Tester #1", new BigInteger("25000"), biome);
    System.out.println(""); 

    //outputting info
    System.out.println(Bear);

    System.out.println("");

    //constructing animal the attacks will be tested on 
    Crocodile Testing = new Crocodile("Shaun Arulanandam" , new BigInteger("25000"), biome);
    System.out.println("");    

    //outputting info
    System.out.println(Testing);

    System.out.println("");

    System.out.println("");

    System.out.println("---Polar Bear Attacks--- \n");
    //Attack #1
    Bear.munch(Testing);

    //Attack #2
    System.out.println("");
    Bear.hug(Testing);

    //Attack #3
    System.out.println("");
    Bear.claw(Testing);

    System.out.println("");
    
    //Outputting the HP after the 3 attacks happen
    System.out.println("---Updated HP--- \n");
    System.out.println(Testing + "\n");

    System.out.println("");

    System.out.println("------------------Other Method Testing------------------ \n");

    //testing other methods
    System.out.println(Bear.toString());
    System.out.println(Bear.getName());
    System.out.println(Bear.getHp());
    System.out.println(Bear.toString());

    System.out.println("");

    //Second Test --> Neutral
    System.out.println("------------------Test 2------------------ \n");

    //constructing new biome
    Biome biome2 = new Swamp("Swamp");
    System.out.println(biome);
    
    System.out.println("");

    System.out.println("---Animal Info--- \n");

    //constructing new Bear 
    PolarBear Bear2 = new PolarBear("Tester #2" , new BigInteger("25000"), biome2);

    System.out.println("");
    
    System.out.println(Bear);

    System.out.println("");

    //constructing new testing animal
    Crocodile Testing2 = new Crocodile("Shaun Arulanandam" , new BigInteger("25000"), biome2);

    System.out.println("");
    
    System.out.println(Testing2);

    System.out.println("");

    System.out.println("---Polar Bear Attacks--- \n");

    //Attack #1
    Bear2.munch(Testing2);

    //Attack #2
    System.out.println("");

    Bear2.hug(Testing2);

    //Attack #3
    System.out.println("");

    Bear2.claw(Testing2);

    System.out.println("");
    
    //Updated HP after the three attacks in the new biome
    System.out.println("---Updated HP--- \n");

    System.out.println(Testing2 + "\n");

    //Third Test --> Nerfed 
    
    System.out.println("------------------Test 3------------------ \n");

    //constructing third biome
    Biome biome3 = new Savannah("Savannah");
    
    System.out.println(biome3);
    
    System.out.println("");

    System.out.println("---Animal Info--- \n");

    //constructing another bear 
    PolarBear Bear3 = new PolarBear("Tester #3" , new BigInteger("25000"), biome3);

    System.out.println("");
    
    System.out.println(Bear3);

    System.out.println("");

    //constructing another testing animal
    Crocodile Testing3 = new Crocodile("Shaun Arulanandam" , new BigInteger("25000"), biome3);

    System.out.println("");
    
    System.out.println(Testing3);

    System.out.println("");


    System.out.println("");

    //Attacks for Polar Bear
    System.out.println("---Polar Bear Attacks--- \n");

    //Attack #1
    Bear3.munch(Testing3);

    //Attack #2
    System.out.println("");

    Bear3.hug(Testing3);

    //Attack #3
    System.out.println("");

    Bear3.claw(Testing3);

    System.out.println("");

    //New HP for the newly constructed croc after the three attacks
    System.out.println("---Updated HP--- \n");

    System.out.println(Testing3 + "\n");

    //Fourth Test --> Nerfed 
    
    System.out.println("------------------Test 4------------------ \n");

    //constructing the fourth biome
    Biome biome4 = new Rainforest("Rain Forest");
    
    System.out.println(biome4);
    
    System.out.println("");

    System.out.println("---Animal Info--- \n");

    //constructing the 4th bear 
    PolarBear Bear4 = new PolarBear("Tester #4" , new BigInteger("25000"), biome4);

    System.out.println("");
    
    System.out.println(Bear4);

    System.out.println("");

    //constructing another tester animal
    Crocodile Testing4 = new Crocodile("Shaun Arulanandam" , new BigInteger("25000"), biome4);

    System.out.println("");
    
    System.out.println(Testing4);

    System.out.println("");
    
    System.out.println("");

    //Attacks for Polar Bear
    System.out.println("---Polar Bear Attacks--- \n");

    //Attack #1
    Bear4.munch(Testing4);

    //Attack #2
    System.out.println("");

    Bear4.hug(Testing4);

    //Attack #3
    System.out.println("");

    Bear4.claw(Testing4);

    System.out.println("");

    //Updated hp for the croc after the 3 attacks by the bear
    System.out.println("---Updated HP--- \n");

    System.out.println(Testing4 + "\n");

    //testing getType method
    System.out.println(Testing.getType());


    //Test 5 --> Testing overloaded attack
    System.out.println("---Overload Method---");

    //Constructing new Bear 
    PolarBear overload = new PolarBear("OverloadTest" , new BigInteger("9000"), biome);
    System.out.println(overload);

    //Constructing testing animal
    Frog test = new Frog("Test" , new BigInteger("9012309124"), biome);
    System.out.println(test);

    overload.munch(test);

    System.out.println(test);

        System.out.println("");

    //Odd's for the animals
    System.out.println("---Odd's Tester---");

    //Constructing new animals
    PoisonDart PoisonDart = new PoisonDart("PoisonDart", new BigInteger("30000"), biome);

    PolarBear PolarBear = new PolarBear("Polar Bear", new BigInteger("30000"), biome);

    //testing calc odds method
    PolarBear.calculateOdds(PoisonDart);
    PoisonDart.calculateOdds(PolarBear);

    System.out.println("");

    //Constructing frog
    Frog Frog = new Frog("Frog", new BigInteger("30000"), biome);

    //testing calc odds method
    PolarBear.calculateOdds(Frog);
    Frog.calculateOdds(PolarBear);

    System.out.println("");

    //Constructing lion
    Lion Lion = new Lion("Lion", new BigInteger("30000"), biome);

    //testing calc odds method
    PolarBear.calculateOdds(Lion);
    Lion.calculateOdds(PolarBear);

    System.out.println("");

    //constructing gorrila
    Gorilla Gorilla = new Gorilla("Poison Dart Frog", new BigInteger("30000"), biome, 5);

    //testing calc odds method
    PolarBear.calculateOdds(Gorilla);
    Gorilla.calculateOdds(PolarBear);

    System.out.println("");

    //constructing new crocodile
    Crocodile Croc = new Crocodile("Croc", new BigInteger("30000"), biome);

    //testing calc odds method
    PolarBear.calculateOdds(Croc);
    Croc.calculateOdds(PolarBear);

    System.out.println("");

    //constructing new ape
    Ape Ape = new Ape("Ape", new BigInteger("30000"), biome);

    //testing calc odds method
    PolarBear.calculateOdds(Ape);
    Ape.calculateOdds(PolarBear);

    System.out.println("");
    
    //Testing the updated biome method, and then testing all the attacks with the nerf, buff, or neutral effect depending on the biome updated to
    System.out.println("---Updated Biome---");

    System.out.println("");

    //Constructing the new biome
    Biome UpdatedBiome = new Savannah("Savannah");
    
    PolarBear.updateBiome(UpdatedBiome);

    System.out.println(UpdatedBiome);

    System.out.println("");
    
    PolarBear.munch(Testing4);
    PolarBear.hug(Testing4);
    PolarBear.claw(Testing4);

    System.out.println("");

    System.out.println(Testing4);

    //System.out.println("PolarBear.biome + PolarBear.name + PolarBear.hp"); //dont work as these are protected variables
  }
}