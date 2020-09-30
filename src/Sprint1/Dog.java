package Sprint1;

import javax.swing.*;

/**
 * Created by Peter Almgren
 * Date: 2020-09-30
 * Time: 08:17
 * Project: ObjectorientedJava
 * Copyright: MIT
 */
public class Dog extends Animals{
    //Instans av Enum HUNDFODER
    animalFood dogFood = animalFood.HUNDFODER;

    public Dog(String name, int weight) {
        super(name, weight);

    }

    @Override
    public void getFood() {

        String s = (this.weight * 1000) /100 + " gram " + dogFood.matnamn;
        JOptionPane.showMessageDialog(null,s);

    }
}
