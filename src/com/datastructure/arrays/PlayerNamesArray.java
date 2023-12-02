package com.datastructure.arrays;

import java.util.Scanner;

//This app will ask the user to enter the player names n times and create an array of those players
public class PlayerNamesArray {

	public static void main(String[] args) {
		
		//create a scanner object
		Scanner scanner = new Scanner(System.in);
		//ask user how many players to create
		System.out.println("How many players would you like to create");
		//assign the user input to an integer var
		int noOfPlayers = scanner.nextInt();
		//create a string array of players to hold the players
		String [] players = new String [noOfPlayers];
		//loop through no of players to add players into the array
		for(int i = 0; i < noOfPlayers; i++ ) {
			
			System.out.println("Enter player name");
			players[i] = scanner.next();
			
		}
		//display added players in the array
		for(String player : players) {
			
			System.out.println(player);
			
		}
		
		
	}
	
}
