/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deckofcards;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author 1styrGroupC
 */
public class App {

    private static final String SUITS[] = {"C", "D", "H", "S"};
    private  static final String RANKS[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private final ArrayList<Card> cards;

    public App() {
        this.cards = new ArrayList<>();
    }

    String Choice(Scanner in) {
        System.out.print("Enter your choice: ");
        return in.nextLine();
    }

    void CreateDeck() {
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                Card myCard = new Card(suit, rank);
                this.cards.add(myCard);
            }
        }
        System.out.println("Deck of Cards has been created!");
    }

    void ShuffleDeck() {
        if (!this.cards.isEmpty()){
            Collections.shuffle(this.cards);
            System.out.println("Cards has been Shuffled!!");

        }else{
            System.out.println("Nothing to shuffle!"+"\nCreate Your Deck of Cards first!");
        }
    }

    void Deal(int nextInt) {
        if(!this.cards.isEmpty()){
            if (nextInt > this.cards.size()){
                System.out.println("Insufficient Cards!"+"\nYou only have : "+ this.cards.size()+ " cards");
            }else if(nextInt < 0){
                System.out.println("Error! Please Enter Positive Value!");
            }else{
                int ndx = 0;
                while(nextInt != ndx){
                    System.out.println(this.cards.get(ndx).displayCard());
                    this.cards.remove(ndx);
                    nextInt--;
                }
                System.out.println("Done dealing!");
            }
        }else{
            System.out.println("Nothing to deal!!!");
        }
        

    }

    void DisplayDeck() {
        
        if (!this.cards.isEmpty()){
            for (int i = 0; i < this.cards.size(); i++) {
                System.out.println(this.cards.get(i).displayCard());
            }
            System.out.println(this.cards.size());
        }else{
            System.out.println("Nothing to Display!"+"\nCreate Your Deck of Cards First!");
        }
    }

}
