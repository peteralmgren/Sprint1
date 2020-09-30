package Sprint1;

import javax.swing.*;

/**
 * Created by Peter Almgren
 * Date: 2020-09-30
 * Time: 08:40
 * Project: ObjectorientedJava
 * Copyright: MIT
 */
public class Main {
    public static void main(String[] args) {

        Animals dog1 = new Dog("Sixten",5);
        Animals dog2 = new Dog("Dogge",10);
        Animals cat1 = new Cat("Venus",5);
        Animals cat2 = new Cat("Ove",3);
        Animals snake = new Snake("Hypno",1);
        
        String input= JOptionPane.showInputDialog(null,"Vilket djur ska få mat?");
        if (input == null) {
            System.out.println("Du har valt att avsluta programmet");
            System.exit(0);
        }

        switch (input) {
            case "Sixten", "sixten" -> dog1.getFood();
            case "Dogge", "dogge" -> dog2.getFood();
            case "Venus", "venus" -> cat1.getFood();
            case "Ove", "ove" -> cat2.getFood();
            case "Hypno", "hypno" -> snake.getFood();
            default -> JOptionPane.showMessageDialog(null, "Du har inte skrivit in korrekt djurnamn");
        }


    }
}
