/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deckofcards;

import java.util.Scanner;

/**
 *
 * @author 1styrGroupC
 */
public class DeckOfCards {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        App app = new App();
        while (true)
        {
        System.out.println("________________This is the Menu_______________");
        System.out.println("|                 1 - Create                   |");
        System.out.println("|                 2 - Shuffle                  |");
        System.out.println("|                 3 - Deal                     |");
        System.out.println("|                 4 - Display                  |");
        System.out.println("_______________________________________________");
        
            switch(app.Choice(input))
            {
                case "1":
                    app.CreateDeck();
                    break;
                case "2":
                    app.ShuffleDeck();
                    break;
                case "3":
                    System.out.println("How Many? ");
                    app.Deal(input.nextInt());
                    break;
                case "4":
                    app.DisplayDeck();
                    
                    break;
            }
            System.out.println("\n");
        }
        
    }
    
}
