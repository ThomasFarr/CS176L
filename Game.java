package cs176;

import java.util.Scanner; 
import java.util.Random; 

public class Game {
			static Scanner input; 
			public static void hangman() 
			{ 
				input = new Scanner(System.in); 

				String[] Animals = {"Hippopatamus", "Tiger", "Dolphin", "Komodo Dragon", "Dog", "Elephant"}; 
				
				System.out.println("	Welcome to Hang-Man"); 

				Random obj = new Random(); 
				int Ran_num = obj.nextInt(6); 

				String word = (Animals[Ran_num]); 
				word = word.toUpperCase(); 

				String word1 = word.replaceAll("[A-Z]", "_ "); 

				System.out.println("	let's play the game"); 
				System.out.println("------------------------------------");
				startGame(word, word1); 
			} 
	
			public static void startGame(String word, String word1) { 
				final int MAXWRONG = 6;
				int guessCount = 0; 
				int wrong = 0; 
				String guess; 
				char letter; 
				boolean guessescontainsguess; 
				String guesses = ""; 
				boolean guessinword; 

				while (wrong < MAXWRONG  && word1.contains("_")) { 
					System.out.println(word1); 
					int temp = MAXWRONG - wrong; 
					if (wrong <= MAXWRONG) { 
						System.out.println("You have " + temp + " guesses left."); 
					} 
					
					System.out.print("Your Guess:"); 
					guess = input.nextLine(); 
					guess = guess.toUpperCase();
					letter = guess.charAt(0); 
					
					
					if (guess.equals("hint")) {
						System.out.println("Category is 'Animals' ");
					}
					
					
					guessescontainsguess = (guesses.indexOf(letter)) != -1; 
					guesses += letter; 

					letter = Character.toUpperCase(letter); 
					System.out.println(); 

					if (guessescontainsguess == true) { 
						System.out.println("You already guessed "+ letter + "."); 
						continue;
					} 

					guessinword = (word.indexOf(letter)) != -1; 

					if (guessinword == true) { 
						System.out.println(letter + " is present in the word."); 

						for (int position = 0; 
							position < word.length(); position++) { 
							if (word.charAt(position) == letter 
								&& word1.charAt(position) 
									!= letter) { 

								word1 = word1.replaceAll("_ ", "_"); 
								String word2; 
								word2 = word1.substring(0, position) 
										+ letter 
										+ word1.substring(position 
														+ 1); 
								word2 = word2.replaceAll("_", "_ "); 
								word1 = word2; 
							} 
						} 
					} 

					
					else { 
						System.out.println(letter + " is not present in the word."); 
						wrong++; 
					}
					guessCount++; 
				}  

				if (wrong == MAXWRONG) { 
					System.out.println( "YOU LOST!, maximum limit of incorrect guesses reached.");
				} 
				
				else { 
					System.out.println( "The word is: " + word);
					System.out.println("Well Played, you did it in "+ guessCount + " guesses!!");
					}
				} 
	
		public static void main(String[] args) { 
				hangman(); 
			} 
}

