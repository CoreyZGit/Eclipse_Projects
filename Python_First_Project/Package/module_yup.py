'''
Created on Aug 10, 2019

@author: ZUser
'''
import random

name = raw_input("Please enter your name.\n")
type(name)

print("\nYou awake naked and in a haze of confusion. The door before you is comprised of glass and held together by a plasma like substance you have never seen before.\n" +
        "Suddenly the door opens and you come to the realization that you are being contained by a creature from realms of space.  PRESS ENTER")

choice = raw_input()
type(choice)

print("As you step out of the pod you were contained in you evaluate the situation.  You have no recollection of how you ended up here.\n" +  
      "Your friends, family, and entire world seem non-existent.  Comprised of a plasma like glass, a window is presented before you.\n" + 
      "You look out to see the empty void of space but notice a star in the distance with a pale blue dot crossing over it. PRESS ENTER")

choice = raw_input()
type(choice)

print("You turn around and notice a compartment has opened behind.  Within the container lies your clothing and what appears to be an alien blaster,\n" +
      "a plasma grenade, a plasma sword, and plasma shield.  What weapons do you choose for the path ahead?  INPUT CORRESPONDING NUMBER AND PRESS ENTER\n" +
      "1.)Alien Blaster and Plasma Grenade\n" +
      "2.)Plasma Sword and Plasma Shield\n")

choice = raw_input()
type(choice)

def attack_type(weapon):
    
    global attack
    global defense
    global ammo
    global health
    global grenades
         
    if weapon == "1":
             
        attack = 3
        defense = 1
        ammo = 5
        health = 8
        grenades = 1
        print("You choose the Alien Blaster and Plasma Grenade.  Your fighting style is a more offensive.\n")       
            
    elif weapon == "2":
        attack = 2
        defense = 3
        ammo = 20
        health = 10  
        grenades = 0  
        print("You choose the Plasma Sword and Plasma Shield.  Your fighting style is more defensive.\n")        
        
    else:         
        print("Invalid input, please choose the corresponding number and press enter.\n")
        choice = raw_input()
        type(choice)
        attack_type(choice)
             
attack_type(choice)

print(attack)
print(defense)
print(ammo)
print(health)
print(grenades)

print("\n")

print("After choosing your weapons you turn to the door that has you locked in the room.  There is a terminal displaying alien markings you can't understand.\n" +
      "There seems to be some combination of alien letters that will open the door before you.  You must unlock the door.  What do you do?\n" +
      "1.)Attempt to use the terminal\n" +
      "2.)Destroy the terminal\n")

counter = 0
choice = raw_input()
type(choice)

def puzzle_1(rand_set):
     
    global counter
                   
    choice = raw_input()
    type(choice)
    
    try:
        
        choice = int(choice)
        
    except:
        
        print("Invalid Input!") 
        puzzle_1(rand_set)   
    
    if (choice == rand_set[0] or choice == rand_set[1] or choice == rand_set[2] or choice == rand_set[3] or choice == rand_set[4] or
        choice == rand_set[5] or choice == rand_set[6] or choice == rand_set[7] or choice == rand_set[8] or choice == rand_set[9]):
        
        counter = 0
            
    elif counter == 10:
        
        pass
                    
    else:
                
        counter = counter + 1
        print("GUESS AGAIN\n")
        puzzle_1(rand_set)     
    
def terminal_1(first_choice):
    
    global counter
        
    if first_choice == "1":
        
        print("You attempt to unlock the door with the alien terminal. You start mashing buttons at random.\n" +
              "GUESS A NUMBER FROM 1 TO 100 AND PRESS ENTER\n")
                
        print("\n")
        
        rand_set = range(10)
       
        for x in rand_set:
            rand_set[x] = random.randint(1, 101)
            
        puzzle_1(rand_set)
        
        if counter == 0:
            
            print("Somehow without understanding the alien hieroglyphics you are able to hack the terminal.  The door opens before you!  PRESS ENTER\n")           
                
        elif counter == 10:
                
            print("After several minutes of button mashing the terminal starts to speak to you in a sporadic alien dialect.  It suddenly blows up and you are set on fire.\n" +
                   "As you roll on the ground in agonizing pain, the door opens before you.  TAKE 4 DAMAGE.  PRESS ENTER\n")
             
            health - 4
            
                              
    elif first_choice == "2":
        
        print("You attack the terminal, letting out the pent up aggression you have because of the situation at hand.  The terminal malfunctions and explodes.\n" +
              "As the door before you opens, you are thrown back and take some shrapnel to the face.  TAKE 2 DAMAGE AND LOSE 2 AMMO.  PRESS ENTER\n")
        
        health - 2
        ammo - 2
        
        
    
    else:
        
        print("Invalid input, please choose the corresponding number and press enter.\n")
        choice = raw_input()
        type(choice)
        terminal_1(choice)
    
terminal_1(choice)
    
choice = raw_input()
type(choice)
    
print("On the other side of the door reveals a rectangular room with a door on each wall.  You hear a humanly shriek as the door at the far end of the swings open.\n" +
      "Out comes an extra-terrestrial being that starts to approach you aggressively.  It certainly does not look friendly and you must fight!  PRESS ENTER\n")

choice = raw_input()
type(choice)
 

def enemy(enemy_type, enemy_hp, enemy_attack, enemy_range):
    
    global attack
    global defense
    global health
    global grenades
           
    if enemy_type == True:
    # Then offensive enemy. 
        if defense == 1:
            
            print("The enemy starts to sprint towards you.  You are able to fire off some shots before the enemy gets to you. PRESS ENTER\n")  
           
            hit_numbers = range(3)
           
            for hit in hit_numbers:
                hit_numbers[hit] = random.randint(1, 10)
            
            choice = raw_input()
            type(choice)
            
            enemy_approach(enemy_hp, enemy_attack, enemy_range, hit_numbers)
                    
            
        elif defense == 2:
            
            print("The enemy starts to sprint towards you.  You ready your sword for the first strike. CHOOSE A NUMBER FROM 1 TO 5\n")
        
            for hit in hit_numbers:
                hit_numbers[hit] = random.randint(1, 6)
                
            print(hit_numbers)
            
            choice = raw_input()
            type(choice)
            choice = int(choice)
               
                
           
    elif enemy_type == False:
       
        pass
        
    # Then defensive enemy      
     
def enemy_approach(enemy_hp, enemy_attack, number_attacks, hit_numbers):
    
    global health    
       
    if number_attacks != 0:
        
        print("CHOOSE A NUMBER FROM 1 TO 10\n")
        choice = raw_input()
        type(choice)
        
        try:
            
            choice = int(choice) 
        
        except:
         
            print("Invalid Input!") 
            enemy_approach(enemy_hp, enemy_attack, number_attacks, hit_numbers)   
            
        
        number_attacks = number_attacks - 1
        
        if choice == hit_numbers[0] or choice == hit_numbers[1] or choice == hit_numbers[2]: 
               
            damage = random.randint(1, attack)
            enemy_hp = enemy_hp - damage         
            print("You inflict " + str(damage) + " to your foe! PRESS ENTER\n")
                
            choice = raw_input()
            type(choice)
                
            if enemy_hp > 0:
                                        
                enemy_approach(enemy_hp, enemy_attack, number_attacks, hit_numbers)                      
                
            elif enemy_hp <= 0:  

                print("You have defeated the alien menace! PRESS ENTER")
                    
                choice = raw_input()
                type(choice)                              
        
        else:
                    
            enemy_approach(enemy_hp, enemy_attack, number_attacks, hit_numbers)                      
    else:
            
        print("Your foe reaches you and attacks with its plasma sword.  TAKE 1 DAMAGE.  PRESS ENTER\n")
    
        health = health - 1
    
        choice = raw_input()
        type(choice)
            
        enemy_engaged_blaster(enemy_hp, enemy_attack)
        
           
     
def enemy_engaged_blaster(enemy_hp, enemy_attack):   

    global damage
    global health
    global attack
    global defense
  
    print("You fight back with your blaster.  At such close range there is no chance of missing and you inflict major damage. PRESS ENTER\n")

    enemy_hp = enemy_hp - attack
    
    choice = raw_input()
    type(choice)
    
    if enemy_hp <= 0:
        
        print("Your enemy has fallen!  PRESS ENTER")
                
        choice = raw_input()
        type(choice)
                 
    else:
                
        damage = random.randint(1, enemy_attack)
        damage = damage - defense
        
        health = health - damage    
                        
        print("Your foe attacks you back for " + str(damage) + " damage. PRESS ENTER")
        
        choice = raw_input()
        type(choice)
                
        if health > 0:
                
            basic_battle(enemy_hp, enemy_attack)
   
        else:

            
            print("Your foe has greatly weakened you and you are unable to fight back.  As you slowly lose consciousness you find yourself\n" +
                  "being placed back in the pod you had escaped from.  All hope is lost.  GAME OVER")
             
            exit()

        
def basic_battle(enemy_hp, enemy_attack):
    
    global health
    global defense
    global attack
    global ammo
    
    if enemy_hp >= 0 and health >= 0:               
                  
        damage = random.randint(1, attack)
        enemy_hp = enemy_hp - damage
        ammo = ammo - 1
        print("You fight back for " + str(damage) + " points of damage PRESS ENTER\n")
    
        choice = raw_input()
        type(choice)
    
        damage = random.randint(1, enemy_attack)
        damage = damage-defense
        
        if damage <= 0:
            
            damage = 0
        
        health = health - damage
        print("The alien menace fights back for " + str(damage) + " points of damage.\n")
        
        if ammo == 5:
            
            choice = raw_input()
            type(choice)
            
            print("Your alien blaster starts to beep intensely!  PRESS ENTER\n")
    
        basic_battle(enemy_hp, enemy_attack)
        
        if ammo == 0:
            
            choice = raw_input()
            type(choice)
            
            print("You try to fire back at your enemy but as you pull the trigger nothing happens.  You have run out of ammo!  PRESS ENTER")
    
            choice = raw_input()
            type(choice)
            
            print("You try to retreat but the alien swine grabs you bites you viciously.  As you slowly lose consciousness you find yourself\n" +
                  "being placed back in the pod you had escaped from.  All hope is lost.  GAME OVER")
            
            exit()
        
    else:
        
        if health <= 0:
            
            print("Your foe has greatly weakened you and you are unable to fight back.  As you slowly lose consciousness you find yourself\n" +
                  "being placed back in the pod you had escaped from.  All hope is lost.  GAME OVER")
             
            exit()
    
        elif enemy_hp <= 0:            
    
            choice = raw_input()
            type(choice)
    
enemy(True, 6, 3, 3)    
    
print("Suddenly the alien creature begins cry out with a bone shattering yelp.  As your enemy falls to the floor dead, you are overcome with fear. PRESS ENTER\n")  

  
choice = raw_input()
type(choice)
    
print("You observe the alien remains.  It looks slightly familiar, like the big grey headed humanoids in folklore, except muscular and with gigantic blood red eyes.\n" + 
      "As it bleeds a green boiling ooze from its wounds you contemplate searching through the flesh like sacks strapped to it's waist side. PRESS ENTER\n")    

choice = raw_input()
type(choice)
        
        
def rand_color():
    
    rand_color = random.randint(1, 4)
    
    if rand_color == 1:
    
        rand_color = "blue"
        return rand_color
        
    elif rand_color == 2:
    
        rand_color = "yellow"
        return rand_color
        
    elif rand_color == 3:
    
        rand_color = "red"
        return rand_color
        
    elif rand_color == 4:
    
        rand_color = "green"
        return rand_color    
        
        
def search():
    
    global health
    global grenades
    global attack
    global defense
    global ammo
       
    print("Do you search the alien corpse before you?\n" +
          "1.)YES\n" +
          "2.)NO\n")
    
    choice = raw_input()
    type(choice)
    
    if choice == "1":
        
        search_rand = random.randint(1, 7)    
        search_rand = 3
        print("You search the alien creature.  PRESS ENTER\n")
        
        choice = raw_input()
        type(choice)
        
        if search_rand == 1:
            
            print("You find a plasma grenade. PRESS ENTER\n")
            grenades = grenades + 1
            choice = raw_input()
            type(choice)
                            
        elif search_rand == 2:
            
            print("You find a health pack. PRESS ENTER\n")
            health = health + 3
            choice = raw_input()
            type(choice)     
            
        elif search_rand == 3:              
                        
            print("Within one of the sacks you find a small vial of mysterious " + rand_color() + " liquid.  Do you drink the liquid\n" +
                  "1.)YES\n" +
                  "2.)NO \n")
            
            choice = raw_input()
            type(choice)
            
            try:
                
                choice = int(choice)
                
            except:
                  
                print("You decide not to drink the liquid and move on.  PRESS ENTER\n")    
                choice = raw_input() 
                type(choice)                
            
            if choice == 1:    
                
                search_rand = random.randint(1, 2)     
                
                if search_rand == 1:
                    
                    print("You drink from the vial and feel invigorated with strength. (GAIN +1 ATTACK) PRESS ENTER \n")
                    attack = attack + 1
                    choice = raw_input()
                    type(choice)
                    
                    
                elif search_rand == 2:
                    
                    print("You drink from the vial and feel invigorated with strength. (GAIN +1 DEFENSE) PRESS ENTER \n")   
                    defense = defense + 1
                    choice = raw_input() 
                    type(choice)
                
            else:
                
                print("You decide not to drink the liquid and move on.  PRESS ENTER\n")    
                choice = raw_input() 
                type(choice)                
            
        elif search_rand == 4:                        
            
            print("Within one of the sacks you find a small vial of mysterious " + rand_color + " liquid.  Do you drink the liquid\n" +
                  "1.)YES\n" +
                  "2.)NO \n")            
            
            choice = raw_input()
            type(choice)
            
            try:
                
                choice = int(choice)
                
            except:
                  
                print("You decide not to drink the liquid and move on.  PRESS ENTER\n")    
                choice = raw_input() 
                type(choice)                
            
            if choice == 1:    
                
                search_rand = random.randint(1, 2)     
                
                if search_rand == 1:

                    print("You drink from the vial and soon after a feeling of sickness comes over you. (-1 Defense -1 Attack) PRESS ENTER\n")
                    defense = defense -1
                    attack = attack - 1
                    choice = raw_input() 
                    type(choice)   

                    
                elif search_rand == 2:
                    
                    print("You drink from the vial and soon after a feeling of sickness comes over you. (-1 Defense -1 Attack) PRESS ENTER\n")
                    defense = defense -1
                    attack = attack - 1
                    health = health - 1
                    choice = raw_input()
                    type(choice)

                    
                    if health <= 0:
                        
                        print("You start to feel a burn within your stomach followed by intense pain that consumes your entire body" + 
                              "Un-controllobly you start vomiting as blood pours out of your eyes and ears.  The alien liquid has poisoned you. You die in agony! GAME OVER\n")
                        
                        exit()
      
            else:
                
                print("You decide not to drink the liquid and move on.  PRESS ENTER\n")    
                choice = raw_input() 
                type(choice)             
            
            
            
        elif search_rand == 5:
            
            print("As you reach into the alien sack, the corpse begins to disintegrate.  The heat burns your skin as the corpse dissipates into ash. (TAKE ONE DAMAGE) PRESS ENTER\n")   
            health = health - 1
            choice = raw_input()
            type(choice)
             
            if health <= 0:
                 
                print("In your weakened state the burns are to much to bear.  You perish on the spot!\n")
                exit()
            
        elif search_rand == 6:    
            
            print("You find nothing useful in your search.  PRESS ENTER")
            choice = raw_input()
            type(choice)
            
            
        elif search_rand == 7: 
            
            print("As you reach into the alien sack, the corpse begins to disintegrate.  You see your weapon start of glow sporadically and takes damage. (LOSE 3 AMMO) PRESS ENTER\n")
            ammo = ammo - 3
            
            
    elif choice == "2":
        
        print("You decide to forgo searching the alien corpse. PRESS ENTER\n")
        
        choice = raw_input()
        type(choice)

    else:
        
        print("Invalid Input!\n")
        search()

search()






    