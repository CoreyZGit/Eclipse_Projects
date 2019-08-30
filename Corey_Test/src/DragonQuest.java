import java.util.Random;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragonQuest {	
	
	Scanner inputstatus = new Scanner(System.in);
			
		int silver = 10;
		int hp = 5;
		int shield = 0;
		int sword =  0;
		int potionwizard = 1;
		int daggerwizard = 2;
		int islandsword = 0;
		int level = 0;
		int dragonlevel = 0;
		int userclass = 0;
		int attack = 0;
		int dragonattack = 0;
			
	
	
		public void Begin() {
	
	System.out.println("You proceed out the front gate where you are met with two paths and an elven wizard by the gate.(Choose the corresponding number.)\n"
			 + "(1)Head north\n(2)Head East\n(3)Talk to the wizard");

		int choice1 = inputstatus.nextInt();
		
		switch (choice1) {

		case 1:
	
			System.out.println("You head north.");

			this.HeadNorth();
			break;

		case 2:
	
			System.out.println("You head east.");

			this.HeadEast();
			break;

		case 3:			
				
			this.Wizard1();

			break;
		}	
}

	
	
	
	
	
	
	
	
	

	
	
	
	public void Wizard1() {		
		
		if(potionwizard == 1) {
		
		System.out.println("You talk to the wizard.\n"
				 		  +"I have a potion for sale, it will increase your life force by 1.  May interest you in this potion for a fair price of 10 silver?\n"
				 		  +"(1)yes\n(2)no\n");							
		
		int choice2 = inputstatus.nextInt();
		
		switch(choice2) {

		case 1:
			
			if(silver >= 10) {
				potionwizard = potionwizard - 1;
				silver = silver - 10;
				hp++;
				
				System.out.println("You now have " + silver + " silver left and " + hp +" hp!" );		
				this.Gate();
			
			}else {
				System.out.println("You don't have enough silver.");
				this.Gate();
			}
		break;
		
		case 2:
				this.Gate();			
		
		break;		
		}
		}else{
			
			System.out.println("If your looking for another potion you just bought my last one, safe travels kind sir!");
			this.Gate();
				
			
		}
		
		
	
	
	}
		
	
public void Gate() {
		
		System.out.println("Choose your path.\n"
				 + "(1)Head north\n(2)Head East\n(3)Talk to the wizard.");

			int choice1 = inputstatus.nextInt();
			
			switch (choice1) {

			case 1:
		
				System.out.println("You head north.");

				this.HeadNorth();
				break;

			case 2:
		
				System.out.println("You head east.");

				this.HeadEast();
				break;

			case 3:			
					
				this.Wizard1();

				break;
			}	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void HeadNorth() {
		
				System.out.println("You come to a fork in the road. According to the sign at the fork, one path leads to the Lightview Lake while the other to the Cave of Darkness.\n"
						 		 + "Choose a path\n"
						 		 + "(1)Head to the Cave\n(2)Head to the Lake\n(3)Head back");
		
		int choice4 = inputstatus.nextInt();
		
		switch(choice4) {
		
		case 1:
				System.out.println("You come to the cave enterance, it is very dark.\n"
							     + "What do you do next?\n"
								 + "(1)Enter the cave.\n(2)Turn around.");
								
				int choice5 = inputstatus.nextInt();
				
				if(choice5 == 1 && shield == 0) {
					System.out.println("You perish in the darkness.  Game over!");
								
				}else if(choice5 == 1 && shield == 2) {
					System.out.println("You enter the Cave of Darkness and your path is illuminated by the Sheild of Light.");
					this.Cave1();
					
				}else if(choice5 == 2) {
					System.out.println("You decide to head back to the fork.");
					this.Fork();
					
				}
			
		break;	
		
		case 2:
				this.Lake();
				
		break;	
		
		case 3:
				this.Gate();
		
		break;		
		}
	}
	
	
	
	
	

	
	
	
	
	
	
	public void HeadEast() {	

		System.out.println("You proceed down the eastern path until you come across the ruins of an ancient temple.  An elven wizard stands by the entrance\n"
						 + "What do you do?\n"
						 + "(1)Enter the temple.\n(2)Talk to the wizard.(3)Turn back.");
		
		int choice12 = inputstatus.nextInt();
		
		switch(choice12) {
		
		
		case 1:
			System.out.println("You enter the ancient temple.");
				this.Temple();
			
		break;
		
		case 2:
			
			if(daggerwizard == 2) {
			
			System.out.println("Within this temple lies a great tresure.  One would be foolish to enter unarmed, may I interest you in this magic dagger for a mere 5 silver\n"
							 + "(1)Buy dagger.\n(2)Enter Temple.\n(3)Head Back.");
			
			int choice13 = inputstatus.nextInt();
			
			switch(choice13) {
		
			case 1:
			
				if(silver >= 5) {
				silver = silver - 5;
				daggerwizard = daggerwizard - 1; 
				sword++;
				System.out.println("You buy the dagger and enter the temple.");
				this.Temple();
			
				}else {	
					System.out.println("You don't have enough silver to buy the dagger, you enter the temple anyway.");	
				this.Temple();								
				}
				break;			
		
			case 2: 
					
				
				this.Temple();
			
			break;		
		
					
			case 3:
					System.out.println("You head back to the village gate.");
				    this.Gate();
				    
			break;	    
			}
			}else if(daggerwizard == 1) {
				
				System.out.println("Unfortunatley I have nothing left to sell you, thank you for destroying the demon.  For that I shall give you my blessing and your money back.\n"
								 + "The wizard casts a spell on you that increases your defense.");
				hp = hp + 1;
				silver = silver + 5;
				daggerwizard = daggerwizard - 1;
				
			}else {
				
				System.out.println("I can't not help you any further, I advise you to go back where you came from\n"
							     + "You head back to the village.");
				
				this.Gate();
				
				
				
			break;	
				
			}
			
		case 3:
			this.Gate();
		
			break;
		}	
		
			
			
			
			
		
		
}
	
	
	
	
	
	
	
	public void Cave1() {
		
		System.out.println("As you continue foward you are met with a mysterious bard playing a lute.\n"
				        +  "What do you do?\n"
				        +  "(1)Continue foward\n(2)Approach the bard");
		
		int choice16 = inputstatus.nextInt();
		
		switch(choice16) {
		
		case 1:
			
			this.Cave2();
			
			break;
			
		case 2:	
			
			System.out.println("I have been lost in darkness since I entered this cave in search of a great treasure which sadly, I have given up on. When i'm out of here I hope to buy residence in the village\n"
			                 +  "May I exchange my services for 10 silver?, I can give to you the strength of a dragonborn.\n"
			                 +  "(1)Yes\n(2)No");	
			
			int choice17 = inputstatus.nextInt();
			
			
			
			switch(choice17) {
			
			case 1:
				
				if(silver >= 10) {
				
				System.out.println("The bard plays a magic song that strengthens you bones and revitalizes the soul.");
				hp = hp + 1;
				shield = shield + 1;
				silver = silver - 10;
				this.Cave2();
				
				}else {
					
				System.out.println("I can't provide my services if you do not have the silver!");	
				System.out.println("You continue foward disregarding the bard.");
				this.Cave2();	
								
				}
				
			break;
				
			case 2:
				
				System.out.println("You continue foward disregarding the bard.");
				this.Cave2();
			
			break;	
				
			}		
			break;
		
		}
		
		
		
		
		
		
		
}	
	
	
	public void Cave2() {
		
		System.out.println("You arrive at an intersection, the route you are on continues foward, otherwise you can go left or right.  Which do you chose?\n"
						 + "(1)Continue Straight\n(2)Proceed left\n(3)Proceed right");		
			
		int choice19 = inputstatus.nextInt();	
				
		switch(choice19) {
		
		case 1:
			
		this.DragonStats();		
		
		break;
		
		case 2:
		
			Random pathrandom1 = new Random();						
			for(int counter =1; counter < 2; counter++ ) {
				
				int chosenpath = 1 + pathrandom1.nextInt(2);
				
				if (chosenpath == 1) {
					
					this.good();
				
				}else {
				
					this.bad();
				}				
				
			}
		
			break;
	    
		case 3:
			
	    	Random pathrandom2 = new Random();		
				
				int chosenpath = 1 + pathrandom2.nextInt(2);
	
			if (chosenpath == 1) {
				
				this.good();
			
			}else {
			
				this.bad();
						
			}		
			
			break;	
		}		
	
		}
		

	
	
	
	public void good() {
		
		System.out.println("You walk down the hall and eventually find yourself at a chest made of dragon scales.\n"
						 + "What do you do?\n"
						 + "(1)Open the chest\n(2)Return to the intersection");
	
		int choice20 = inputstatus.nextInt();
		
		switch(choice20) {
	
		case 1:
			
			System.out.println("You open the chest.  Inside you find a sword forged of dragon scale.  As you go to hilster your sword a Beholder appears from behind.  You have not choice but to fight in order to move on.\n"
							 + "What do you do?\n"
							 + "(1)Charge at the Beholder\n(2)Raise your shield in defense\n(3)Throw your sword");
							 
							 int choice21 = inputstatus.nextInt();		
							 
							 switch(choice21) {
							 
							 case 1:
							 
							System.out.println("You charge at the Beholder aggressively.  The battle is fought hard on both sides.  You emerge victorius but are severley injured.");
								
							hp = hp - 1;
							sword++;
							
							this.DragonStats();
							
							break;
							
							 case 2:
								 
							System.out.println("You take the defense as the Beholder approahces you.  It's one eyed gaze instantly paralyzes you.  You lose your defense and perish.  Game Over!");
							
							System.exit(0);
							
							break;
								 
							 case 3:	
								 
								 
							System.out.println("You throw your sword!");	 
							
							sword++;			
							hp = hp + 1;
														
							Random throwsword = new Random();
									
								int beholderhit = 1 + throwsword.nextInt(3);
								
								switch(beholderhit) {
								
								case 1:
									
									System.out.println("It strikes the Beholder right in it's eye and it instantly collapses dead.  You now then back to the cave intersection.");
									this.DragonStats();
									
									break;
									
								case 2:
									System.out.println("It strikes the Beholder right in the gut, but the Beholder is able to strike before in collapses and dies.\n"
											         + "Slightly weakened you return back to the cave intersection.");
									hp = hp - 1;
									this.DragonStats();
									
									break;
									
								case 3:	
									System.out.println("It misses by a longshot and the Beholder appraoches violently, no longer armed with your sword you perish at the hands of the Beholoder.\n"
											         + "Game Over!");
								System.exit(0);
								
									break;
								}
									break;
								}
							 
									 
		break;					 
		
		case 2:	
		
		this.DragonStats();
		
		break;
									
		
		}
	}
		

	
	
	
	
	
	public void bad() {
		
		System.out.println("You walk down the hall and eventually find yourself at a chest made of what looks to be human flesh and bone.\n"
				 + "What do you do?\n"
				 + "(1)Open the chest\n(2)Return to the intersection");
		
		int choice22 = inputstatus.nextInt();
		
		switch(choice22) {
		
		case 1:
			
			System.out.println("You open the chest and instantly a magic aura begins to glow around you.  Gasping for air your heart stops beating and you perish.  Game Over!");	
		
			System.exit(0);
			
			break;
			
		case 2: 
			
			this.DragonStats();			
			
			break;
			
		
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public void Fork() {
	
			System.out.println("You come to a fork in the road. According to the sign at the fork, one path leads to the Lightview Lake while the other to the Cave of Darkness.\n"
	 				         + "Choose a path\n"
	 				         + "(1)Head to the Cave\n(2)Head to the Lake\n(3)Head back to the village");
	
		int choice6 = inputstatus.nextInt();
		
		switch(choice6) {
		
		case 1:
				System.out.println("You come to the cave enterance, it is very dark.\n"
								 + "What do you do next?\n"
					             + "(1)Enter the cave.\n(2)Turn around.");
					
			int choice7 = inputstatus.nextInt();
	
			if(shield == 0) {
				System.out.println("You perish in the darkness.  Game over!");
				System.exit(0);
					
			}else if(shield == 1) {
				System.out.println("You enter the Cave of Darkness and your path is illuminated by the Sheild of Light.");
				this.Cave1();
		
			}else if(choice7 == 2) {
				System.out.println("You decide to head back to the fork.");
				this.Gate();
			}
			break;
			
		case 2:
				this.Lake();
			
			break;
			
		case 3:
				this.Gate();
				
			break;
				
	}
}
	
	
	
	
	
	
	
	
	
	
	
	public void Lake() {
		
		if(islandsword == 0) {
		
				System.out.println("You arrive at Lightview Lake, where water gleams with a blinding light, off in the distance you see an island within swimming distance, to your right there is canoe.\n"
								 + "How do you get to the island?\n"	
								 + "(1)Swim\n(2)Take the canoe\n(3)Turn around");
			
			
			int choice8 = inputstatus.nextInt();			
						
			switch(choice8) {
			
			case 1:
				System.out.println("You enter the water to find a powerful eletric shock immediatley passes through your body and you perish.\n"
						         + "Game Over!");
				System.exit(0);
				
				break;
			
			case 2: 
				System.out.println("You start heading towards the island with the canoe, you make it to the island safely.");
				this.Island();
				
				break;
								
			case 3:	
				System.out.println("You turn around.");
				this.Fork();
				
				break;
			}	
		
		}else {
			
			System.out.println("Upon returning back to shore, a sudden breeze sends the boat adrift.  If you desire to return to the island you now must swim.\n"
							 + "What do you do?\n(1)Swim back to the island\n(2)Return to the fork");
			
			int choice23 = inputstatus.nextInt();
			
			switch(choice23) {
			
			case 1:
				System.out.println("You enter the water to find a powerful eletric shock immediatley passes through your body and you perish.\n"
				         + "Game Over!");
				System.exit(0);
				
				break;
				
			case 2:
				
				System.out.println("You head back to the fork.");
				this.Fork();
			
				break;
			}
			
			
			
			
		}
			
	}	
			
		
	
	
	
	public void Island() {	
		
		
					System.out.println("You reach the island safely, before you lies a gold and silver chest, which do you open?\n"
								 + "(1)Gold\n(2)Silver\n");
				
				int choice9 = inputstatus.nextInt();
				
				switch(choice9) {
				
				case 1:
					System.out.println("You open the chest to find it is booby trapped, a ball of flame strikes you and takes away 1 hp.  At the bottom of the chest ther is a bit of silver. You gain 5 silver!"
									 + "What do you do next?\n"
									 + "(1)Open the other chest.\n(2)Go back.");
					hp = hp - 1;
					silver = silver + 5;
					islandsword++;
					
					int choice10 = inputstatus.nextInt();	
					switch(choice10) {
					
					case 1:
						System.out.println("You open the chest to find the 'Blade of Zorey' and head then head back to shore.");
						sword = sword + 2;	
						islandsword++;
						
						this.Lake();
						
					break;
					
					case 2:
						System.out.println("You head back to shore.");
						islandsword++;
						this.Lake();
						
					break;	
					
					}
							
				break;
					
				case 2:	
					System.out.println("You open the chest to find the 'Blade of Zorey' and head then head back to shore.");
				sword = sword + 2;	
				islandsword++;
				this.Lake();
				
				break;
				}		
			
		}
	
	
	
	public void Temple() {	
		
		
		if(shield == 1) {
			
			System.out.println("You enter the temple once again, the wizard from outside enters behind you and becomes outraged.  He screams, how dare you enter my place of sancutuary!\n"
					         + "In the blink of an eye he transforms into his true form of a Mind Flayer and instanly drives you mad.  You perish.  Gamer Over! ");
			
			System.exit(0);
			
		}
		
		else {
		System.out.println("Within the temple you see a magic shield pinned up against the wall.  The floor is chess board pattern of silver and gold tiles.  How do you approach the sheild?\n"
						 + "(1)Proceed across on only gold tiles\n(2)Proceed across on only silver tiles\n(3)Sprint across to the shield\n(4)Step lightly and slowly approach the shield");
		
				int choice14 = inputstatus.nextInt();
		
				switch (choice14) {

				case 1:
			
					System.out.println("Right as you place your foot on the first gold tile, arrows begin to fire from the walls and you are forced to sprint across.  You lose one hp!");
					hp = hp - 1;
					this.Sheild();
					
					break;

				case 2:
			
					System.out.println("Right as you place your foot on the first silver tile, flame begins to shoot from the celing and you are forced to sprint across.  You lose two hp!");
					hp = hp - 2;
					this.Sheild();
					break;

				case 3:			
					
					System.out.println("You choose to sprint across the floor, instantly fire spouts from the celing and arrows shoot from the walls.  You sprint fast enough to dodge the trap and take no damage!");;
					this.Sheild();
					break;
					
				case 4:
					
					System.out.println("You choose to step lightly, instantly fire spouts from the celing and arrows shoot from the walls.  You were not fast enough to dodge the trap and therefore perish.\n"
									 + "Game Over!");
					System.exit(0);
					break;
										
					
				}	
		}
		}
		
	
				


	public void Sheild() {
		
				shield = shield + 2;
		
		System.out.println("You arrive at the shield to see that it is the 'Sheild of Light.' As you grab the shield it illuminates the entire room and reveals a demon standing by the entrace.\n"
						+  "You must defeat the demon before you can exit the temple.\n");
				
				if(sword == 1) {
					
					System.out.println("You possess a dagger and shield and am able to fight the demon.  What do you do?\n"
							 		+  "(1)Throw the dagger at the demon\n(2)Sprint towards the demon and attack with sheild and dagger equipped.\n(3)Let the demon appraoch you with sheild and dagger ready.");
			

					int choice15 = inputstatus.nextInt();

					switch (choice15) {

					case 1:
				
						System.out.println("You throw the dagger at the demon.");
						
						Random throwdagger = new Random();
						
						
						for(int counter =1; counter < 2; counter++ ) {
							int demonhit = 1 + throwdagger.nextInt(3);
							
							switch(demonhit) {
							
							case 1:
								
								System.out.println("It strikes the demon right in the heart, and it instantly collapses dead.  You now exit the temple and head back to the village Gate");
								this.Gate();
								
							break;
							
							case 2:
								System.out.println("It strikes the demon right in the gut, but the demon is able to strike before in collapses and dies.  You lose one hp!\n"
										         + "Slightly weakened you exit the temple and head back to the village gate.");
								hp = hp - 1;
								this.Gate();
							break;
							
							case 3:	
								System.out.println("It misses by a longshot and the demon appraoches violently, no longer armed with the dagger you perish at the hands of the demon.\n"
										         + "Game Over!");
							System.exit(0);
							
							break;
							}
							
						}
						
						break;
						
					case 2:
				
						System.out.println("You bolt towards the demon and attack aggressively, the demon not excpecting your rage is defeated quickly although it was able to wound you.  You lose one hp!\n"
								        +  "You proceed out of the temple and back to the village gate");
						hp = hp - 2;
						this.Gate();
						break;

					case 3:			
						
						System.out.println("You hold your postion and let the demon approach you.  The demon bolts towards you and you have no choice but to fight back.  You defeat the demon but are severly wounded.\n"
										+  "You lose 2 hp!  Weary from battle you exit the temple and head back to the village gate.");
						this.Sheild();
						break;					
					}
				}else if(sword >= 2) {
					
					System.out.println("You possess both the 'Sword of Zorey' and the 'Sheild of Light.'  Being fully equipped you defeat the demon with ease, exit the temple and head back to the village gate.");
					 		
					this.Gate();								
					
				}else{
					System.out.println("You only posess the 'Shield of Light.' Although the light from the shield weakens the demon you are not equipped enough to defend yourself.  You perish."
					                 + "Game Over!");
					System.exit(0);
				}
					
					
				}
		
		
	public void DragonStats() {
		
			System.out.println("Upon returning back to the cave intersection you suddenly hear a loud shriek eminating from the path ahead.  The roar is so load that the cave begins crumble.\n"
							 + "Forced to continue forward, you start to sprint until you find yourself at the dragons nest within a vast mountian range. With no way back Tthe time has come to face the dragon!");
							
			System.out.println();
			System.out.println("From the trials that have preceeded this moment your stats are as follows.");
			System.out.println();
		
			
			int Stats[] = {hp, shield, sword,};
			System.out.println("Hit Points = " + Stats[0]); 
			System.out.println("Shield = " + Stats[1]);
			System.out.println("Sword = " + Stats[2]);
			System.out.println("Silver = " + silver);
			System.out.println();
			
			for(int counter = 0; counter < Stats.length; counter++) {
				
				level += Stats[counter];
			
				
			}
				
			if 	(shield == sword) {
				
				userclass += 1;
				System.out.println("This makes you a level " + level + " Ranger a very well rounded class.");
				
				
			}
			
			else if (shield > sword) {
				
				userclass += 2;
				System.out.println("This makes you a level " + level + " Cleric a very defensesive type class.");
				
				
			}
			
			else if (shield < sword) {
				
				userclass += 3;
				System.out.println("This makes you a level " + level + " Paladin a true swordsman based class.");
				
			}
			
			Random dragonrand = new Random();
		
				int dragonsum = 1 + dragonrand.nextInt(5);
				
				switch(dragonsum) {
				
				case 1:
					
					dragonlevel += 16;
					
					break;
														
				case 2:
				
					dragonlevel += 17;
					
					break;
					
										
				case 3:	
				
					dragonlevel += 18;
					
					break;
					
									
				case 4:	
					
					 dragonlevel += 19;
					 
					 break;
					
						
				case 5:
					
					dragonlevel += 20;
					
					break;
					
																			
				}
				
				
				inputstatus.nextLine();		
				this.DragonBattle();
	}

	
	
	
	
	
	
	public void DragonBattle() {
		
		System.out.println("From up above the Dragon approaches violently. It's roar so loud brings you to the brink of deafness and you are overwhelmed with fear!");
		
		int battleodds;
		
		battleodds = dragonlevel - level;
		
		if(battleodds >= 14 ) {
			
		System.out.println("Upon the first breath of fire the dragon breaths, you are instantly burnt to a crisp.  You were not ready to fight the dragon and therefore perish.  Game Over!");	
		
		System.exit(0);
		
		}else if (battleodds <= 14 && battleodds > 6) {
		
		attack = 3;
		dragonattack = 4;	
		this.dragonAttack();
						
			
		}else if (battleodds < 6) {
			
			
		attack = 4;
		dragonattack = 3;
		this.dragonAttack();
		
			
		}else{
			
		System.out.println("This program is bugged, You perish and game over!");
		
		System.exit(0);		
			
		}			
		
	}
		
	
	public void dragonAttack() {
	
	int finaldamage = 0;
	int counter = 1;	
	Random damage = new Random();
	for(counter = 1; counter <= dragonattack; counter++) {
		
		int damagetaken = 1 + damage.nextInt(userclass);
		
		finaldamage += damagetaken;
		
	
	}
	
		finaldamage = hp - finaldamage;
		
		if(hp <= 0) {
			
		System.out.println("The fight is easy for the dragon as scorches you and then swallows you whole.  You perish.  Game Over!");	
		System.exit(0);	
		
		}
		
		else if(hp > 0){
			
		System.out.println("One by one you dodge the dragons attack and then your memont comes! (Press Enter)");	
		inputstatus.nextLine();
		this.yourAttack();
			
		}
	
		
		
	}
	
	
	public void yourAttack() {
		
		int finaldamage = 0;
		int counter = 1;	
		Random damage = new Random();
		for(counter = 1; counter <= attack; counter++) {
			
			int damagetaken = 1 + damage.nextInt(userclass * 3);
	
		finaldamage += damagetaken;
		
	}
		
		finaldamage = dragonlevel - finaldamage;


	if(dragonlevel <= 0) {
		
		System.out.println("The battle is fought long and hard until you emerge victorious.");
		
		System.setProperty("webdriver.chrome.driver", "c:\\Users\\ZUser\\Desktop\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/watch?v=1APaV2hrpYE");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#movie_player > div.ytp-chrome-bottom > div.ytp-chrome-controls > div.ytp-right-controls > button.ytp-fullscreen-button.ytp-button")).click();
		
	}else if(dragonlevel > 0) {
		
		System.out.println("The battle is fought long and hard and you injure the dragon that it retreats.  As you see it fly away you notice it is headed right to the village.  Follow the dragon and finish the battle that was started.");
		
	}
	
	
	
}	
	
	

}





















	
	
