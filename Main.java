import java.math.BigInteger;
import java.util.Scanner;
import java.util.*;
/*
Author: Shaun A, Eric L, Arhum A, Logan C
Date: 01/23/2023
Purpose: the core gameplay loop of the game that utilizes all the classes created to make a final functioning project

*/

class Main {

  public static int selectBiome() {
    Random random = new Random();
    int randomNumber = random.nextInt(3 + 1);

    return randomNumber;
  }

  // overload methods --> displaying attacks
  public static void displayAttack(Ape ape) {
    System.out.println("The Ape's attacks are:");
    System.out.println("1. Screach");
    System.out.println("2. Punch");
    System.out.println("3. Climb");
  }

  // method that displays attacks
  public static void displayAttack(Crocodile croc) {
    if (croc.getBiome() instanceof Swamp) {
      System.out.println("The Crocodile's attacks are: \n 1. Bite \n 2. Death Roll \n 3. Drown \n 4. Tail Whip");
    } else {
      System.out.println("Your attacks are: \n 1. Bite \n 2. Tail Whip");
    }
  }

  // method that displays attacks
  public static void displayAttack(Gorilla gorilla) {
    System.out.println("The Gorilla's attacks are:");
    System.out.println("1. Screach");
    System.out.println("2. Punch");
    System.out.println("3. Banana Toss");
    System.out.println("4. Chest Thump");
    System.out.println("5. Climb");

  }

  // method that dislpays attacks
  public static void displayAttack(Lion lion) {
    System.out.println("The Lion's attacks are: \n 1. Chomp\n 2. Roar\n 3. Pounce");
  }

  // method that dislpays attacks
  public static void displayAttack(PolarBear bear) {
    System.out.println("The PolarBear's attacks are: \n 1. Munch\n 2. Hug\n 3. Claw");
  }

  // method to display attacks
  public static void displayAttack(PoisonDart frog) {
    System.out.println("The Poison Dart Frog's attacks are: \n 1.Poison ");
  }

  // method to display attacks
  public static void displayAttack(Frog frog) {
    System.out.println("The Frog's attacks are: \n 1.Suicide ");
  }

  public static void main(String[] args) {

    Scanner userin = new Scanner(System.in);
    // creation biomes exhibits
    Arctic arctic = new Arctic("Arctic exhibit");
    Savannah savannah = new Savannah("Savannah exhibit");
    Swamp swamp = new Swamp("Swamp exhibit");
    Rainforest rainforest = new Rainforest("Rainforest exhibit");

    // absstract polymorphism with biomes
    Biome[] biomes = new Biome[4];
    biomes[0] = arctic;
    biomes[1] = savannah;
    biomes[2] = swamp;
    biomes[3] = rainforest;

    // abstract polymporhpism with animals class
    Animal[] animals = new Animal[5];
    // default animals
    animals[0] = new Ape("Ape", new BigInteger("10000"), rainforest);
    animals[1] = new Lion("Lion", new BigInteger("10000"), savannah);
    animals[2] = new PolarBear("Polarbear", new BigInteger("10000"), arctic);
    animals[3] = new Crocodile("crocodile", new BigInteger("10000"), swamp);
    animals[4] = new Frog("Frog", new BigInteger("10000"), swamp);

    // creating array list for each animal and creating multiple objects of each
    // animal
    // lions
    ArrayList<Lion> lions = new ArrayList<Lion>();
    Lion lion1 = new Lion("Mufasa", new BigInteger("10000"), savannah);
    Lion lion2 = new Lion("Scar", new BigInteger("13000"), savannah);
    Lion lion3 = new Lion("Simba", new BigInteger("8000"), savannah);
    Lion lion4 = new Lion("Nala", new BigInteger("10000"), savannah);
    // adding them to the arr list
    lions.add(lion1);
    lions.add(lion2);
    lions.add(lion3);
    lions.add(lion4);

    // polarbears
    ArrayList<PolarBear> polarbears = new ArrayList<PolarBear>();
    PolarBear polarbear1 = new PolarBear("Beartic", new BigInteger("10000"), arctic);
    PolarBear polarbear2 = new PolarBear("Knut", new BigInteger("7000"), arctic);
    PolarBear polarbear3 = new PolarBear("Ursus", new BigInteger("16000"), arctic);
    PolarBear polarbear4 = new PolarBear("Ursula", new BigInteger("12500"), arctic);
    polarbears.add(polarbear1);
    polarbears.add(polarbear2);
    polarbears.add(polarbear3);
    polarbears.add(polarbear4);

    // crocodiles
    ArrayList<Crocodile> crocodiles = new ArrayList<Crocodile>();
    Crocodile crocodile1 = new Crocodile("Crocodylus", new BigInteger("10000"), swamp);
    Crocodile crocodile2 = new Crocodile("Beaker", new BigInteger("9000"), swamp);
    Crocodile crocodile3 = new Crocodile("Krookodile", new BigInteger("5000"), swamp);
    Crocodile crocodile4 = new Crocodile("Sandile", new BigInteger("14000"), swamp);
    crocodiles.add(crocodile1);
    crocodiles.add(crocodile2);
    crocodiles.add(crocodile3);
    crocodiles.add(crocodile4);

    // frogs
    ArrayList<Frog> frogs = new ArrayList<Frog>();
    Frog frog1 = new Frog("Kermit", new BigInteger("7000"), swamp);
    Frog frog2 = new Frog("Greninja", new BigInteger("9000"), swamp);
    PoisonDart frog3 = new PoisonDart("Toxicroak", new BigInteger("10000"), swamp);
    Frog frog4 = new Frog("Froakie", new BigInteger("6500"), swamp);
    PoisonDart frog5 = new PoisonDart("Croagunk", new BigInteger("11250"), swamp);
    frogs.add(frog1);
    frogs.add(frog2);
    frogs.add(frog3);
    frogs.add(frog4);
    frogs.add(frog5);

    // parent polymorphism for ape and gorillas
    Ape [] apes = new Ape[4];
    Ape ape1 = new Ape("Caesar", new BigInteger("10000"), rainforest);
    Gorilla ape2 = new Gorilla("Harambe", new BigInteger("15000"), rainforest, 10);
    Ape ape3 = new Ape("Koba", new BigInteger("8000"), rainforest);
    Gorilla ape4 = new Gorilla("Monkezuma", new BigInteger("12500"), rainforest, 5);
    apes[0] = ape1;
    apes[1] = ape2;
    apes[2] = ape3;
    apes[3] = ape4;
    // introductions
    System.out.println(
        "\nOH NO! A natural disaster has hit the city zoo! The enclosures are now all open and the animals are FIGHTING!!!");
    System.out.println(
        "\nAs the zookeepers, there is nothing you two can do except take control of your favourite animal in hopes of fighting off the other and helping it SURVIVE!");
    System.out.println(
        "\nEach animal will have an exhibit that they are weak and strong in. For example a polarbear will feel comfortable within the arctic exhibit, but the lion not so much.");
    System.out.println(
        "\nYou both will be prompted with a species to choose from, and then the specific animal of each species. Goodluck...");

    System.out.println("");
    for (int i = 0; i <= 4; i++) {
      System.out.println((i + 1) + ". " + animals[i].getType());
    }
    Animal player1;
    Animal player2;

    // selection of animals
    String specieschoice;
    while (true) {
      System.out.println("\nTo start PLAYER 1 choose your animal species (choose the number):");
      specieschoice = userin.nextLine();

      System.out.println("");

      if (specieschoice.equals("1")) {
        // loop thoruhg apes
        for(int i = 0; i <= 3; i++){
          System.out.println((i + 1) + ". " + apes[i].getName());
        }
        while (true) {
          System.out.println("Choose your option (choose the number): ");
          String apeChoice = userin.nextLine();
          if (apeChoice.equals("1")) {
            player1 = ape1;
            System.out.println("Your choice is: " + player1.getName());
            break;
          } else if (apeChoice.equals("2")) {
            player1 = ape2;
            System.out.println("Your choice is: " + player1.getName());
            break;
          } else if (apeChoice.equals("3")) {
            player1 = ape3;
            System.out.println("Your choice is: " + player1.getName());
            break;
          } else if (apeChoice.equals("4")) {
            player1 = ape4;
            System.out.println("Your choice is: " + player1.getName());

            break;
          } else {
            System.out.println("Invalid choice! Pick Again!");
          }
        }

        break;

      } else if (specieschoice.equals("2")) {
        //using iterator to loop through lions arr list
        Iterator<Lion> iter = lions.iterator();
        int index = 1;
        while (iter.hasNext()) {
          System.out.println(index + ". " + iter.next().getName());
          index += 1;
        }
        while (true) {
          System.out.println("Choose your option (choose the number): ");
          String lionChoice = userin.nextLine();
          if (lionChoice.equals("1")) {
            player1 = lion1;
            System.out.println("Your choice is: " + player1.getName());
            break;
          } else if (lionChoice.equals("2")) {
            player1 = lion2;
            System.out.println("Your choice is: " + player1.getName());
            break;
          } else if (lionChoice.equals("3")) {
            player1 = lion3;
            System.out.println("Your choice is: " + player1.getName());
            break;
          } else if (lionChoice.equals("4")) {
            player1 = lion4;
            System.out.println("Your choice is: " + player1.getName());

            break;
          } else {
            System.out.println("Invalid choice! Pick Again!");
          }
        }
        break;
      }

      else if (specieschoice.equals("3")) {
        Iterator<PolarBear> iter = polarbears.iterator();
        int index = 1;
        while (iter.hasNext()) {
          System.out.println(index + ". " + iter.next().getName());
          index += 1;
        }
        while (true) {
          System.out.println("Choose your option (choose the number): ");
          String polarbearChoice = userin.nextLine();
          if (polarbearChoice.equals("1")) {
            player1 = polarbear1;
            System.out.println("Your choice is: " + player1.getName());
            break;
          } else if (polarbearChoice.equals("2")) {
            player1 = polarbear2;
            System.out.println("Your choice is: " + player1.getName());
            break;
          } else if (polarbearChoice.equals("3")) {
            player1 = polarbear3;
            System.out.println("Your choice is: " + player1.getName());
            break;
          } else if (polarbearChoice.equals("4")) {
            player1 = polarbear4;
            System.out.println("Your choice is: " + player1.getName());

            break;
          } else {
            System.out.println("Invalid choice! Pick Again!");
          }
        }
        break;
      } else if (specieschoice.equals("4")) {
        Iterator<Crocodile> iter = crocodiles.iterator();
        int index = 1;
        while (iter.hasNext()) {
          System.out.println(index + ". " + iter.next().getName());
          index += 1;
        }
        while (true) {
          System.out.println("Choose your option (choose the number): ");
          String crocChoice = userin.nextLine();
          if (crocChoice.equals("1")) {
            player1 = crocodile1;
            System.out.println("Your choice is: " + player1.getName());
            break;
          } else if (crocChoice.equals("2")) {
            player1 = crocodile2;
            System.out.println("Your choice is: " + player1.getName());
            break;
          } else if (crocChoice.equals("3")) {
            player1 = crocodile3;
            System.out.println("Your choice is: " + player1.getName());
            break;
          } else if (crocChoice.equals("4")) {
            player1 = crocodile4;
            System.out.println("Your choice is: " + player1.getName());

            break;
          } else {
            System.out.println("Invalid choice! Pick Again!");
          }
        }
        break;
      } else if (specieschoice.equals("5")) {
        Iterator<Frog> iter = frogs.iterator();
        int index = 1;
        while (iter.hasNext()) {
          System.out.println(index + ". " + iter.next().getName());
          index += 1;
        }
        while (true) {
          System.out.println("Choose your option (choose the number): ");
          String frogChoice = userin.nextLine();
          if (frogChoice.equals("1")) {
            player1 = frog1;
            System.out.println("Your choice is: " + player1.getName());
            break;
          } else if (frogChoice.equals("2")) {
            player1 = frog2;
            System.out.println("Your choice is: " + player1.getName());
            break;
          } else if (frogChoice.equals("3")) {
            player1 = frog3;
            System.out.println("Your choice is: " + player1.getName());
            break;
          } else if (frogChoice.equals("4")) {
            player1 = frog4;
            System.out.println("Your choice is: " + player1.getName());

            break;
          } else if (frogChoice.equals("5")) {
            player1 = frog5;
            System.out.println("Your choice is: " + player1.getName());

            break;
          } else {
            System.out.println("Invalid choice! Pick Again!");
          }
        }
        break;
      } else {
        System.out.println("Not a valid choice!");
      }
    }

    // ensure no duplication of species
    String p1animal = specieschoice;

    // Player 2
    System.out.println("");
    for (int i = 0; i <= 4; i++) {
      System.out.println((i + 1) + ". " + animals[i].getType());
    }
    //player 2 pick animal
    while (true) {
      System.out.println("\nTo start PLAYER 2 choose your animal species (choose the number):");
      specieschoice = userin.nextLine();

      System.out.println("");

      if (specieschoice.equals(p1animal)) {
        System.out.println(" Animal species already chosen!");
      }

      else if (specieschoice.equals("1")) {
        for(int i = 0; i <= 3; i++){
          System.out.println((i + 1) + ". " + apes[i].getName());
        }
        while (true) {
          System.out.println("Choose your option (choose the number): ");
          String apeChoice = userin.nextLine();
          if (apeChoice.equals("1")) {
            player2 = ape1;
            System.out.println("Your choice is: " + player2.getName());
            break;
          } else if (apeChoice.equals("2")) {
            player2 = ape2;
            System.out.println("Your choice is: " + player2.getName());
            break;
          } else if (apeChoice.equals("3")) {
            player2 = ape3;
            System.out.println("Your choice is: " + player2.getName());
            break;
          } else if (apeChoice.equals("4")) {
            player2 = ape4;
            System.out.println("Your choice is: " + player2.getName());

            break;
          } else {
            System.out.println("Invalid choice! Pick Again!");
          }
        }

        break;

      } else if (specieschoice.equals("2")) {
        Iterator<Lion> iter = lions.iterator();
        int index = 1;
        while (iter.hasNext()) {
          System.out.println(index + ". " + iter.next().getName());
          index += 1;
        }
        while (true) {
          System.out.println("Choose your option (choose the number): ");
          String lionChoice = userin.nextLine();
          if (lionChoice.equals("1")) {
            player2 = lion1;
            System.out.println("Your choice is: " + player2.getName());
            break;
          } else if (lionChoice.equals("2")) {
            player2 = lion2;
            System.out.println("Your choice is: " + player2.getName());
            break;
          } else if (lionChoice.equals("3")) {
            player2 = lion3;
            System.out.println("Your choice is: " + player2.getName());
            break;
          } else if (lionChoice.equals("4")) {
            player2 = lion4;
            System.out.println("Your choice is: " + player2.getName());

            break;
          } else {
            System.out.println("Invalid choice! Pick Again!");
          }
        }
        break;
      }

      else if (specieschoice.equals("3")) {
        Iterator<PolarBear> iter = polarbears.iterator();
        int index = 1;
        while (iter.hasNext()) {
          System.out.println(index + ". " + iter.next().getName());
          index += 1;
        }
        while (true) {
          System.out.println("Choose your option (choose the number): ");
          String polarbearChoice = userin.nextLine();
          if (polarbearChoice.equals("1")) {
            player2 = polarbear1;
            System.out.println("Your choice is: " + player2.getName());
            break;
          } else if (polarbearChoice.equals("2")) {
            player2 = polarbear2;
            System.out.println("Your choice is: " + player2.getName());
            break;
          } else if (polarbearChoice.equals("3")) {
            player2 = polarbear3;
            System.out.println("Your choice is: " + player2.getName());
            break;
          } else if (polarbearChoice.equals("4")) {
            player2 = polarbear4;
            System.out.println("Your choice is: " + player2.getName());

            break;
          } else {
            System.out.println("Invalid choice! Pick Again!");
          }
        }
        break;
      } else if (specieschoice.equals("4")) {
        Iterator<Crocodile> iter = crocodiles.iterator();
        int index = 1;
        while (iter.hasNext()) {
          System.out.println(index + ". " + iter.next().getName());
          index += 1;
        }
        while (true) {
          System.out.println("Choose your option (choose the number): ");
          String crocChoice = userin.nextLine();
          if (crocChoice.equals("1")) {
            player2 = crocodile1;
            System.out.println("Your choice is: " + player2.getName());
            break;
          } else if (crocChoice.equals("2")) {
            player2 = crocodile2;
            System.out.println("Your choice is: " + player2.getName());
            break;
          } else if (crocChoice.equals("3")) {
            player2 = crocodile3;
            System.out.println("Your choice is: " + player2.getName());
            break;
          } else if (crocChoice.equals("4")) {
            player2 = crocodile4;
            System.out.println("Your choice is: " + player2.getName());

            break;
          } else {
            System.out.println("Invalid choice! Pick Again!");
          }
        }
        break;
      } else if (specieschoice.equals("5")) {
        Iterator<Frog> iter = frogs.iterator();
        int index = 1;
        while (iter.hasNext()) {
          System.out.println(index + ". " + iter.next().getName());
          index += 1;
        }
        while (true) {
          System.out.println("Choose your option (choose the number): ");
          String frogChoice = userin.nextLine();
          if (frogChoice.equals("1")) {
            player2 = frog1;
            System.out.println("Your choice is: " + player2.getName());
            break;
          } else if (frogChoice.equals("2")) {
            player2 = frog2;
            System.out.println("Your choice is: " + player2.getName());
            break;
          } else if (frogChoice.equals("3")) {
            player2 = frog3;
            System.out.println("Your choice is: " + player2.getName());
            break;
          } else if (frogChoice.equals("4")) {
            player2 = frog4;
            System.out.println("Your choice is: " + player2.getName());

            break;
          } else if (frogChoice.equals("5")) {
            player2 = frog5;
            System.out.println("Your choice is: " + player2.getName());

            break;
          } else {
            System.out.println("Invalid choice! Pick Again!");
          }
        }
        break;
      } else {
        System.out.println("Not a valid choice!");
      }
    }

    // stores players in an array
    Animal[] players = new Animal[2];
    players[0] = player1;
    players[1] = player2;

    // calls compare To interface, decides whos going first
    Arrays.sort(players);
    if (players[0] == player2) {
      Animal temp_1;
      Animal temp_2;
      // swaps player objects if player2 should go first
      temp_1 = player1;
      temp_2 = player2;
      player1 = temp_2;
      player2 = temp_1;
    }
    
    System.out.println("\n----------------------------------");

    System.out.println("\n" + players[0].getName() + " will go first.\n");

    // interface method call
    player1.calculateOdds(player2);
    player2.calculateOdds(player1);

    // select the starting biome
    int b_index = selectBiome();
    Biome currentbiome = biomes[b_index];
    System.out.println("\n" + currentbiome);

    int p1HPcheck = 2;
    int p2HPcheck = 1;

    // main gameplay loop: continues as long as both animals alive
    while (p1HPcheck > 0 && p2HPcheck > 0) {
      
      System.out.println("\n----------------------------------\n");
      // calling biome random effects
      if (currentbiome instanceof Arctic) {
        ((Arctic) currentbiome).Ice(player1, player2);
      } else if (currentbiome instanceof Swamp) {
        ((Swamp) currentbiome).muddy(player1, player2);
      } else if (currentbiome instanceof Rainforest) {
        ((Rainforest) currentbiome).Rain(player1, player2);
      } else if (currentbiome instanceof Savannah) {
        ((Savannah) currentbiome).Dehydration(player1, player2);
      }


      // loops through player 1 then player 2
      for (int i = 0; i <= 1; i++) {

        System.out.println("\n----------------------------------");

        int opp;
        if (i == 0) {
          opp = 1;
        } else {
          opp = 0;
        }

        //display attacks for players
        System.out.println("");
        if (players[i] instanceof Gorilla) {
          displayAttack((Gorilla) players[i]);
        } else if (players[i] instanceof Crocodile) {
          displayAttack((Crocodile) players[i]);
        } else if (players[i] instanceof Ape) {
          displayAttack((Ape) players[i]);
        } else if (players[i] instanceof Lion) {
          displayAttack((Lion) players[i]);
        } else if (players[i] instanceof PolarBear) {
          displayAttack((PolarBear) players[i]);
        } else if (players[i] instanceof PoisonDart) {
          displayAttack((PoisonDart) players[i]);
        } else if (players[i] instanceof Frog) {
          displayAttack((Frog) players[i]);
        }
        System.out.println("Run (type: 'run' to most likely change the biome) ");
        
        System.out.println("\n" + players[i].getName() + " choose attack(type number):");
        String attack = userin.nextLine();

        if(attack.equals("run")){
          b_index = selectBiome();
          currentbiome = biomes[b_index];
          player1.updateBiome(currentbiome);
          player2.updateBiome(currentbiome);
          System.out.println("\n" + currentbiome + "\n");
        
        }
        else if (players[i] instanceof Gorilla) {
          if (attack.equals("1")) {
            ((Gorilla) players[i]).screach(players[opp]);
          } else if (attack.equals("2")) {
            ((Gorilla) players[i]).punch(players[opp]);
          } else if (attack.equals("3")) {
            ((Gorilla) players[i]).bananaToss(players[opp]);
          } else if (attack.equals("4")) {
            ((Gorilla) players[i]).chestThump(players[opp]);
          } else if (attack.equals("5")) {
            ((Gorilla) players[i]).climb(players[opp]);
          }
        }else if (players[i] instanceof Ape) {
          if (attack.equals("1")) {
            ((Ape) players[i]).screach(players[opp]);
          } else if (attack.equals("2")) {
            ((Ape) players[i]).punch(players[opp]);
          } else if (attack.equals("3")) {
              ((Ape) players[i]).climb(players[opp]);
            }
        }else if (players[i] instanceof Lion) {
              if (attack.equals("1")) {
                ((Lion) players[i]).chomp(players[opp]);
              } else if (attack.equals("2")) {
                ((Lion) players[i]).roar(players[opp]);
              } else if (attack.equals("3")) {
                ((Lion) players[i]).pounce(players[opp]);
              }
        } else if (players[i] instanceof PolarBear) {
              if (attack.equals("1")) {
                //overloaded method
                if(players[opp] instanceof Frog){
                  ((PolarBear) players[i]).munch((Frog)players[opp]);
                }else{
                  ((PolarBear) players[i]).munch(players[opp]);
                }
                
              } else if (attack.equals("2")) {
                ((PolarBear) players[i]).hug(players[opp]);
              } else if (attack.equals("3")) {
                 ((PolarBear) players[i]).claw(players[opp]);
              }
        } else if (players[i] instanceof Crocodile) {
              if (attack.equals("1")) {
                ((Crocodile) players[i]).Bite(players[opp]);
              } else if (attack.equals("2")) {
                ((Crocodile) players[i]).DeathRoll(players[opp]);
              } else if (attack.equals("3")) {
                ((Crocodile) players[i]).Drown(players[opp]);
              } else if (attack.equals("4")) {
                ((Crocodile) players[i]).TailWhip(players[opp]);
              }
        } else if (players[i] instanceof PoisonDart) {
              if (attack.equals("1")) {
                ((PoisonDart) players[i]).poison(players[opp]);
              }
        } else if (players[i] instanceof Frog) {
                if (attack.equals("1")) {
                ((Frog) players[i]).suicide(players[opp]);
                }
          }

      }

      // display user hp
      System.out.println("\n----------------------------------\n");
      System.out.println(player1.getName() + " HP: " + player1.getHp());
      System.out.println(player2.getName() + " HP: " + player2.getHp());
      System.out.println("");

      // update variable that is checked in the while loop
      p1HPcheck = player1.getHp().compareTo(new BigInteger("0"));
      p2HPcheck = player2.getHp().compareTo(new BigInteger("0"));
      
    }

    System.out.println("----------------------------------\n");
    //ending messages
    if(p1HPcheck <= 0 && p2HPcheck <= 0){
      System.out.println("You guys both died, a spectacular battle!");
    }
    else if(p1HPcheck <= 0){
      System.out.println(player2.getName() + " took the upper hand this time. Well fought.");
    }
    else if(p2HPcheck <= 0){
      System.out.println(player1.getName() + " took the upper hand this time. Well fought.");
    }

    System.out.println("\nThanks for playing.");
    
  }
}

